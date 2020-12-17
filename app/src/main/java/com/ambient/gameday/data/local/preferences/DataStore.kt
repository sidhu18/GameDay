package com.ambient.gameday.data.local.preferences

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.createDataStore

const val APP_DATA_STORE_NAME = "app_data_store"

object DataStore {

    fun Context.getAppDataStore(): DataStore<Preferences> =
        this.createDataStore(
            name = APP_DATA_STORE_NAME
        )
}
