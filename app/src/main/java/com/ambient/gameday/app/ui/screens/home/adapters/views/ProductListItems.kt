package com.ambient.gameday.app.ui.screens.home.adapters.views

import com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory.ProductListTypeFactory

data class ProductListItems(
    val id: String,
    val name: String,
    val imageUrl: String,
    val sport: String,
    val price: Int
) : ProductListView {
    override fun type(productListTypeFactory: ProductListTypeFactory) {
        productListTypeFactory.type(this)
    }
}
