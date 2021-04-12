package com.hh.coffeevenues.ui.vanuesList

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hh.coffeevenues.data.Resource
import com.hh.coffeevenues.data.models.VenuesResponse
import com.hh.coffeevenues.data.repositories.VenuesListRepository
import kotlinx.coroutines.launch
import okhttp3.ResponseBody


class VenuesListViewModel @ViewModelInject constructor(
    private val repository: VenuesListRepository
) : ViewModel() {

    private val _venues: MutableLiveData<Resource<VenuesResponse>> = MutableLiveData()
    val venues: LiveData<Resource<VenuesResponse>>
        get() = _venues


    fun getVenues(location: String) = viewModelScope.launch {
        _venues.value = Resource.Loading
        _venues.value = repository.getVenues(location)
    }
}