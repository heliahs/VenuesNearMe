package com.hh.coffeevenues.ui.vanuesList;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.hh.coffeevenues.data.repositories.VenuesListRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class VenuesListViewModel_AssistedFactory implements ViewModelAssistedFactory<VenuesListViewModel> {
  private final Provider<VenuesListRepository> repository;

  @Inject
  VenuesListViewModel_AssistedFactory(Provider<VenuesListRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public VenuesListViewModel create(SavedStateHandle arg0) {
    return new VenuesListViewModel(repository.get());
  }
}
