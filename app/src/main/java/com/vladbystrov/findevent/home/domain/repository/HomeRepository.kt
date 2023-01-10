package com.vladbystrov.findevent.home.domain.repository

import com.vladbystrov.findevent.home.domain.model.Event
import com.vladbystrov.findevent.home.domain.model.News

interface HomeRepository {

    fun fetchNews(): List<News>

    fun fetchTodayEvent(): List<Event>

    fun fetchPopularEvent(): List<Event>

    fun fetchNewEvent(): List<Event>

    fun fetchPastEvent(): List<Event>
}