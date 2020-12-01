package com.ambient.gameday.app.ui.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<T, VB : ViewBinding>(binding: VB) :
    RecyclerView.ViewHolder(binding.root), ViewBinder<T>