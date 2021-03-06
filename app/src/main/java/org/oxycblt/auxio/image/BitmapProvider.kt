/*
 * Copyright (c) 2022 Auxio Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
 
package org.oxycblt.auxio.image

import android.content.Context
import android.graphics.Bitmap
import androidx.core.graphics.drawable.toBitmap
import coil.imageLoader
import coil.request.Disposable
import coil.request.ImageRequest
import coil.size.Size
import org.oxycblt.auxio.music.Song

/**
 * A utility to provide bitmaps in a manner less prone to race conditions.
 *
 * Pretty much each service component needs to load bitmaps of some kind, but doing a blind image
 * request with some target callbacks could result in overlapping requests causing unrelated
 * updates. This class (to an extent) resolves this by keeping track of the current request and
 * disposing of it every time a new request is created. This greatly reduces the surface for race
 * conditions.
 *
 * @author OxygenCobalt
 */
class BitmapProvider(private val context: Context) {
    private var currentRequest: Request? = null
    private var currentGeneration = 0L

    /** If this provider is currently attempting to load something. */
    val isBusy: Boolean
        get() = currentRequest?.run { !disposable.isDisposed } ?: false

    /**
     * Load a bitmap from [song]. [target] should be a new object, not a reference to an existing
     * callback.
     */
    fun load(song: Song, target: Target) {
        // Increment the generation value so that previous requests are invalidated.
        // This is a second safeguard to mitigate instruction-by-instruction race conditions.
        val generation = synchronized(this) { ++currentGeneration }

        currentRequest?.run { disposable.dispose() }
        currentRequest = null

        val request =
            target.onConfigRequest(
                ImageRequest.Builder(context)
                    .data(song)
                    .size(Size.ORIGINAL)
                    .target(
                        onSuccess = {
                            if (generation == currentGeneration) {
                                target.onCompleted(it.toBitmap())
                            }
                        },
                        onError = {
                            if (generation == currentGeneration) {
                                target.onCompleted(null)
                            }
                        })
                    .transformations(SquareFrameTransform.INSTANCE))

        currentRequest = Request(context.imageLoader.enqueue(request.build()), target)
    }

    /**
     * Release this instance, canceling all image load jobs. This should be ran when the object is
     * no longer used.
     */
    fun release() {
        currentRequest?.run { disposable.dispose() }
        currentRequest = null
    }

    private data class Request(val disposable: Disposable, val callback: Target)

    /** Represents the target for a request. */
    interface Target {
        /** Modify the default request with custom attributes. */
        fun onConfigRequest(builder: ImageRequest.Builder): ImageRequest.Builder = builder

        /**
         * Called when the loading process is completed. [bitmap] will be null if there was an
         * error.
         */
        fun onCompleted(bitmap: Bitmap?)
    }
}
