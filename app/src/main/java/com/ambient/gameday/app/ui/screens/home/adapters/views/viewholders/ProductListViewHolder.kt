package com.ambient.gameday.app.ui.screens.home.adapters.views.viewholders

import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListItem
import com.ambient.gameday.databinding.RecyclerItemProductListingBinding

class ProductListViewHolder(private val binding: RecyclerItemProductListingBinding) :
    BaseViewHolder<ProductListItem>(binding) {

    override fun bind(model: ProductListItem) {
        binding.productListItemRecycler.adapter = null
    }
}
