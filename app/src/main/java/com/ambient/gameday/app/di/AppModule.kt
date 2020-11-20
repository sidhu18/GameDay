package com.ambient.gameday.app.di

import android.content.Context
import androidx.room.Room
import com.ambient.gameday.app.commons.constants.Constants.DATABASE_NAME
import com.ambient.gameday.data.AppDB
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
            @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, AppDB::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideGlideInstance(
        @ApplicationContext context: Context
    ) = Glide.with(context).setDefaultRequestOptions(
        RequestOptions()
    )
}