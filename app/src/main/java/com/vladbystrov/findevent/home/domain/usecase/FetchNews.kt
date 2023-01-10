package com.vladbystrov.findevent.home.domain.usecase

import com.vladbystrov.findevent.home.domain.model.News
import com.vladbystrov.findevent.home.domain.repository.HomeRepository

class FetchNews(private val repository: HomeRepository) {

    fun execute(): List<News> = repository.fetchNews()

}