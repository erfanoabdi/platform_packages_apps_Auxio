// Generated by view binder compiler. Do not edit!
package org.oxycblt.auxio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.slider.Slider;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.oxycblt.auxio.R;

public final class ViewSeekBarBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView seekBarDuration;

  @NonNull
  public final TextView seekBarPosition;

  @NonNull
  public final Slider seekBarSlider;

  private ViewSeekBarBinding(@NonNull FrameLayout rootView, @NonNull TextView seekBarDuration,
      @NonNull TextView seekBarPosition, @NonNull Slider seekBarSlider) {
    this.rootView = rootView;
    this.seekBarDuration = seekBarDuration;
    this.seekBarPosition = seekBarPosition;
    this.seekBarSlider = seekBarSlider;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewSeekBarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewSeekBarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_seek_bar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewSeekBarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.seek_bar_duration;
      TextView seekBarDuration = ViewBindings.findChildViewById(rootView, id);
      if (seekBarDuration == null) {
        break missingId;
      }

      id = R.id.seek_bar_position;
      TextView seekBarPosition = ViewBindings.findChildViewById(rootView, id);
      if (seekBarPosition == null) {
        break missingId;
      }

      id = R.id.seek_bar_slider;
      Slider seekBarSlider = ViewBindings.findChildViewById(rootView, id);
      if (seekBarSlider == null) {
        break missingId;
      }

      return new ViewSeekBarBinding((FrameLayout) rootView, seekBarDuration, seekBarPosition,
          seekBarSlider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
