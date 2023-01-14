package com.vladbystrov.findevent.start.di

import com.vladbystrov.findevent.start.domain.repository.RegisterRepository
import com.vladbystrov.findevent.start.domain.usecase.AddUserUsecase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    @ViewModelScoped
    fun provideAddUserUsecase(registerRepository: RegisterRepository) =
        AddUserUsecase(registerRepository)


}