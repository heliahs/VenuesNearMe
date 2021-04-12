package com.hh.coffeevenues.ui.firstPape;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.hh.coffeevenues.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FirstPageFragmentDirections {
  private FirstPageFragmentDirections() {
  }

  @NonNull
  public static ActionGoToVenuesList actionGoToVenuesList(@NonNull String location) {
    return new ActionGoToVenuesList(location);
  }

  public static class ActionGoToVenuesList implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionGoToVenuesList(@NonNull String location) {
      if (location == null) {
        throw new IllegalArgumentException("Argument \"location\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("location", location);
    }

    @NonNull
    public ActionGoToVenuesList setLocation(@NonNull String location) {
      if (location == null) {
        throw new IllegalArgumentException("Argument \"location\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("location", location);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("location")) {
        String location = (String) arguments.get("location");
        __result.putString("location", location);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_go_to_venues_list;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getLocation() {
      return (String) arguments.get("location");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGoToVenuesList that = (ActionGoToVenuesList) object;
      if (arguments.containsKey("location") != that.arguments.containsKey("location")) {
        return false;
      }
      if (getLocation() != null ? !getLocation().equals(that.getLocation()) : that.getLocation() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getLocation() != null ? getLocation().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGoToVenuesList(actionId=" + getActionId() + "){"
          + "location=" + getLocation()
          + "}";
    }
  }
}
