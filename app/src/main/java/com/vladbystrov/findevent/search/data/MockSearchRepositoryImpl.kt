package com.vladbystrov.findevent.search.data

import com.vladbystrov.findevent.search.domain.model.Event

class MockHomeRepositoryImpl {
    fun fetchPopularEvent(): List<Event> = listToday

}

private val listToday = listOf(
    Event(
        "https://images.unsplash.com/photo-1673212816026-208c314ed405?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        "8.6",
        true,
        "", "Вт, Окт. 4, 20:00 - 23:00", "Ночь музыки 18+", "Бесплатно", "Бар Jack", 6
    ),
    Event(
        "https://images.unsplash.com/photo-1673250367795-1f8ea37a780c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=989&q=80",
        "8.6",
        false,
        "", "Вт, Окт. 4, 20:00 - 23:00", "Ночь музыки 18+", "Бесплатно", "Бар Jack", 6
    ),
    Event(
        "https://images.unsplash.com/photo-1673245137845-a9021aede7ed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        "8.6",
        true,
        "", "Вт, Окт. 4, 20:00 - 23:00", "Ночь музыки 18+", "Бесплатно", "Бар Jack", 6
    ),
    Event(
        "https://images.unsplash.com/photo-1673245137845-a9021aede7ed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        "8.6",
        false,
        "", "Вт, Окт. 4, 20:00 - 23:00", "Ночь музыки 18+", "Бесплатно", "Бар Jack", 6
    ),
    Event(
        "https://images.unsplash.com/photo-1673212816026-208c314ed405?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        "8.6",
        true,
        "", "Вт, Окт. 4, 20:00 - 23:00", "Ночь музыки 18+", "Бесплатно", "Бар Jack", 6
    ),
    Event(
        "https://images.unsplash.com/photo-1673250367795-1f8ea37a780c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=989&q=80",
        "8.6",
        true,
        "", "Вт, Окт. 4, 20:00 - 23:00", "Ночь музыки 18+", "Бесплатно", "Бар Jack", 6
    ),
    Event(
        "https://images.unsplash.com/photo-1673212816026-208c314ed405?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        "8.6",
        true,
        "", "Вт, Окт. 4, 20:00 - 23:00", "Ночь музыки 18+", "Бесплатно", "Бар Jack", 6
    ),
)
