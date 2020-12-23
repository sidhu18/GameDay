package com.ambient.gameday.app.ui.screens.home.adapters.featured

import androidx.recyclerview.widget.DiffUtil

object FeaturedProductsAsyncDiffer : DiffUtil.ItemCallback<FeaturedProductModel>() {
    override fun areItemsTheSame(
        oldItem: FeaturedProductModel,
        newItem: FeaturedProductModel
    ) = oldItem.id == newItem.id

    override fun areContentsTheSame(
        oldItem: FeaturedProductModel,
        newItem: FeaturedProductModel
    ) = oldItem == newItem
}
