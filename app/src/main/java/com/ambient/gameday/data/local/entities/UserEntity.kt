package com.ambient.gameday.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserEntity(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "user_id")
    val userId: Int,

    val name: String,

    val email: String,

    @ColumnInfo(name = "created_time")
    val createdTime: Long
)
