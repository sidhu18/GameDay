package com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory

import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListHeader
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListItems

interface ProductListTypeFactory {
    fun type(productListHeader: ProductListHeader): Int
    fun type(productListItems: ProductListItems): Int
}
