// Generated by view binder compiler. Do not edit!
package org.oxycblt.auxio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import org.oxycblt.auxio.R;
import org.oxycblt.auxio.home.fastscroll.FastScrollRecyclerView;

public final class FragmentHomeListBinding implements ViewBinding {
  @NonNull
  private final FastScrollRecyclerView rootView;

  @NonNull
  public final FastScrollRecyclerView homeRecycler;

  private FragmentHomeListBinding(@NonNull FastScrollRecyclerView rootView,
      @NonNull FastScrollRecyclerView homeRecycler) {
    this.rootView = rootView;
    this.homeRecycler = homeRecycler;
  }

  @Override
  @NonNull
  public FastScrollRecyclerView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeListBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    FastScrollRecyclerView homeRecycler = (FastScrollRecyclerView) rootView;

    return new FragmentHomeListBinding((FastScrollRecyclerView) rootView, homeRecycler);
  }
}