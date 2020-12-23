package com.ambient.gameday.app.ui.screens.home.adapters.listing.views

import com.ambient.gameday.app.ui.screens.home.adapters.listing.views.typefactory.ProductListTypeFactory
import com.ambient.gameday.app.ui.screens.home.adapters.product.ProductListItem

data class ProductListItems(override val id: String, val productListItems: List<ProductListItem>) :
    ProductListView {
    override fun type(productListTypeFactory: ProductListTypeFactory) =
        productListTypeFactory.type(this)
}
