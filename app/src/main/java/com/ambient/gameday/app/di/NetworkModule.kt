package com.ambient.gameday.app.di

import com.ambient.gameday.app.commons.constants.Constants.BASE_URL
import com.ambient.gameday.data.remote.GameDayAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideGameDayApi(): GameDayAPI {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(GameDayAPI::class.java)
    }
}
