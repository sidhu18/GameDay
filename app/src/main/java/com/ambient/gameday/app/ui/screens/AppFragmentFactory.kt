package com.ambient.gameday.app.ui.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.ambient.gameday.app.ui.screens.login.LoginFragment
import com.ambient.gameday.app.ui.screens.register.RegisterFragment
import com.bumptech.glide.RequestManager
import javax.inject.Inject

class AppFragmentFactory @Inject constructor(
    private val glide : RequestManager
) : FragmentFactory(){

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className){
            LoginFragment::class.java.name -> LoginFragment()
            RegisterFragment::class.java.name -> RegisterFragment()
            else -> super.instantiate(classLoader, className)
        }
    }
}