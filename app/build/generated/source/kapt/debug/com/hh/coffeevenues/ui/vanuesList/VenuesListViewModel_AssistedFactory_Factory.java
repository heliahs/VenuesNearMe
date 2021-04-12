package com.hh.coffeevenues.ui.vanuesList;

import com.hh.coffeevenues.data.repositories.VenuesListRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VenuesListViewModel_AssistedFactory_Factory implements Factory<VenuesListViewModel_AssistedFactory> {
  private final Provider<VenuesListRepository> repositoryProvider;

  public VenuesListViewModel_AssistedFactory_Factory(
      Provider<VenuesListRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public VenuesListViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static VenuesListViewModel_AssistedFactory_Factory create(
      Provider<VenuesListRepository> repositoryProvider) {
    return new VenuesListViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static VenuesListViewModel_AssistedFactory newInstance(
      Provider<VenuesListRepository> repository) {
    return new VenuesListViewModel_AssistedFactory(repository);
  }
}
