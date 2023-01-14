package com.vladbystrov.findevent.start.data

import com.vladbystrov.findevent.core.AppState
import com.vladbystrov.findevent.start.domain.model.User
import com.vladbystrov.findevent.start.domain.repository.RegisterRepository

class MockRegisterRepositoryImpl: RegisterRepository {
    override fun addUser(user: User): AppState {
        return AppState.AppStateSuccess("token")
    }
}