package com.vladbystrov.findevent.home.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vladbystrov.findevent.home.domain.model.Event
import com.vladbystrov.findevent.home.domain.model.News
import com.vladbystrov.findevent.home.domain.usecase.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val fetchNews: FetchNews,
    private val fetchTodayEventUsecase: FetchTodayEventUsecase,
    private val fetchNewEventUsecase: FetchNewEventUsecase,
    private val fetchPopularEventUsecase: FetchPopularEventUsecase,
    private val fetchPastEventUsecase: FetchPastEventUsecase
) : ViewModel() {

    private val resultLiveNews = MutableLiveData<List<News>>()
    val liveDataNews: LiveData<List<News>> get() = resultLiveNews

    private val resultLiveTodayEvent = MutableLiveData<List<Event>>()
    val liveDataTodayEvent: LiveData<List<Event>> get() = resultLiveTodayEvent

    private val resultLivePopularEvent = MutableLiveData<List<Event>>()
    val liveDataPopularEvent: LiveData<List<Event>> get() = resultLivePopularEvent

    private val resultLiveNewEvent = MutableLiveData<List<Event>>()
    val liveDataNewEvent: LiveData<List<Event>> get() = resultLiveNewEvent

    private val resultLivePastEvent = MutableLiveData<List<Event>>()
    val liveDataPastEvent: LiveData<List<Event>> get() = resultLivePastEvent

    fun loadData(){
        fetchNews()
        fetchTodayEvent()
        fetchPopularEvent()
        fetchNewEvent()
        fetchPastEvent()
    }

    private fun fetchNews() {
        resultLiveNews.value = fetchNews.execute()
    }

    private fun fetchTodayEvent() {
        resultLiveTodayEvent.postValue(fetchTodayEventUsecase.execute())
    }

    private fun fetchPopularEvent() {
        resultLivePopularEvent.postValue(fetchPopularEventUsecase.execute())
    }

    private fun fetchNewEvent() {
        resultLiveNewEvent.postValue(fetchNewEventUsecase.execute())
    }

    private fun fetchPastEvent() {
        resultLivePastEvent.postValue(fetchPastEventUsecase.execute())
    }
}
