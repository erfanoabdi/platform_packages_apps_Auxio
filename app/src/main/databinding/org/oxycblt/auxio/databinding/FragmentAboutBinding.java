// Generated by view binder compiler. Do not edit!
package org.oxycblt.auxio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.oxycblt.auxio.R;
import org.oxycblt.auxio.ui.coordinator.EdgeAppBarLayout;
import org.oxycblt.auxio.ui.coordinator.EdgeCoordinatorLayout;

public final class FragmentAboutBinding implements ViewBinding {
  @NonNull
  private final EdgeCoordinatorLayout rootView;

  @NonNull
  public final TextView aboutAlbumCount;

  @NonNull
  public final TextView aboutAppName;

  @NonNull
  public final EdgeAppBarLayout aboutAppbar;

  @NonNull
  public final TextView aboutArtistCount;

  @NonNull
  public final ImageView aboutAuxioIcon;

  @NonNull
  public final TextView aboutCode;

  @NonNull
  public final NestedScrollView aboutContents;

  @NonNull
  public final TextView aboutDesc;

  @NonNull
  public final TextView aboutFaq;

  @NonNull
  public final TextView aboutGenreCount;

  @NonNull
  public final TextView aboutLibraryCounts;

  @NonNull
  public final TextView aboutLicenses;

  @NonNull
  public final TextView aboutSongCount;

  @NonNull
  public final MaterialToolbar aboutToolbar;

  @NonNull
  public final TextView aboutTotalDuration;

  @NonNull
  public final TextView aboutVersion;

  @NonNull
  public final ImageView aboutVersionIcon;

  @NonNull
  public final TextView aboutVersionTitle;

  @NonNull
  public final ConstraintLayout versionContainer;

  private FragmentAboutBinding(@NonNull EdgeCoordinatorLayout rootView,
      @NonNull TextView aboutAlbumCount, @NonNull TextView aboutAppName,
      @NonNull EdgeAppBarLayout aboutAppbar, @NonNull TextView aboutArtistCount,
      @NonNull ImageView aboutAuxioIcon, @NonNull TextView aboutCode,
      @NonNull NestedScrollView aboutContents, @NonNull TextView aboutDesc,
      @NonNull TextView aboutFaq, @NonNull TextView aboutGenreCount,
      @NonNull TextView aboutLibraryCounts, @NonNull TextView aboutLicenses,
      @NonNull TextView aboutSongCount, @NonNull MaterialToolbar aboutToolbar,
      @NonNull TextView aboutTotalDuration, @NonNull TextView aboutVersion,
      @NonNull ImageView aboutVersionIcon, @NonNull TextView aboutVersionTitle,
      @NonNull ConstraintLayout versionContainer) {
    this.rootView = rootView;
    this.aboutAlbumCount = aboutAlbumCount;
    this.aboutAppName = aboutAppName;
    this.aboutAppbar = aboutAppbar;
    this.aboutArtistCount = aboutArtistCount;
    this.aboutAuxioIcon = aboutAuxioIcon;
    this.aboutCode = aboutCode;
    this.aboutContents = aboutContents;
    this.aboutDesc = aboutDesc;
    this.aboutFaq = aboutFaq;
    this.aboutGenreCount = aboutGenreCount;
    this.aboutLibraryCounts = aboutLibraryCounts;
    this.aboutLicenses = aboutLicenses;
    this.aboutSongCount = aboutSongCount;
    this.aboutToolbar = aboutToolbar;
    this.aboutTotalDuration = aboutTotalDuration;
    this.aboutVersion = aboutVersion;
    this.aboutVersionIcon = aboutVersionIcon;
    this.aboutVersionTitle = aboutVersionTitle;
    this.versionContainer = versionContainer;
  }

  @Override
  @NonNull
  public EdgeCoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_album_count;
      TextView aboutAlbumCount = ViewBindings.findChildViewById(rootView, id);
      if (aboutAlbumCount == null) {
        break missingId;
      }

      id = R.id.about_app_name;
      TextView aboutAppName = ViewBindings.findChildViewById(rootView, id);
      if (aboutAppName == null) {
        break missingId;
      }

      id = R.id.about_appbar;
      EdgeAppBarLayout aboutAppbar = ViewBindings.findChildViewById(rootView, id);
      if (aboutAppbar == null) {
        break missingId;
      }

      id = R.id.about_artist_count;
      TextView aboutArtistCount = ViewBindings.findChildViewById(rootView, id);
      if (aboutArtistCount == null) {
        break missingId;
      }

      id = R.id.about_auxio_icon;
      ImageView aboutAuxioIcon = ViewBindings.findChildViewById(rootView, id);
      if (aboutAuxioIcon == null) {
        break missingId;
      }

      id = R.id.about_code;
      TextView aboutCode = ViewBindings.findChildViewById(rootView, id);
      if (aboutCode == null) {
        break missingId;
      }

      id = R.id.about_contents;
      NestedScrollView aboutContents = ViewBindings.findChildViewById(rootView, id);
      if (aboutContents == null) {
        break missingId;
      }

      id = R.id.about_desc;
      TextView aboutDesc = ViewBindings.findChildViewById(rootView, id);
      if (aboutDesc == null) {
        break missingId;
      }

      id = R.id.about_faq;
      TextView aboutFaq = ViewBindings.findChildViewById(rootView, id);
      if (aboutFaq == null) {
        break missingId;
      }

      id = R.id.about_genre_count;
      TextView aboutGenreCount = ViewBindings.findChildViewById(rootView, id);
      if (aboutGenreCount == null) {
        break missingId;
      }

      id = R.id.about_library_counts;
      TextView aboutLibraryCounts = ViewBindings.findChildViewById(rootView, id);
      if (aboutLibraryCounts == null) {
        break missingId;
      }

      id = R.id.about_licenses;
      TextView aboutLicenses = ViewBindings.findChildViewById(rootView, id);
      if (aboutLicenses == null) {
        break missingId;
      }

      id = R.id.about_song_count;
      TextView aboutSongCount = ViewBindings.findChildViewById(rootView, id);
      if (aboutSongCount == null) {
        break missingId;
      }

      id = R.id.about_toolbar;
      MaterialToolbar aboutToolbar = ViewBindings.findChildViewById(rootView, id);
      if (aboutToolbar == null) {
        break missingId;
      }

      id = R.id.about_total_duration;
      TextView aboutTotalDuration = ViewBindings.findChildViewById(rootView, id);
      if (aboutTotalDuration == null) {
        break missingId;
      }

      id = R.id.about_version;
      TextView aboutVersion = ViewBindings.findChildViewById(rootView, id);
      if (aboutVersion == null) {
        break missingId;
      }

      id = R.id.about_version_icon;
      ImageView aboutVersionIcon = ViewBindings.findChildViewById(rootView, id);
      if (aboutVersionIcon == null) {
        break missingId;
      }

      id = R.id.about_version_title;
      TextView aboutVersionTitle = ViewBindings.findChildViewById(rootView, id);
      if (aboutVersionTitle == null) {
        break missingId;
      }

      id = R.id.version_container;
      ConstraintLayout versionContainer = ViewBindings.findChildViewById(rootView, id);
      if (versionContainer == null) {
        break missingId;
      }

      return new FragmentAboutBinding((EdgeCoordinatorLayout) rootView, aboutAlbumCount,
          aboutAppName, aboutAppbar, aboutArtistCount, aboutAuxioIcon, aboutCode, aboutContents,
          aboutDesc, aboutFaq, aboutGenreCount, aboutLibraryCounts, aboutLicenses, aboutSongCount,
          aboutToolbar, aboutTotalDuration, aboutVersion, aboutVersionIcon, aboutVersionTitle,
          versionContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}