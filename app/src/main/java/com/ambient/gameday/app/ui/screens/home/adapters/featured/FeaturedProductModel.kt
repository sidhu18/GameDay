package com.ambient.gameday.app.ui.screens.home.adapters.featured

import com.ambient.gameday.app.ui.screens.home.adapters.product.ProductListItem

data class FeaturedProductModel(
    val id: String,
    val header: String,
    val productList: List<ProductListItem>
)
