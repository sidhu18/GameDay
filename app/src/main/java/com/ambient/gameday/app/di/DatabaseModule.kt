package com.ambient.gameday.app.di

import android.content.Context
import androidx.room.Room
import com.ambient.gameday.app.commons.constants.Constants
import com.ambient.gameday.data.AppDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, AppDB::class.java, Constants.DATABASE_NAME).build()

}