package com.ambient.gameday.app.ui.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.ambient.gameday.app.ui.screens.home.HomeFragment
import com.ambient.gameday.app.ui.screens.home.adapters.featured.FeaturedProductsAdapter
import com.ambient.gameday.app.ui.screens.login.LoginFragment
import com.ambient.gameday.app.ui.screens.register.RegisterFragment
import com.ambient.gameday.app.ui.screens.welcome.WelcomeFragment
import com.bumptech.glide.RequestManager
import javax.inject.Inject

class AppFragmentFactory @Inject constructor(
    private val glide: RequestManager,
    private val featuredProductsAdapter: FeaturedProductsAdapter
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when (className) {
            WelcomeFragment::class.java.name -> WelcomeFragment()
            LoginFragment::class.java.name -> LoginFragment()
            RegisterFragment::class.java.name -> RegisterFragment()
            HomeFragment::class.java.name -> HomeFragment(featuredProductsAdapter)
            else -> super.instantiate(classLoader, className)
        }
    }
}
