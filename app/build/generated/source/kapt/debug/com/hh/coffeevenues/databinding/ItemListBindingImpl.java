package com.hh.coffeevenues.databinding;
import com.hh.coffeevenues.R;
import com.hh.coffeevenues.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemListBindingImpl extends ItemListBinding implements com.hh.coffeevenues.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.distance.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.hh.coffeevenues.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.hh.coffeevenues.data.models.Item) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.hh.coffeevenues.data.models.Item Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setClickListener(@Nullable com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.hh.coffeevenues.data.models.Item item = mItem;
        com.hh.coffeevenues.data.models.Venue itemVenue = null;
        int itemVenueLocationDistance = 0;
        java.lang.String stringValueOfItemVenueLocationDistance = null;
        com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener clickListener = mClickListener;
        java.lang.String itemVenueName = null;
        com.hh.coffeevenues.data.models.Location itemVenueLocation = null;
        java.lang.String javaLangStringDistanceStringValueOfItemVenueLocationDistance = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.venue
                    itemVenue = item.getVenue();
                }


                if (itemVenue != null) {
                    // read item.venue.name
                    itemVenueName = itemVenue.getName();
                    // read item.venue.location
                    itemVenueLocation = itemVenue.getLocation();
                }


                if (itemVenueLocation != null) {
                    // read item.venue.location.distance
                    itemVenueLocationDistance = itemVenueLocation.getDistance();
                }


                // read String.valueOf(item.venue.location.distance)
                stringValueOfItemVenueLocationDistance = java.lang.String.valueOf(itemVenueLocationDistance);


                // read ("Distance : ") + (String.valueOf(item.venue.location.distance))
                javaLangStringDistanceStringValueOfItemVenueLocationDistance = ("Distance : ") + (stringValueOfItemVenueLocationDistance);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.distance, javaLangStringDistanceStringValueOfItemVenueLocationDistance);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, itemVenueName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // clickListener
        com.hh.coffeevenues.ui.adapters.VenuesAdapterClickListener clickListener = mClickListener;
        // item
        com.hh.coffeevenues.data.models.Item item = mItem;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onclick(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}