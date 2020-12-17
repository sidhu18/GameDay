package com.ambient.gameday.data.local.preferences.user

import androidx.datastore.preferences.core.preferencesKey

object PreferenceKeys {
    val USER_ID = preferencesKey<String>("user_id")
    val USER_NAME = preferencesKey<String>("user_name")
    val USER_EMAIL = preferencesKey<String>("user_email")
}
