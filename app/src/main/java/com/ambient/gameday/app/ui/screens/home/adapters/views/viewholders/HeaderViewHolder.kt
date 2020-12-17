package com.ambient.gameday.app.ui.screens.home.adapters.views.viewholders

import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListHeader
import com.ambient.gameday.databinding.RecyclerItemProductHeaderBinding

class HeaderViewHolder(private val binding: RecyclerItemProductHeaderBinding) :
    BaseViewHolder<ProductListHeader>(binding) {

    override fun bind(model: ProductListHeader) {
        binding.productHeader.text = model.header
    }
}
