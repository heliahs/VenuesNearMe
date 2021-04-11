package com.hh.coffeevenues.data.models

data class BeenHere(
    val count: Int,
    val lastCheckinExpiredAt: Int,
    val marked: Boolean,
    val unconfirmedCount: Int
)