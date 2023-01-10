package com.vladbystrov.findevent.home.domain.usecase

import com.vladbystrov.findevent.home.domain.model.Event
import com.vladbystrov.findevent.home.domain.repository.HomeRepository

class FetchPastEventUsecase(private val homeRepository: HomeRepository) {
    fun execute(): List<Event> = homeRepository.fetchPastEvent()
}