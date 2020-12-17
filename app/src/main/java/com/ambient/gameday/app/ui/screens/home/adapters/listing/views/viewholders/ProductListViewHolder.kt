package com.ambient.gameday.app.ui.screens.home.adapters.listing.views.viewholders

import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.listing.views.ProductListItems
import com.ambient.gameday.app.ui.screens.home.adapters.product.ProductItemAdapter
import com.ambient.gameday.databinding.RecyclerItemProductListingBinding

class ProductListViewHolder(private val binding: RecyclerItemProductListingBinding) :
    BaseViewHolder<ProductListItems>(binding) {

    override fun bind(model: ProductListItems) {
        val adapter = ProductItemAdapter()
        binding.productListItemRecycler.adapter = adapter
        adapter.productList = model.productListItems
    }
}
