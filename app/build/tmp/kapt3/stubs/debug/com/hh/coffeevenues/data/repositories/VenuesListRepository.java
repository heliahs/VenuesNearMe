package com.hh.coffeevenues.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/hh/coffeevenues/data/repositories/VenuesListRepository;", "Lcom/hh/coffeevenues/data/repositories/BaseRepository;", "api", "Lcom/hh/coffeevenues/data/apis/VenuesAPI;", "(Lcom/hh/coffeevenues/data/apis/VenuesAPI;)V", "getVenues", "Lcom/hh/coffeevenues/data/Resource;", "Lcom/hh/coffeevenues/data/models/VenuesResponse;", "location", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class VenuesListRepository extends com.hh.coffeevenues.data.repositories.BaseRepository {
    private final com.hh.coffeevenues.data.apis.VenuesAPI api = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getVenues(@org.jetbrains.annotations.NotNull()
    java.lang.String location, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hh.coffeevenues.data.Resource<com.hh.coffeevenues.data.models.VenuesResponse>> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public VenuesListRepository(@org.jetbrains.annotations.NotNull()
    com.hh.coffeevenues.data.apis.VenuesAPI api) {
        super();
    }
}