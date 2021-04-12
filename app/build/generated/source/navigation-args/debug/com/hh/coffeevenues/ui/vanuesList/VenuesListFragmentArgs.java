package com.hh.coffeevenues.ui.vanuesList;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class VenuesListFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private VenuesListFragmentArgs() {
  }

  private VenuesListFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VenuesListFragmentArgs fromBundle(@NonNull Bundle bundle) {
    VenuesListFragmentArgs __result = new VenuesListFragmentArgs();
    bundle.setClassLoader(VenuesListFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("location")) {
      String location;
      location = bundle.getString("location");
      if (location == null) {
        throw new IllegalArgumentException("Argument \"location\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("location", location);
    } else {
      throw new IllegalArgumentException("Required argument \"location\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getLocation() {
    return (String) arguments.get("location");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("location")) {
      String location = (String) arguments.get("location");
      __result.putString("location", location);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    VenuesListFragmentArgs that = (VenuesListFragmentArgs) object;
    if (arguments.containsKey("location") != that.arguments.containsKey("location")) {
      return false;
    }
    if (getLocation() != null ? !getLocation().equals(that.getLocation()) : that.getLocation() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "VenuesListFragmentArgs{"
        + "location=" + getLocation()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(VenuesListFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String location) {
      if (location == null) {
        throw new IllegalArgumentException("Argument \"location\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("location", location);
    }

    @NonNull
    public VenuesListFragmentArgs build() {
      VenuesListFragmentArgs result = new VenuesListFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setLocation(@NonNull String location) {
      if (location == null) {
        throw new IllegalArgumentException("Argument \"location\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("location", location);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLocation() {
      return (String) arguments.get("location");
    }
  }
}
