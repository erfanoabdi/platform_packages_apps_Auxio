package org.oxycblt.auxio.home

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.Long
import org.oxycblt.auxio.R

public class HomeFragmentDirections private constructor() {
  private data class ActionShowGenre(
    public val genreId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_show_genre

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("genreId", this.genreId)
        return result
      }
  }

  private data class ActionShowArtist(
    public val artistId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_show_artist

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("artistId", this.artistId)
        return result
      }
  }

  private data class ActionShowAlbum(
    public val albumId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_show_album

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("albumId", this.albumId)
        return result
      }
  }

  public companion object {
    public fun actionShowSearch(): NavDirections = ActionOnlyNavDirections(R.id.action_show_search)

    public fun actionShowGenre(genreId: Long): NavDirections = ActionShowGenre(genreId)

    public fun actionShowArtist(artistId: Long): NavDirections = ActionShowArtist(artistId)

    public fun actionShowAlbum(albumId: Long): NavDirections = ActionShowAlbum(albumId)
  }
}
