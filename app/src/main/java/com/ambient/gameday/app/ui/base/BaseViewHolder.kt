package com.ambient.gameday.app.ui.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<T>(binding: ViewBinding) :
    RecyclerView.ViewHolder(binding.root), ViewBinder<T>
