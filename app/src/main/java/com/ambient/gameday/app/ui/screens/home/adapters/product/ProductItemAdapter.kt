package com.ambient.gameday.app.ui.screens.home.adapters.product

import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ambient.gameday.app.ui.base.BaseViewHolder

class ProductItemAdapter : RecyclerView.Adapter<BaseViewHolder<ProductListItem>>() {

    private val differ = AsyncListDiffer(
        this,
        ProductItemDiffer
    )

    var productList: List<ProductListItem>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ProductListItem> {
        return ProductItemViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<ProductListItem>, position: Int) {
        holder.bind(productList[position])
    }

    override fun getItemCount() = productList.size

    object ProductItemDiffer : DiffUtil.ItemCallback<ProductListItem>() {
        override fun areItemsTheSame(oldItem: ProductListItem, newItem: ProductListItem) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: ProductListItem,
            newItem: ProductListItem
        ) = oldItem == newItem
    }
}
