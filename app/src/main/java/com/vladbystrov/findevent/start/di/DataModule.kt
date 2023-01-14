package com.vladbystrov.findevent.start.di

import com.vladbystrov.findevent.start.data.MockRegisterRepositoryImpl
import com.vladbystrov.findevent.start.domain.repository.RegisterRepository
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
    fun provideRegisterRepository():RegisterRepository = MockRegisterRepositoryImpl()
}