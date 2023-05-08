package com.lj.repositories

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object Module {

    @Provides
    fun provideNameRepository(
        cityRepository: CityRepository
    ): PersonRepository {
        return PersonRepositoryImpl(cityRepository)
    }

    @Provides
    fun provideCityRepository(): CityRepository {
        return CityRepositoryImpl()
    }
}