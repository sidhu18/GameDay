package com.ambient.gameday.app.ui.screens.home.adapters.listing.views

import com.ambient.gameday.app.ui.screens.home.adapters.listing.views.typefactory.ProductListTypeFactory

data class ProductListHeader(
    override val id: String,
    val header: String
) : ProductListView {

    override fun type(productListTypeFactory: ProductListTypeFactory) =
        productListTypeFactory.type(this)
}
