package com.hh.coffeevenues.ui.vanuesList;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/hh/coffeevenues/ui/vanuesList/VenuesListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/hh/coffeevenues/data/repositories/VenuesListRepository;", "(Lcom/hh/coffeevenues/data/repositories/VenuesListRepository;)V", "_venues", "Landroidx/lifecycle/MutableLiveData;", "Lcom/hh/coffeevenues/data/Resource;", "Lcom/hh/coffeevenues/data/models/VenuesResponse;", "venues", "Landroidx/lifecycle/LiveData;", "getVenues", "()Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/Job;", "location", "", "app_debug"})
public final class VenuesListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.hh.coffeevenues.data.Resource<com.hh.coffeevenues.data.models.VenuesResponse>> _venues = null;
    private final com.hh.coffeevenues.data.repositories.VenuesListRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.hh.coffeevenues.data.Resource<com.hh.coffeevenues.data.models.VenuesResponse>> getVenues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getVenues(@org.jetbrains.annotations.NotNull()
    java.lang.String location) {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public VenuesListViewModel(@org.jetbrains.annotations.NotNull()
    com.hh.coffeevenues.data.repositories.VenuesListRepository repository) {
        super();
    }
}