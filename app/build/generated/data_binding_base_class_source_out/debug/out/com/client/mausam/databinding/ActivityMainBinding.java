// Generated by view binder compiler. Do not edit!
package com.client.mausam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.client.mausam.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appbarLayout;

  @NonNull
  public final RecyclerView cityRview;

  @NonNull
  public final AppCompatEditText edtSearch;

  @NonNull
  public final CollapsingToolbarLayout mainCollapsing;

  @NonNull
  public final LinearLayout searchArea;

  private ActivityMainBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appbarLayout, @NonNull RecyclerView cityRview,
      @NonNull AppCompatEditText edtSearch, @NonNull CollapsingToolbarLayout mainCollapsing,
      @NonNull LinearLayout searchArea) {
    this.rootView = rootView;
    this.appbarLayout = appbarLayout;
    this.cityRview = cityRview;
    this.edtSearch = edtSearch;
    this.mainCollapsing = mainCollapsing;
    this.searchArea = searchArea;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar_layout;
      AppBarLayout appbarLayout = ViewBindings.findChildViewById(rootView, id);
      if (appbarLayout == null) {
        break missingId;
      }

      id = R.id.city_rview;
      RecyclerView cityRview = ViewBindings.findChildViewById(rootView, id);
      if (cityRview == null) {
        break missingId;
      }

      id = R.id.edtSearch;
      AppCompatEditText edtSearch = ViewBindings.findChildViewById(rootView, id);
      if (edtSearch == null) {
        break missingId;
      }

      id = R.id.main_collapsing;
      CollapsingToolbarLayout mainCollapsing = ViewBindings.findChildViewById(rootView, id);
      if (mainCollapsing == null) {
        break missingId;
      }

      id = R.id.searchArea;
      LinearLayout searchArea = ViewBindings.findChildViewById(rootView, id);
      if (searchArea == null) {
        break missingId;
      }

      return new ActivityMainBinding((CoordinatorLayout) rootView, appbarLayout, cityRview,
          edtSearch, mainCollapsing, searchArea);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
