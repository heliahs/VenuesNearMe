package com.hh.coffeevenues.ui.vanuesList;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = VenuesListViewModel.class
)
public interface VenuesListViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.hh.coffeevenues.ui.vanuesList.VenuesListViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(VenuesListViewModel_AssistedFactory factory);
}
