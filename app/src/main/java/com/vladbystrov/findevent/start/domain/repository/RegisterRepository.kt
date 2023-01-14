package com.vladbystrov.findevent.start.domain.repository

import com.vladbystrov.findevent.core.AppState
import com.vladbystrov.findevent.start.domain.model.User

interface RegisterRepository {

    fun addUser(user: User): AppState
}