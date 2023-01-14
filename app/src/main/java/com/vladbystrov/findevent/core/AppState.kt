package com.vladbystrov.findevent.core

sealed class AppState{
    data class AppStateSuccess<T>(val value: T) : AppState()
    data class AppStateError(val error: String) : AppState()
    object AppStateLoading : AppState()
}