// Generated by view binder compiler. Do not edit!
package org.oxycblt.auxio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.oxycblt.auxio.R;

public final class WidgetThinBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout background;

  @NonNull
  public final TextView widgetArtist;

  @NonNull
  public final ImageView widgetAspectRatio;

  @NonNull
  public final ImageView widgetCover;

  @NonNull
  public final LinearLayout widgetPanel;

  @NonNull
  public final ImageButton widgetPlayPause;

  @NonNull
  public final TextView widgetSong;

  private WidgetThinBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout background,
      @NonNull TextView widgetArtist, @NonNull ImageView widgetAspectRatio,
      @NonNull ImageView widgetCover, @NonNull LinearLayout widgetPanel,
      @NonNull ImageButton widgetPlayPause, @NonNull TextView widgetSong) {
    this.rootView = rootView;
    this.background = background;
    this.widgetArtist = widgetArtist;
    this.widgetAspectRatio = widgetAspectRatio;
    this.widgetCover = widgetCover;
    this.widgetPanel = widgetPanel;
    this.widgetPlayPause = widgetPlayPause;
    this.widgetSong = widgetSong;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WidgetThinBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WidgetThinBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.widget_thin, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WidgetThinBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout background = (LinearLayout) rootView;

      id = R.id.widget_artist;
      TextView widgetArtist = ViewBindings.findChildViewById(rootView, id);
      if (widgetArtist == null) {
        break missingId;
      }

      id = R.id.widget_aspect_ratio;
      ImageView widgetAspectRatio = ViewBindings.findChildViewById(rootView, id);
      if (widgetAspectRatio == null) {
        break missingId;
      }

      id = R.id.widget_cover;
      ImageView widgetCover = ViewBindings.findChildViewById(rootView, id);
      if (widgetCover == null) {
        break missingId;
      }

      id = R.id.widget_panel;
      LinearLayout widgetPanel = ViewBindings.findChildViewById(rootView, id);
      if (widgetPanel == null) {
        break missingId;
      }

      id = R.id.widget_play_pause;
      ImageButton widgetPlayPause = ViewBindings.findChildViewById(rootView, id);
      if (widgetPlayPause == null) {
        break missingId;
      }

      id = R.id.widget_song;
      TextView widgetSong = ViewBindings.findChildViewById(rootView, id);
      if (widgetSong == null) {
        break missingId;
      }

      return new WidgetThinBinding((LinearLayout) rootView, background, widgetArtist,
          widgetAspectRatio, widgetCover, widgetPanel, widgetPlayPause, widgetSong);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}