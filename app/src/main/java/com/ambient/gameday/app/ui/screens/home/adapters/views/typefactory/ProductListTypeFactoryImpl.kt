package com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ambient.gameday.R
import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListHeader
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListItems
import com.ambient.gameday.app.ui.screens.home.adapters.views.viewholders.HeaderViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.views.viewholders.ProductListViewHolder
import com.ambient.gameday.databinding.RecyclerItemProductHeaderBinding
import com.ambient.gameday.databinding.RecyclerItemProductListingBinding

class ProductListTypeFactoryImpl : ProductListTypeFactory {

    override fun type(productListHeader: ProductListHeader) = R.layout.recycler_item_product_header

    override fun type(productListItems: ProductListItems) = R.layout.recycler_item_product_listing

    override fun holder(type: Int, parent: ViewGroup): BaseViewHolder<*> {
        val inflater = LayoutInflater.from(parent.context)
        return when (type) {
            R.layout.recycler_item_product_header -> {
                val binding = RecyclerItemProductHeaderBinding.inflate(inflater, parent, false)
                HeaderViewHolder(binding)
            }
            R.layout.recycler_item_product_listing -> {
                val binding = RecyclerItemProductListingBinding.inflate(inflater, parent, false)
                ProductListViewHolder(binding)
            }
            else -> throw RuntimeException("Illegal view type")
        }
    }
}
