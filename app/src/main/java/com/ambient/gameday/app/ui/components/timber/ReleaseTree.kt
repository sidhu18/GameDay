package com.ambient.gameday.app.ui.components.timber

import android.util.Log
import timber.log.Timber

class ReleaseTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }

        // Log errors to some analytics tools like Firebase CrashAnalytics
    }
}
