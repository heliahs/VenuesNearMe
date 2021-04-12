package com.hh.coffeevenues.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/hh/coffeevenues/ui/adapters/VenuesListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/hh/coffeevenues/data/models/Item;", "Lcom/hh/coffeevenues/ui/adapters/VenuesListAdapter$MyViewHolder;", "clickListener", "Lcom/hh/coffeevenues/ui/adapters/VenuesAdapterClickListener;", "(Lcom/hh/coffeevenues/ui/adapters/VenuesAdapterClickListener;)V", "getClickListener", "()Lcom/hh/coffeevenues/ui/adapters/VenuesAdapterClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class VenuesListAdapter extends androidx.recyclerview.widget.ListAdapter<com.hh.coffeevenues.data.models.Item, com.hh.coffeevenues.ui.adapters.VenuesListAdapter.MyViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hh.coffeevenues.ui.adapters.VenuesListAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hh.coffeevenues.ui.adapters.VenuesListAdapter.MyViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener getClickListener() {
        return null;
    }
    
    public VenuesListAdapter(@org.jetbrains.annotations.NotNull()
    com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/hh/coffeevenues/ui/adapters/VenuesListAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/hh/coffeevenues/databinding/ItemListBinding;", "(Lcom/hh/coffeevenues/databinding/ItemListBinding;)V", "bind", "", "item", "Lcom/hh/coffeevenues/data/models/Item;", "clickListener", "Lcom/hh/coffeevenues/ui/adapters/VenuesAdapterClickListener;", "Companion", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.hh.coffeevenues.databinding.ItemListBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.hh.coffeevenues.ui.adapters.VenuesListAdapter.MyViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.hh.coffeevenues.data.models.Item item, @org.jetbrains.annotations.NotNull()
        com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener clickListener) {
        }
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        com.hh.coffeevenues.databinding.ItemListBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hh/coffeevenues/ui/adapters/VenuesListAdapter$MyViewHolder$Companion;", "", "()V", "from", "Lcom/hh/coffeevenues/ui/adapters/VenuesListAdapter$MyViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.hh.coffeevenues.ui.adapters.VenuesListAdapter.MyViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}