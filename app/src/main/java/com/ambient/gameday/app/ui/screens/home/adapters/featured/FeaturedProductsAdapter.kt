package com.ambient.gameday.app.ui.screens.home.adapters.featured

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.databinding.RecyclerItemProductHeaderBinding
import javax.inject.Inject

class FeaturedProductsAdapter @Inject constructor() : RecyclerView.Adapter<BaseViewHolder<FeaturedProductModel>>() {

    var featuredProductList: List<FeaturedProductModel>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    private var differ = AsyncListDiffer(
        this,
        FeaturedProductsAsyncDiffer
    )

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<FeaturedProductModel> {
        val binding = RecyclerItemProductHeaderBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return FeaturedProductsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<FeaturedProductModel>, position: Int) {
        holder.bind(featuredProductList[position])
    }

    override fun getItemCount() = featuredProductList.size
}
