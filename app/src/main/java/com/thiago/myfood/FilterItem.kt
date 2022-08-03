package com.thiago.myfood

import android.content.Context
import android.view.ContextThemeWrapper
import com.google.android.material.chip.Chip

data class FilterItem(val text: String)

fun FilterItem.toChip(context: Context) : Chip {
    val chip = Chip(ContextThemeWrapper(context, com.google.android.material.R.style.Widget_MaterialComponents_Chip_Choice))
    chip.text = text
    return chip
}