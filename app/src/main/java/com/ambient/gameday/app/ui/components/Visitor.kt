package com.ambient.gameday.app.ui.components

import com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory.ProductListTypeFactory

interface Visitor {
    fun type(productListTypeFactory: ProductListTypeFactory): Int
}
