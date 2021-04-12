package com.hh.coffeevenues.di


import com.hh.coffeevenues.data.RemoteDataSource
import com.hh.coffeevenues.data.apis.VenuesAPI
import com.hh.coffeevenues.data.repositories.VenuesListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRemoteDataSource(): RemoteDataSource {
        return RemoteDataSource()
    }

    @Singleton
    @Provides
    fun provideVenuesAPI(
        remoteDataSource: RemoteDataSource
    ): VenuesAPI {
        return remoteDataSource.buildApi(VenuesAPI::class.java)
    }

    @Provides
    fun provideVenuesListRepository(venuesAPI: VenuesAPI): VenuesListRepository {
        return VenuesListRepository(venuesAPI)
    }


}