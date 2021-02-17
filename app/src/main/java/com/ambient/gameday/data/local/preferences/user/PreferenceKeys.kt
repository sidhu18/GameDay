package com.ambient.gameday.data.local.preferences.user

import androidx.datastore.preferences.core.stringPreferencesKey

object PreferenceKeys {
    val USER_ID = stringPreferencesKey("user_id")
    val USER_NAME = stringPreferencesKey("user_name")
    val USER_EMAIL = stringPreferencesKey("user_email")
}
