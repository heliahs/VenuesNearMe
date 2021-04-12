package com.hh.coffeevenues.ui.firstPape

import android.Manifest
import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.location.Location
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.CancellationTokenSource
import com.google.android.gms.tasks.Task
import com.hh.coffeevenues.ui.hasPermission



class FirstPageViewModel ( application: Application) : AndroidViewModel(application) {
private val myContext = application.applicationContext
    private val _currentLocation: MutableLiveData<String> = MutableLiveData()
    val currentLocation: LiveData<String>
        get() = _currentLocation

    private val fusedLocationClient: FusedLocationProviderClient by lazy {
        LocationServices.getFusedLocationProviderClient(myContext)
    }


    private var cancellationTokenSource = CancellationTokenSource()


      @SuppressLint("MissingPermission")
       fun requestCurrentLocation() {

          if (myContext.hasPermission(Manifest.permission.ACCESS_FINE_LOCATION)) {

              val currentLocationTask: Task<Location> = fusedLocationClient.getCurrentLocation(
                  LocationRequest.PRIORITY_HIGH_ACCURACY,
                 cancellationTokenSource.token
              )

              currentLocationTask.addOnCompleteListener { task: Task<Location> ->
                  val result = if (task.isSuccessful && task.result != null) {
                      val result: Location = task.result
                      "${result.latitude},${result.longitude}"
                  } else {
                      val exception = task.exception
                      "Location (failure): $exception"
                  }
                  _currentLocation.value = result
              }
          }
      }
}