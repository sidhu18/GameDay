package com.ambient.gameday.app.commons.utils.extensions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.annotation.LayoutRes
import androidx.core.view.get

fun View.hideKeyboard() {
    val inm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inm.hideSoftInputFromWindow(windowToken, 0)
}

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}


fun View.invisible() {
    visibility = View.INVISIBLE
}

fun ViewGroup.inflateLayout(@LayoutRes layoutRes: Int, attachToRoot: Boolean): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

val ViewGroup.views: List<View>
    get() = (0 until childCount).map { get(it) }