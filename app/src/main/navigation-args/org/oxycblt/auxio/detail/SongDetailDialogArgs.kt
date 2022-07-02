package org.oxycblt.auxio.detail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class SongDetailDialogArgs(
  public val songId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("songId", this.songId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("songId", this.songId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SongDetailDialogArgs {
      bundle.setClassLoader(SongDetailDialogArgs::class.java.classLoader)
      val __songId : Long
      if (bundle.containsKey("songId")) {
        __songId = bundle.getLong("songId")
      } else {
        throw IllegalArgumentException("Required argument \"songId\" is missing and does not have an android:defaultValue")
      }
      return SongDetailDialogArgs(__songId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SongDetailDialogArgs {
      val __songId : Long?
      if (savedStateHandle.contains("songId")) {
        __songId = savedStateHandle["songId"]
        if (__songId == null) {
          throw IllegalArgumentException("Argument \"songId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"songId\" is missing and does not have an android:defaultValue")
      }
      return SongDetailDialogArgs(__songId)
    }
  }
}
