package org.oxycblt.auxio.detail

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class GenreDetailFragmentArgs(
  public val genreId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("genreId", this.genreId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("genreId", this.genreId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): GenreDetailFragmentArgs {
      bundle.setClassLoader(GenreDetailFragmentArgs::class.java.classLoader)
      val __genreId : Long
      if (bundle.containsKey("genreId")) {
        __genreId = bundle.getLong("genreId")
      } else {
        throw IllegalArgumentException("Required argument \"genreId\" is missing and does not have an android:defaultValue")
      }
      return GenreDetailFragmentArgs(__genreId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): GenreDetailFragmentArgs {
      val __genreId : Long?
      if (savedStateHandle.contains("genreId")) {
        __genreId = savedStateHandle["genreId"]
        if (__genreId == null) {
          throw IllegalArgumentException("Argument \"genreId\" of type long does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"genreId\" is missing and does not have an android:defaultValue")
      }
      return GenreDetailFragmentArgs(__genreId)
    }
  }
}
