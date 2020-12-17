package com.ambient.gameday.app.ui.screens.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ambient.gameday.app.commons.others.Event
import com.ambient.gameday.app.commons.others.Response

class LoginViewModel : ViewModel() {

    private var _validationResult = MutableLiveData<Event<Response<String>>>()
    val validationResult: LiveData<Event<Response<String>>> = _validationResult

    fun validate(email: String, password: String) {
        if (email.trim().isEmpty()) {
            _validationResult.postValue(Event(Response.error("Email cannot be empty")))
            return
        }

        if (password.trim().isEmpty()) {
            _validationResult.postValue(Event(Response.error("Password cannot be empty")))
            return
        }

        _validationResult.postValue(Event(Response.success()))
    }

    fun login(email: String, password: String): Event<Response<String>> {
        return if (email == "avengers@gmail.com" && password == "Thor is the best") {
            Event(Response.success("Login successful"))
        } else {
            Event(Response.error("Login unsuccessful"))
        }
    }
}
