package com.ambient.gameday.app.ui.screens.home.adapters.views

import com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory.ProductListTypeFactory

data class ProductListHeader(val header: String) : ProductListView {

    override fun type(productListTypeFactory: ProductListTypeFactory) {
        productListTypeFactory.type(this)
    }
}
