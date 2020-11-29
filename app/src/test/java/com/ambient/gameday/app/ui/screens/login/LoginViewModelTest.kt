package com.ambient.gameday.app.ui.screens.login

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.ambient.gameday.app.commons.others.Status
import com.ambient.gameday.utils.MainCoroutineRule
import com.ambient.gameday.utils.getOrAwaitValueTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class LoginViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    private lateinit var viewModel: LoginViewModel

    @Before
    fun setup(){
        viewModel = LoginViewModel()
    }

    @Test
    fun `validation test empty email returns error`(){
        val email = ""
        val password = "1234556"
        viewModel.validate(email,password)

        val value = viewModel.validationResult.getOrAwaitValueTest()

        assert(value.getContentIfNotHandled()?.status == Status.ERROR)
    }

    @Test
    fun `validation test empty password returns error`(){
        val email = "emailnotempty@gmail.com"
        val password = ""
        viewModel.validate(email,password)

        val value = viewModel.validationResult.getOrAwaitValueTest()

        assert(value.getContentIfNotHandled()?.status == Status.ERROR)
    }

    @Test
    fun `validation test valid email and password returns success`(){
        val email = "emailnotempty@gmail.com"
        val password = "password"
        viewModel.validate(email,password)

        val value = viewModel.validationResult.getOrAwaitValueTest()

        assert(value.getContentIfNotHandled()?.status == Status.SUCCESS)
    }
}