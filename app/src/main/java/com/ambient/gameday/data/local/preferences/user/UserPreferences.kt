package com.ambient.gameday.data.local.preferences.user

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.emptyPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

data class UserPreferences(
    val userId: String,
    val userName: String,
    val userEmail: String
)

fun DataStore<Preferences>.getUserPreference(): Flow<UserPreferences> =
    this.data.catch { exception ->
        if (exception is IOException) {
            emit(emptyPreferences())
        } else {
            throw exception
        }
    }.map { preferences ->
        // get user preferences
        val userId = preferences[PreferenceKeys.USER_ID] ?: ""
        val userName = preferences[PreferenceKeys.USER_NAME] ?: ""
        val userEmail = preferences[PreferenceKeys.USER_EMAIL] ?: ""
        UserPreferences(userId, userName, userEmail)
    }
