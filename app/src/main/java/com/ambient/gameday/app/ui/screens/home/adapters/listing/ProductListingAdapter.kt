package com.ambient.gameday.app.ui.screens.home.adapters.listing

import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.listing.views.ProductListView
import com.ambient.gameday.app.ui.screens.home.adapters.listing.views.typefactory.ProductListTypeFactory
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class ProductListingAdapter @Inject constructor() :
    RecyclerView.Adapter<BaseViewHolder<ProductListView>>() {

    @Inject
    lateinit var productListTypeFactory: ProductListTypeFactory

    private val differ = AsyncListDiffer(
        this,
        ProductListDiffer
    )

    var productList: List<ProductListView>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ProductListView> {
        return productListTypeFactory.holder(viewType, parent) as BaseViewHolder<ProductListView>
    }

    override fun onBindViewHolder(
        holder: BaseViewHolder<ProductListView>,
        position: Int
    ) = holder.bind(productList[position])

    override fun getItemViewType(
        position: Int
    ) = productList[position].type(productListTypeFactory)

    override fun getItemCount() = productList.size

    object ProductListDiffer : DiffUtil.ItemCallback<ProductListView>() {

        override fun areItemsTheSame(
            oldItem: ProductListView,
            newItem: ProductListView
        ) = oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: ProductListView,
            newItem: ProductListView
        ) = oldItem == newItem
    }
}
