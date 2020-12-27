package com.ambient.gameday.app

import android.app.Application
import com.ambient.gameday.app.ui.components.timber.TimberUtil
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        TimberUtil.setupTimber()
    }
}
