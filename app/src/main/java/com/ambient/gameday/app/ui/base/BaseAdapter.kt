package com.ambient.gameday.app.ui.base

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseAdapter<T, VB : ViewBinding, VH : BaseViewHolder<T, VB>> :
    RecyclerView.Adapter<BaseViewHolder<T, VB>>() {

    protected abstract val differ: AsyncListDiffer<T>

    var items: List<T>
        get() = differ.currentList
        set(value) = differ.submitList(value)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T, VB> {
        val binding: VB = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            getLayout(),
            parent,
            false
        )
        return getViewHolder(binding)
    }

    abstract fun getViewHolder(binding: VB): VH

    abstract fun getLayout(): Int

    override fun onBindViewHolder(holder: BaseViewHolder<T, VB>, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    var listener: ((view: View, item: T, position: Int) -> Unit)? = null

}