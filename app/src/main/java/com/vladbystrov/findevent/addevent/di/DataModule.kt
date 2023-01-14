package com.vladbystrov.findevent.addevent.di

import com.vladbystrov.findevent.addevent.data.repository.MockNewEventRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class DataModule {

    @Provides
    @ViewModelScoped
    fun provideNewEventRepository() = MockNewEventRepositoryImpl()
}