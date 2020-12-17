package com.ambient.gameday.app.ui.base

import android.view.ViewGroup

interface ViewHolderProvider<T> {
    fun getViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T>
}
