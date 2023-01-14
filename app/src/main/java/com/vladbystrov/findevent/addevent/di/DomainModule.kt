package com.vladbystrov.findevent.addevent.di

import com.vladbystrov.findevent.addevent.domain.repository.NewEventRepository
import com.vladbystrov.findevent.addevent.domain.usecase.SendNewEventUsecase
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
    fun provideNewEventUsecase(newEventRepository: NewEventRepository) =
        SendNewEventUsecase(newEventRepository)


}