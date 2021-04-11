package com.hh.coffeevenues.data.apis

import com.hh.coffeevenues.data.models.VenuesResponse
import retrofit2.http.Field
import retrofit2.http.GET

interface VenuesAPI {
    @GET("v2/venues/explore")
    suspend fun getVenues(@Field("client_id") clientID: String,
                          @Field("client_secret") clientSecret: String,
                          @Field("ll") location: String,
                          @Field("radius") radius: Int,
                          @Field("section") section: String,
                          @Field("v") version: String,
    ): VenuesResponse
}