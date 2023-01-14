package com.vladbystrov.findevent.addevent.domain.usecase

import com.vladbystrov.findevent.addevent.domain.model.Event
import com.vladbystrov.findevent.addevent.domain.repository.NewEventRepository

class SendNewEventUsecase(private val repository: NewEventRepository) {

    fun execute(event: Event) {
        repository.sendNewEvent(event)
    }
}