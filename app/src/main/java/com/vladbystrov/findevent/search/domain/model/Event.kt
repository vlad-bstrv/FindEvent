package com.vladbystrov.findevent.search.domain.model

data class Event(
    val image: String,
    val rating: String,
    val favorites: Boolean,
    val share: String,
    val date: String,
    val name: String,
    val price: String,
    val location: String,
    val countPeople: Int,
)
