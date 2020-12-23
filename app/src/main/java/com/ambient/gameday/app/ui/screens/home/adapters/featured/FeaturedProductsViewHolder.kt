package com.ambient.gameday.app.ui.screens.home.adapters.featured

import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.product.ProductItemAdapter
import com.ambient.gameday.databinding.RecyclerItemProductHeaderBinding

class FeaturedProductsViewHolder(private val binding: RecyclerItemProductHeaderBinding) :
    BaseViewHolder<FeaturedProductModel>(binding) {

    override fun bind(model: FeaturedProductModel) {
        binding.apply {
            productHeader.text = model.header
            val productItemAdapter = ProductItemAdapter()
            productListItemRecycler.adapter = productItemAdapter
            productItemAdapter.productList = model.productList
        }
    }
}
