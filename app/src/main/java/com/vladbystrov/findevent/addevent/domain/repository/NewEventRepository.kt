package com.vladbystrov.findevent.addevent.domain.repository

import com.vladbystrov.findevent.addevent.domain.model.Event

interface NewEventRepository {

    fun sendNewEvent(event: Event)
}