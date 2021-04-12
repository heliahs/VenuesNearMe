package com.hh.coffeevenues.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hh/coffeevenues/data/repositories/BaseRepository;", "Lcom/hh/coffeevenues/data/SafeApiCall;", "()V", "app_debug"})
public abstract class BaseRepository implements com.hh.coffeevenues.data.SafeApiCall {
    
    public BaseRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.hh.coffeevenues.data.Resource<? extends T>> p1) {
        return null;
    }
}