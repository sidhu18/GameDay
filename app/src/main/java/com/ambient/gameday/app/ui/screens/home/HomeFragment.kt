package com.ambient.gameday.app.ui.screens.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.ambient.gameday.app.ui.base.BaseFragment
import com.ambient.gameday.app.ui.screens.home.adapters.ProductListingAdapter
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListHeader
import com.ambient.gameday.app.ui.screens.home.adapters.views.ProductListView
import com.ambient.gameday.databinding.FragmentHomeBinding
import javax.inject.Inject

class HomeFragment @Inject constructor(
    private val productListingAdapter: ProductListingAdapter
) : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val viewModel: HomeViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentHomeBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setView()
        setData()
    }

    private fun setData() {
        val items: List<ProductListView> = mutableListOf(
            ProductListHeader("345", "Trending")
        )
        productListingAdapter.productList = items
    }

    private fun setView() {
        binding.productsRecycler.adapter = productListingAdapter
    }
}
