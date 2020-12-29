package com.ambient.gameday.app.ui.screens.profile.views

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ambient.gameday.data.local.entities.UserEntity

class ProfileViewModel : ViewModel() {

    private var userData: MutableLiveData<UserEntity> = MutableLiveData()

    val userLiveData: LiveData<UserEntity>
        get() = userData

    init {
        mockUserProfileInfo()
    }

    private fun mockUserProfileInfo() {
        val mockUser = UserEntity(
            12,
            "Chole Smith",
            "cholesmith67@gmail.com",
            9238492384
        )
        userData.postValue(mockUser)
    }
}
