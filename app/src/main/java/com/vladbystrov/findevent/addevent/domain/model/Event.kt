package com.vladbystrov.findevent.addevent.domain.model

data class Event(
    val category: String,
    val name: String,
    val acceptableAge: Int,
    val description: String,
    val mood: Int,
    val date: Long,
    val isOnline: Boolean,
    val price: Double
)