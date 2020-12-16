package com.ambient.gameday.app.ui.screens.home.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ambient.gameday.app.ui.base.BaseViewHolder
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListView
import com.ambient.gameday.app.ui.screens.home.adapters.views.typefactory.ProductListTypeFactory

class ProductListingAdapter(
    var productList: List<ProductListView>,
    private val productListTypeFactory: ProductListTypeFactory
) : RecyclerView.Adapter<BaseViewHolder<ProductListView>>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ProductListView> {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BaseViewHolder<ProductListView>, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int) = productList[position].type(productListTypeFactory)

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
