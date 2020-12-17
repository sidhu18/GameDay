package com.ambient.gameday.app.ui.screens.home.adapters.views

import com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory.ProductListTypeFactory

data class ProductListItems(override val id: String, val productListItems: List<ProductListItem>) :
    ProductListView {
    override fun type(productListTypeFactory: ProductListTypeFactory) =
        productListTypeFactory.type(this)
}
