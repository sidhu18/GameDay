package com.ambient.gameday.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ambient.gameday.data.local.entities.UserEntity

@Database(
    entities = [
        UserEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDB : RoomDatabase()