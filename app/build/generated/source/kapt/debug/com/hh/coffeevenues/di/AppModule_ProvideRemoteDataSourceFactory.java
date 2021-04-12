package com.hh.coffeevenues.di;

import com.hh.coffeevenues.data.RemoteDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRemoteDataSourceFactory implements Factory<RemoteDataSource> {
  @Override
  public RemoteDataSource get() {
    return provideRemoteDataSource();
  }

  public static AppModule_ProvideRemoteDataSourceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RemoteDataSource provideRemoteDataSource() {
    return Preconditions.checkNotNull(AppModule.INSTANCE.provideRemoteDataSource(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideRemoteDataSourceFactory INSTANCE = new AppModule_ProvideRemoteDataSourceFactory();
  }
}
