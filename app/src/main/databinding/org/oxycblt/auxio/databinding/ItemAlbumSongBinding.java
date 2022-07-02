// Generated by view binder compiler. Do not edit!
package org.oxycblt.auxio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.oxycblt.auxio.R;
import org.oxycblt.auxio.image.ImageGroup;

public final class ItemAlbumSongBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView songDuration;

  @NonNull
  public final TextView songName;

  @NonNull
  public final TextView songTrack;

  @NonNull
  public final ImageGroup songTrackBg;

  private ItemAlbumSongBinding(@NonNull ConstraintLayout rootView, @NonNull TextView songDuration,
      @NonNull TextView songName, @NonNull TextView songTrack, @NonNull ImageGroup songTrackBg) {
    this.rootView = rootView;
    this.songDuration = songDuration;
    this.songName = songName;
    this.songTrack = songTrack;
    this.songTrackBg = songTrackBg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemAlbumSongBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemAlbumSongBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_album_song, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemAlbumSongBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.song_duration;
      TextView songDuration = ViewBindings.findChildViewById(rootView, id);
      if (songDuration == null) {
        break missingId;
      }

      id = R.id.song_name;
      TextView songName = ViewBindings.findChildViewById(rootView, id);
      if (songName == null) {
        break missingId;
      }

      id = R.id.song_track;
      TextView songTrack = ViewBindings.findChildViewById(rootView, id);
      if (songTrack == null) {
        break missingId;
      }

      id = R.id.song_track_bg;
      ImageGroup songTrackBg = ViewBindings.findChildViewById(rootView, id);
      if (songTrackBg == null) {
        break missingId;
      }

      return new ItemAlbumSongBinding((ConstraintLayout) rootView, songDuration, songName,
          songTrack, songTrackBg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
