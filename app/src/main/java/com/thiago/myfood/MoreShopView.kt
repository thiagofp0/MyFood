package com.thiago.myfood

import android.graphics.drawable.GradientDrawable
import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.thiago.myfood.databinding.BannerItemBinding
import com.thiago.myfood.databinding.MoreShopItemBinding
import com.thiago.myfood.databinding.ShopItemBinding
import java.lang.Exception

class MoreShopView(viewGroup: ViewGroup) : ATViewHolder<MoreShop, MoreShopItemBinding>(
    MoreShopItemBinding::inflate,
    viewGroup
) {
    override fun bind(item: MoreShop) {
        Picasso.get().load(item.bannerUrl).into(binding.imgShop)
        binding.txtShop.text = item.text
        binding.txtStar.text = item.rate.toString()
        binding.txtSubtitle.text = itemView.context.getString(R.string.shop_category, item.category, item.distance)
        binding.txtPrice.text = itemView.context.getString(R.string.shop_price, item.time, item.price)
    }

}