package com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory

import com.ambient.gameday.R
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListHeader
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListItems

class ProductListTypeFactoryImpl : ProductListTypeFactory {

    override fun type(productListHeader: ProductListHeader) = R.layout.recycler_item_product_header

    override fun type(productListItems: ProductListItems) = R.layout.recycler_item_product_listing
}
