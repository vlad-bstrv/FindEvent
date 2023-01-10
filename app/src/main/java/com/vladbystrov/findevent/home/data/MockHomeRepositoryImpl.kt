package com.vladbystrov.findevent.home.data

import com.vladbystrov.findevent.home.domain.model.Event
import com.vladbystrov.findevent.home.domain.model.News
import com.vladbystrov.findevent.home.domain.repository.HomeRepository

class MockHomeRepositoryImpl: HomeRepository {
    override fun fetchNews(): List<News> = listNews

    override fun fetchTodayEvent(): List<Event> = listToday

    override fun fetchPopularEvent(): List<Event> = listToday

    override fun fetchNewEvent(): List<Event> = listToday

    override fun fetchPastEvent(): List<Event> = listToday
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

private val listNews = listOf<News>(
    News(
        listOf(
            "https://images.unsplash.com/photo-1673212816026-208c314ed405?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
            "https://images.unsplash.com/photo-1673250367795-1f8ea37a780c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=989&q=80",
            "https://images.unsplash.com/photo-1673252413961-9f77eb505673?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        ),
        "Галина"
    ),
    News(
        listOf(
            "https://images.unsplash.com/photo-1673194277089-796008e9cc30?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
            "https://images.unsplash.com/photo-1673250367795-1f8ea37a780c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=989&q=80",
            "https://images.unsplash.com/photo-1673245137845-a9021aede7ed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        ),
        "Анатолий"
    ),
    News(
        listOf(
            "https://images.unsplash.com/photo-1673252413961-9f77eb505673?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
            "https://images.unsplash.com/photo-1672706974230-831cc9fa4dc5?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1015&q=80",
            "https://images.unsplash.com/photo-1673245137845-a9021aede7ed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        ),
        "Алина"
    ),
    News(
        listOf(
            "https://images.unsplash.com/photo-1673212816026-208c314ed405?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
            "https://images.unsplash.com/photo-1673250367795-1f8ea37a780c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=989&q=80",
            "https://images.unsplash.com/photo-1673252413961-9f77eb505673?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        ),
        "Юрий"
    ),
    News(
        listOf(
            "https://images.unsplash.com/photo-1673194277089-796008e9cc30?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
            "https://images.unsplash.com/photo-1673250367795-1f8ea37a780c?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=989&q=80",
            "https://images.unsplash.com/photo-1673245137845-a9021aede7ed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        ),
        "Петр"
    ),
    News(
        listOf(
            "https://images.unsplash.com/photo-1673252413961-9f77eb505673?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
            "https://images.unsplash.com/photo-1672706974230-831cc9fa4dc5?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1015&q=80",
            "https://images.unsplash.com/photo-1673245137845-a9021aede7ed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        ),
        "Влад"
    ),
    News(
        listOf(
            "https://images.unsplash.com/photo-1673252413961-9f77eb505673?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
            "https://images.unsplash.com/photo-1672706974230-831cc9fa4dc5?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1015&q=80",
            "https://images.unsplash.com/photo-1673245137845-a9021aede7ed?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=987&q=80",
        ),
        "Роман"
    ),
)