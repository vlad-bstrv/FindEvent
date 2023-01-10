package com.vladbystrov.findevent.home.di

import com.vladbystrov.findevent.home.domain.repository.HomeRepository
import com.vladbystrov.findevent.home.domain.usecase.*
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
    fun provideFetchNewsUseCase(homeRepository: HomeRepository): FetchNews {
        return FetchNews(homeRepository)
    }

    @Provides
    @ViewModelScoped
    fun provideFetchNewEventUseCase(homeRepository: HomeRepository): FetchNewEventUsecase {
        return FetchNewEventUsecase(homeRepository)
    }

    @Provides
    @ViewModelScoped
    fun provideFetchPastEventUseCase(homeRepository: HomeRepository): FetchPastEventUsecase {
        return FetchPastEventUsecase(homeRepository)
    }

    @Provides
    @ViewModelScoped
    fun provideFetchPopularEventUseCase(homeRepository: HomeRepository): FetchPopularEventUsecase {
        return FetchPopularEventUsecase(homeRepository)
    }

    @Provides
    @ViewModelScoped
    fun provideFetchTodayEventUseCase(homeRepository: HomeRepository): FetchTodayEventUsecase {
        return FetchTodayEventUsecase(homeRepository)
    }
}