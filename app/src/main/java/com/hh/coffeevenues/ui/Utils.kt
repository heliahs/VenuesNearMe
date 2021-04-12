package com.hh.coffeevenues.ui

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.hh.coffeevenues.data.Resource

fun Context.hasPermission(permission: String): Boolean {


    if (permission == Manifest.permission.ACCESS_BACKGROUND_LOCATION &&
        android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.Q) {
        return true
    }

    return ActivityCompat.checkSelfPermission(this, permission) ==
            PackageManager.PERMISSION_GRANTED
}

fun Fragment.requestPermissionWithRationale(
    permission: String,
    requestCode: Int,
    snackbar: Snackbar
) {
    val provideRationale = shouldShowRequestPermissionRationale(permission)

    if (provideRationale) {
        snackbar.show()
    } else {
        requestPermissions(arrayOf(permission), requestCode)
    }
}

fun Fragment.handleApiError(
    failure: Resource.Failure
) {
    when {
        //@todo add retry with snackbar
        failure.isNetworkError -> {
            Toast.makeText(
                requireContext(),
                "Please check your internet connection",
                Toast.LENGTH_LONG
            ).show()
        }

        else -> {
            val error = failure.errorBody?.string().toString()
            Toast.makeText(requireContext(), error, Toast.LENGTH_LONG).show()

        }
    }
}


