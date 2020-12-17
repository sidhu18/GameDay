package com.ambient.gameday.app.ui.screens.home.adapters.product

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.databinding.RecyclerItemProductBinding

class ProductItemViewHolder(private val binding: RecyclerItemProductBinding) :
    BaseViewHolder<ProductListItem>(binding) {
    override fun bind(model: ProductListItem) {
        binding.apply {
            productName.text = model.name
            sportName.text = model.sport
        }
    }

    companion object {
        fun from(parent: ViewGroup): ProductItemViewHolder {
            return ProductItemViewHolder(
                RecyclerItemProductBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }
}
