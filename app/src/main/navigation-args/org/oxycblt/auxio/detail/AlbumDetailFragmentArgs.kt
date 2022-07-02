package org.oxycblt.auxio.detail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class AlbumDetailFragmentArgs(
  public val albumId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("albumId", this.albumId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("albumId", this.albumId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AlbumDetailFragmentArgs {
      bundle.setClassLoader(AlbumDetailFragmentArgs::class.java.classLoader)
      val __albumId : Long
      if (bundle.containsKey("albumId")) {
        __albumId = bundle.getLong("albumId")
      } else {
        throw IllegalArgumentException("Required argument \"albumId\" is missing and does not have an android:defaultValue")
      }
      return AlbumDetailFragmentArgs(__albumId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AlbumDetailFragmentArgs {
      val __albumId : Long?
      if (savedStateHandle.contains("albumId")) {
        __albumId = savedStateHandle["albumId"]
        if (__albumId == null) {
          throw IllegalArgumentException("Argument \"albumId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"albumId\" is missing and does not have an android:defaultValue")
      }
      return AlbumDetailFragmentArgs(__albumId)
    }
  }
}
