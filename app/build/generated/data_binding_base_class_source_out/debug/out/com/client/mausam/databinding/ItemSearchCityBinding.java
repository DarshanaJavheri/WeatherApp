// Generated by view binder compiler. Do not edit!
package com.client.mausam.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.client.mausam.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemSearchCityBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView cityCountry;

  @NonNull
  public final TextView cityLat;

  @NonNull
  public final TextView cityLon;

  @NonNull
  public final TextView cityName;

  @NonNull
  public final TextView cityRegion;

  @NonNull
  public final CardView mainLayout;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  private ItemSearchCityBinding(@NonNull CardView rootView, @NonNull TextView cityCountry,
      @NonNull TextView cityLat, @NonNull TextView cityLon, @NonNull TextView cityName,
      @NonNull TextView cityRegion, @NonNull CardView mainLayout, @NonNull TextView textView2,
      @NonNull TextView textView3) {
    this.rootView = rootView;
    this.cityCountry = cityCountry;
    this.cityLat = cityLat;
    this.cityLon = cityLon;
    this.cityName = cityName;
    this.cityRegion = cityRegion;
    this.mainLayout = mainLayout;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSearchCityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSearchCityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_search_city, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSearchCityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.city_country;
      TextView cityCountry = ViewBindings.findChildViewById(rootView, id);
      if (cityCountry == null) {
        break missingId;
      }

      id = R.id.city_lat;
      TextView cityLat = ViewBindings.findChildViewById(rootView, id);
      if (cityLat == null) {
        break missingId;
      }

      id = R.id.city_lon;
      TextView cityLon = ViewBindings.findChildViewById(rootView, id);
      if (cityLon == null) {
        break missingId;
      }

      id = R.id.city_name;
      TextView cityName = ViewBindings.findChildViewById(rootView, id);
      if (cityName == null) {
        break missingId;
      }

      id = R.id.city_region;
      TextView cityRegion = ViewBindings.findChildViewById(rootView, id);
      if (cityRegion == null) {
        break missingId;
      }

      CardView mainLayout = (CardView) rootView;

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new ItemSearchCityBinding((CardView) rootView, cityCountry, cityLat, cityLon, cityName,
          cityRegion, mainLayout, textView2, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
