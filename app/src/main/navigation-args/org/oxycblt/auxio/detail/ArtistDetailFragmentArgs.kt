package org.oxycblt.auxio.detail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ArtistDetailFragmentArgs(
  public val artistId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("artistId", this.artistId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("artistId", this.artistId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ArtistDetailFragmentArgs {
      bundle.setClassLoader(ArtistDetailFragmentArgs::class.java.classLoader)
      val __artistId : Long
      if (bundle.containsKey("artistId")) {
        __artistId = bundle.getLong("artistId")
      } else {
        throw IllegalArgumentException("Required argument \"artistId\" is missing and does not have an android:defaultValue")
      }
      return ArtistDetailFragmentArgs(__artistId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): ArtistDetailFragmentArgs {
      val __artistId : Long?
      if (savedStateHandle.contains("artistId")) {
        __artistId = savedStateHandle["artistId"]
        if (__artistId == null) {
          throw IllegalArgumentException("Argument \"artistId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"artistId\" is missing and does not have an android:defaultValue")
      }
      return ArtistDetailFragmentArgs(__artistId)
    }
  }
}
