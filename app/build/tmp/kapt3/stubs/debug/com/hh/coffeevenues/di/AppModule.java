package com.hh.coffeevenues.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/hh/coffeevenues/di/AppModule;", "", "()V", "provideRemoteDataSource", "Lcom/hh/coffeevenues/data/RemoteDataSource;", "provideVenuesAPI", "Lcom/hh/coffeevenues/data/apis/VenuesAPI;", "remoteDataSource", "provideVenuesListRepository", "Lcom/hh/coffeevenues/data/repositories/VenuesListRepository;", "venuesAPI", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.hh.coffeevenues.di.AppModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.hh.coffeevenues.data.RemoteDataSource provideRemoteDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.hh.coffeevenues.data.apis.VenuesAPI provideVenuesAPI(@org.jetbrains.annotations.NotNull()
    com.hh.coffeevenues.data.RemoteDataSource remoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.hh.coffeevenues.data.repositories.VenuesListRepository provideVenuesListRepository(@org.jetbrains.annotations.NotNull()
    com.hh.coffeevenues.data.apis.VenuesAPI venuesAPI) {
        return null;
    }
    
    private AppModule() {
        super();
    }
}