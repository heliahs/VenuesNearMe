package com.hh.coffeevenues.data.apis;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001JM\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/hh/coffeevenues/data/apis/VenuesAPI;", "", "getVenues", "Lcom/hh/coffeevenues/data/models/VenuesResponse;", "clientID", "", "clientSecret", "location", "radius", "section", "version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface VenuesAPI {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "venues/explore")
    public abstract java.lang.Object getVenues(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_id")
    java.lang.String clientID, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "client_secret")
    java.lang.String clientSecret, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ll")
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "radius")
    java.lang.String radius, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "section")
    java.lang.String section, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "v")
    java.lang.String version, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hh.coffeevenues.data.models.VenuesResponse> p6);
}