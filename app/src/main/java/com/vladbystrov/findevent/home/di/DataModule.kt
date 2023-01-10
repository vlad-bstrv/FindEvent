package com.vladbystrov.findevent.home.di

import com.vladbystrov.findevent.home.data.MockHomeRepositoryImpl
import com.vladbystrov.findevent.home.domain.repository.HomeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideHomeRepository(): HomeRepository {
        return MockHomeRepositoryImpl()
    }
}