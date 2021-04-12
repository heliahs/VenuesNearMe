package com.hh.coffeevenues.data.repositories;

import com.hh.coffeevenues.data.apis.VenuesAPI;
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
public final class VenuesListRepository_Factory implements Factory<VenuesListRepository> {
  private final Provider<VenuesAPI> apiProvider;

  public VenuesListRepository_Factory(Provider<VenuesAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public VenuesListRepository get() {
    return newInstance(apiProvider.get());
  }

  public static VenuesListRepository_Factory create(Provider<VenuesAPI> apiProvider) {
    return new VenuesListRepository_Factory(apiProvider);
  }

  public static VenuesListRepository newInstance(VenuesAPI api) {
    return new VenuesListRepository(api);
  }
}
