package com.ambient.gameday.app.ui.screens.home.adapters.listing.views.typefactory

import android.view.ViewGroup
import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.listing.views.ProductListHeader
import com.ambient.gameday.app.ui.screens.home.adapters.listing.views.ProductListItems

interface ProductListTypeFactory {
    fun type(productListHeader: ProductListHeader): Int
    fun type(productListItems: ProductListItems): Int

    fun holder(type: Int, parent: ViewGroup): BaseViewHolder<*>
}
