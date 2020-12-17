package com.ambient.gameday.app.di

import com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory.ProductListTypeFactory
import com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory.ProductListTypeFactoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ProductListTypeFactoryModule {

    @Binds
    abstract fun bindProductListTypeFactory(
        productListTypeFactoryImpl: ProductListTypeFactoryImpl
    ): ProductListTypeFactory
}
