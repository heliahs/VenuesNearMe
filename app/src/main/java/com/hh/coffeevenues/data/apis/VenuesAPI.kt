package com.hh.coffeevenues.data.apis


import com.hh.coffeevenues.data.models.VenuesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface VenuesAPI {

    @GET("venues/explore")
    suspend fun getVenues(
        @Query("client_id") clientID: String,
        @Query("client_secret") clientSecret: String,
        @Query("ll") location: String,
        @Query("radius") radius: String,
        @Query("section") section: String,
        @Query("v") version: String
    ): VenuesResponse

}