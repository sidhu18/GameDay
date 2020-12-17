package com.ambient.gameday.app.ui.screens.home.adapters.listing.views

import com.ambient.gameday.app.ui.components.Visitor

interface ProductListView : Visitor {
    val id: String
    override fun equals(other: Any?): Boolean
}
