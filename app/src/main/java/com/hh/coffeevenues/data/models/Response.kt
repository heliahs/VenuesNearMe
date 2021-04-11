package com.hh.coffeevenues.data.models

data class Response(
    val groups: List<Group>,
    val headerFullLocation: String,
    val headerLocation: String,
    val headerLocationGranularity: String,
    val query: String,
    val suggestedBounds: SuggestedBounds,
    val totalResults: Int
)