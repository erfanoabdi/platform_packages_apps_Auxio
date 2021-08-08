/*
 * Copyright (c) 2021 Auxio Project
 * Forms.kt is part of Auxio.
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

package org.oxycblt.auxio.widgets

import android.content.Context
import android.widget.RemoteViews
import androidx.annotation.LayoutRes
import org.oxycblt.auxio.R
import org.oxycblt.auxio.playback.state.LoopMode
import org.oxycblt.auxio.playback.system.PlaybackService
import org.oxycblt.auxio.ui.newBroadcastIntent
import org.oxycblt.auxio.ui.newMainIntent

private fun createViews(
    context: Context,
    @LayoutRes layout: Int,
    state: WidgetState
): RemoteViews {
    val views = RemoteViews(context.packageName, layout)

    views.setOnClickPendingIntent(
        android.R.id.background,
        context.newMainIntent()
    )

    views.setOnClickPendingIntent(
        R.id.widget_skip_prev,
        context.newBroadcastIntent(
            PlaybackService.ACTION_SKIP_PREV
        )
    )

    views.setOnClickPendingIntent(
        R.id.widget_play_pause,
        context.newBroadcastIntent(
            PlaybackService.ACTION_PLAY_PAUSE
        )
    )

    views.setOnClickPendingIntent(
        R.id.widget_skip_next,
        context.newBroadcastIntent(
            PlaybackService.ACTION_SKIP_NEXT
        )
    )

    views.setTextViewText(R.id.widget_song, state.song.name)
    views.setTextViewText(R.id.widget_artist, state.song.album.artist.name)

    views.setImageViewResource(
        R.id.widget_play_pause,
        if (state.isPlaying) {
            R.drawable.ic_pause
        } else {
            R.drawable.ic_play
        }
    )

    if (state.albumArt != null) {
        views.setImageViewBitmap(R.id.widget_cover, state.albumArt)
        views.setContentDescription(
            R.id.widget_cover, context.getString(R.string.desc_album_cover, state.song.album.name)
        )
    } else {
        views.setImageViewResource(R.id.widget_cover, R.drawable.ic_song)
        views.setContentDescription(R.id.widget_cover, context.getString(R.string.desc_no_cover))
    }

    return views
}

fun createSmallWidget(context: Context, state: WidgetState): RemoteViews {
    return createViews(context, R.layout.widget_small, state)
}

fun createFullWidget(context: Context, state: WidgetState): RemoteViews {
    val views = createViews(context, R.layout.widget_full, state)

    views.setOnClickPendingIntent(
        R.id.widget_loop,
        context.newBroadcastIntent(
            PlaybackService.ACTION_LOOP
        )
    )

    views.setOnClickPendingIntent(
        R.id.widget_shuffle,
        context.newBroadcastIntent(
            PlaybackService.ACTION_SHUFFLE
        )
    )

    // The main way the large widget differs from the other widgets is the addition of extra
    // controls. However, since the context we use to load attributes is from the main process,
    // attempting to dynamically color anything will result in an error. More duplicate
    // resources it is. This is getting really tiring.

    val shuffleRes = when {
        state.isShuffled -> R.drawable.ic_shuffle_tinted
        else -> R.drawable.ic_shuffle
    }

    val loopRes = when (state.loopMode) {
        LoopMode.NONE -> R.drawable.ic_loop
        LoopMode.ALL -> R.drawable.ic_loop_all_tinted
        LoopMode.TRACK -> R.drawable.ic_loop_one_tinted
    }

    views.setImageViewResource(R.id.widget_shuffle, shuffleRes)
    views.setImageViewResource(R.id.widget_loop, loopRes)

    return views
}