package com.ambient.gameday.app.ui.base

interface ViewBinder<T> {
    fun bind(model : T)
}