package com.hh.coffeevenues.di;

import com.hh.coffeevenues.data.apis.VenuesAPI;
import com.hh.coffeevenues.data.repositories.VenuesListRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideVenuesListRepositoryFactory implements Factory<VenuesListRepository> {
  private final Provider<VenuesAPI> venuesAPIProvider;

  public AppModule_ProvideVenuesListRepositoryFactory(Provider<VenuesAPI> venuesAPIProvider) {
    this.venuesAPIProvider = venuesAPIProvider;
  }

  @Override
  public VenuesListRepository get() {
    return provideVenuesListRepository(venuesAPIProvider.get());
  }

  public static AppModule_ProvideVenuesListRepositoryFactory create(
      Provider<VenuesAPI> venuesAPIProvider) {
    return new AppModule_ProvideVenuesListRepositoryFactory(venuesAPIProvider);
  }

  public static VenuesListRepository provideVenuesListRepository(VenuesAPI venuesAPI) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideVenuesListRepository(venuesAPI), "Cannot return null from a non-@Nullable @Provides method");
  }
}
