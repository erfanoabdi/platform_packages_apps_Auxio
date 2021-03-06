// Generated by view binder compiler. Do not edit!
package org.oxycblt.auxio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
import org.oxycblt.auxio.image.StyledImageView;

public final class ItemDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final StyledImageView detailCover;

  @NonNull
  public final TextView detailInfo;

  @NonNull
  public final TextView detailName;

  @NonNull
  public final Button detailPlayButton;

  @NonNull
  public final Button detailShuffleButton;

  @NonNull
  public final TextView detailSubhead;

  private ItemDetailBinding(@NonNull ConstraintLayout rootView,
      @NonNull StyledImageView detailCover, @NonNull TextView detailInfo,
      @NonNull TextView detailName, @NonNull Button detailPlayButton,
      @NonNull Button detailShuffleButton, @NonNull TextView detailSubhead) {
    this.rootView = rootView;
    this.detailCover = detailCover;
    this.detailInfo = detailInfo;
    this.detailName = detailName;
    this.detailPlayButton = detailPlayButton;
    this.detailShuffleButton = detailShuffleButton;
    this.detailSubhead = detailSubhead;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.detail_cover;
      StyledImageView detailCover = ViewBindings.findChildViewById(rootView, id);
      if (detailCover == null) {
        break missingId;
      }

      id = R.id.detail_info;
      TextView detailInfo = ViewBindings.findChildViewById(rootView, id);
      if (detailInfo == null) {
        break missingId;
      }

      id = R.id.detail_name;
      TextView detailName = ViewBindings.findChildViewById(rootView, id);
      if (detailName == null) {
        break missingId;
      }

      id = R.id.detail_play_button;
      Button detailPlayButton = ViewBindings.findChildViewById(rootView, id);
      if (detailPlayButton == null) {
        break missingId;
      }

      id = R.id.detail_shuffle_button;
      Button detailShuffleButton = ViewBindings.findChildViewById(rootView, id);
      if (detailShuffleButton == null) {
        break missingId;
      }

      id = R.id.detail_subhead;
      TextView detailSubhead = ViewBindings.findChildViewById(rootView, id);
      if (detailSubhead == null) {
        break missingId;
      }

      return new ItemDetailBinding((ConstraintLayout) rootView, detailCover, detailInfo, detailName,
          detailPlayButton, detailShuffleButton, detailSubhead);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
