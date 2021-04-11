// Generated by data binding compiler. Do not edit!
package com.hh.coffeevenues.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.hh.coffeevenues.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FirstPageBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout container;

  @NonNull
  public final Button getLocation;

  protected FirstPageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout container, Button getLocation) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
    this.getLocation = getLocation;
  }

  @NonNull
  public static FirstPageBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.first_page, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FirstPageBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FirstPageBinding>inflateInternal(inflater, R.layout.first_page, root, attachToRoot, component);
  }

  @NonNull
  public static FirstPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.first_page, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FirstPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FirstPageBinding>inflateInternal(inflater, R.layout.first_page, null, false, component);
  }

  public static FirstPageBinding bind(@NonNull View view) {
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
  public static FirstPageBinding bind(@NonNull View view, @Nullable Object component) {
    return (FirstPageBinding)bind(component, view, R.layout.first_page);
  }
}