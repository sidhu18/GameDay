package com.ambient.gameday.app.ui.components.timber

import com.ambient.gameday.BuildConfig
import timber.log.Timber

object TimberUtil {

    /**
     * Initialize timber logging tree based on release variant.
     */
    fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(ReleaseTree())
        }
    }
}
