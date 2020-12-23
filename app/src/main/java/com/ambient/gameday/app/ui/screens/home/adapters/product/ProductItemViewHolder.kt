package com.ambient.gameday.app.ui.screens.home.adapters.product

import android.view.LayoutInflater
import android.view.ViewGroup
import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.databinding.RecyclerItemProductBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ProductItemViewHolder(private val binding: RecyclerItemProductBinding) :
    BaseViewHolder<ProductListItem>(binding) {

    private val glide = Glide.with(binding.root.context).setDefaultRequestOptions(
        RequestOptions()
    )

    override fun bind(model: ProductListItem) {
        binding.apply {
            productName.text = model.name
            sportName.text = model.sport
            glide.load(model.imageUrl).into(productImage)
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
