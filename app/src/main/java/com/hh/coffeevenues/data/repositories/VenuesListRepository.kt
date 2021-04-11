package com.hh.coffeevenues.data.repositories


import com.hh.coffeevenues.data.apis.VenuesAPI
import javax.inject.Inject

class VenuesListRepository @Inject constructor
    (private val api: VenuesAPI) : BaseRepository() {

    suspend fun getVenues(location: String) = safeApiCall {
        api.getVenues(
            "GRM3KZN0X2RQQP5XWMVUDVRKX4ZS1RYQ0HI4K1QUDQQIQUM3",
            "0W5I0U20MY433BFNHQ4AAHSGVZ02QHYVYGM0YT4OHOPGLL14",
            location, 1000, "Coffee", "20180323"
        )
    }
}