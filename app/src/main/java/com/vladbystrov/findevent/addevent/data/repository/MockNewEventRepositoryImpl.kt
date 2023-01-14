package com.vladbystrov.findevent.addevent.data.repository

import com.vladbystrov.findevent.addevent.data.repository.MockEventRemote.events
import com.vladbystrov.findevent.addevent.domain.model.Event
import com.vladbystrov.findevent.addevent.domain.repository.NewEventRepository

class MockNewEventRepositoryImpl: NewEventRepository {

    override fun sendNewEvent(event: Event) {
        events.add(event)
    }
}

object MockEventRemote {
    val events = mutableListOf<Event>()
}