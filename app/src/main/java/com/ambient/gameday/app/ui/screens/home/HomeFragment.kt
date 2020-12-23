package com.ambient.gameday.app.ui.screens.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.ambient.gameday.app.ui.base.BaseFragment
import com.ambient.gameday.app.ui.screens.home.adapters.featured.FeaturedProductModel
import com.ambient.gameday.app.ui.screens.home.adapters.featured.FeaturedProductsAdapter
import com.ambient.gameday.app.ui.screens.home.adapters.product.ProductListItem
import com.ambient.gameday.databinding.FragmentHomeBinding
import javax.inject.Inject

class HomeFragment @Inject constructor(
    private val featuredProductsAdapter: FeaturedProductsAdapter
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
        val products: List<ProductListItem> = mutableListOf(
            ProductListItem(
                "product_list_678",
                "Yonex Nanoray",
                "https://images.unsplash.com/photo-1599391398131-cd12dfc6c24e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=354&q=80",
                "Badminton",
                1678
            ),
            ProductListItem(
                "product_list_658",
                "Yonex Nanoray",
                "https://images.unsplash.com/photo-1599391398131-cd12dfc6c24e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=354&q=80",
                "Badminton",
                1678
            ),
            ProductListItem(
                "product_list_6748",
                "Yonex Nanoray",
                "https://images.unsplash.com/photo-1599391398131-cd12dfc6c24e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=354&q=80",
                "Badminton",
                1678
            ),
            ProductListItem(
                "product_list_6738",
                "Yonex Nanoray",
                "https://images.unsplash.com/photo-1599391398131-cd12dfc6c24e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=354&q=80",
                "Badminton",
                1678
            ),
            ProductListItem(
                "product_list_6728",
                "Yonex Nanoray",
                "https://images.unsplash.com/photo-1599391398131-cd12dfc6c24e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=354&q=80",
                "Badminton",
                1678
            ),
            ProductListItem(
                "product_list_6718",
                "Yonex Nanoray",
                "https://images.unsplash.com/photo-1599391398131-cd12dfc6c24e?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=354&q=80",
                "Badminton",
                1678
            ),
        )

        val items: List<FeaturedProductModel> = mutableListOf(
            FeaturedProductModel("345", "Trending", products)
        )
        featuredProductsAdapter.featuredProductList = items
    }

    private fun setView() {
        binding.productsRecycler.adapter = featuredProductsAdapter
    }
}
