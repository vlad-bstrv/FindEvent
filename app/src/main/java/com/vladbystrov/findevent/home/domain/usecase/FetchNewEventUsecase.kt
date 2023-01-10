package com.vladbystrov.findevent.home.domain.usecase

import com.vladbystrov.findevent.home.domain.model.Event
import com.vladbystrov.findevent.home.domain.repository.HomeRepository

class FetchNewEventUsecase(private val homeRepository: HomeRepository) {
    fun execute(): List<Event> = homeRepository.fetchNewEvent()
}