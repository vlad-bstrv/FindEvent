package com.vladbystrov.findevent.start.domain.usecase

import com.vladbystrov.findevent.core.AppState
import com.vladbystrov.findevent.start.domain.model.User
import com.vladbystrov.findevent.start.domain.repository.RegisterRepository

class AddUserUsecase(private val registerRepository: RegisterRepository) {

    fun execute(user: User): AppState = registerRepository.addUser(user)

}