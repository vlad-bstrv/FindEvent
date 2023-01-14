package com.vladbystrov.findevent.start.presentation.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vladbystrov.findevent.core.AppState
import com.vladbystrov.findevent.start.domain.model.User
import com.vladbystrov.findevent.start.domain.usecase.AddUserUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(private val addUserUsecase: AddUserUsecase): ViewModel() {

    private val _registerLiveData = MutableLiveData<AppState>()
    val registerLiveData: LiveData<AppState> get() = _registerLiveData

    fun registerUser(user: User) {
        _registerLiveData.postValue(AppState.AppStateLoading)
        _registerLiveData.postValue(addUserUsecase.execute(user))
    }
}