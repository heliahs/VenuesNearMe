// Generated by data binding compiler. Do not edit!
package com.hh.coffeevenues.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.hh.coffeevenues.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class VenuesFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView loading;

  @NonNull
  public final RecyclerView recyclerView;

  protected VenuesFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView loading, RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.loading = loading;
    this.recyclerView = recyclerView;
  }

  @NonNull
  public static VenuesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.venues_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VenuesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VenuesFragmentBinding>inflateInternal(inflater, R.layout.venues_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static VenuesFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.venues_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VenuesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VenuesFragmentBinding>inflateInternal(inflater, R.layout.venues_fragment, null, false, component);
  }

  public static VenuesFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static VenuesFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (VenuesFragmentBinding)bind(component, view, R.layout.venues_fragment);
  }
}
