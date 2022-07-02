package org.oxycblt.auxio

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.Long

public class MainFragmentDirections private constructor() {
  private data class ActionShowDetails(
    public val songId: Long
  ) : NavDirections {
    public override val actionId: Int = R.id.action_show_details

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putLong("songId", this.songId)
        return result
      }
  }

  public companion object {
    public fun actionShowQueue(): NavDirections = ActionOnlyNavDirections(R.id.action_show_queue)

    public fun actionShowSettings(): NavDirections =
        ActionOnlyNavDirections(R.id.action_show_settings)

    public fun actionShowAbout(): NavDirections = ActionOnlyNavDirections(R.id.action_show_about)

    public fun actionShowDetails(songId: Long): NavDirections = ActionShowDetails(songId)
  }
}
