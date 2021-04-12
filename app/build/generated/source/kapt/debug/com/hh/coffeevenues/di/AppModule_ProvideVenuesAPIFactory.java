package com.hh.coffeevenues.di;

import com.hh.coffeevenues.data.RemoteDataSource;
import com.hh.coffeevenues.data.apis.VenuesAPI;
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
public final class AppModule_ProvideVenuesAPIFactory implements Factory<VenuesAPI> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  public AppModule_ProvideVenuesAPIFactory(Provider<RemoteDataSource> remoteDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public VenuesAPI get() {
    return provideVenuesAPI(remoteDataSourceProvider.get());
  }

  public static AppModule_ProvideVenuesAPIFactory create(
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    return new AppModule_ProvideVenuesAPIFactory(remoteDataSourceProvider);
  }

  public static VenuesAPI provideVenuesAPI(RemoteDataSource remoteDataSource) {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideVenuesAPI(remoteDataSource), "Cannot return null from a non-@Nullable @Provides method");
  }
}
