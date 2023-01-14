package com.vladbystrov.findevent.addevent.presentation

import androidx.lifecycle.ViewModel
import com.vladbystrov.findevent.addevent.domain.model.Event
import com.vladbystrov.findevent.addevent.domain.usecase.SendNewEventUsecase

class AddEventViewModel(
    sendNewEventUsecase: SendNewEventUsecase
): ViewModel() {

    fun sendNewEvent(event: Event) {
        sendNewEvent(event)
    }
}