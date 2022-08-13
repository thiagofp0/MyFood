package com.thiago.myfood

import android.graphics.drawable.GradientDrawable
import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.thiago.myfood.databinding.BannerItemBinding
import com.thiago.myfood.databinding.ShopItemBinding
import java.lang.Exception

class ShopView(viewGroup: ViewGroup) : ATViewHolder<Shop, ShopItemBinding>(
    ShopItemBinding::inflate,
    viewGroup
) {
    override fun bind(item: Shop) {
        Picasso.get().load(item.bannerUrl).into(binding.imgShop)
        binding.txtShop.text = item.text
    }

}