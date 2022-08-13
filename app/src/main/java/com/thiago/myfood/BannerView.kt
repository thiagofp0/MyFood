package com.thiago.myfood

import android.graphics.drawable.GradientDrawable
import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.thiago.myfood.databinding.BannerItemBinding
import java.lang.Exception

class BannerView(viewGroup: ViewGroup) : ATViewHolder<Banner, BannerItemBinding>(
    BannerItemBinding::inflate,
    viewGroup
) {

    override fun bind(item: Banner) {
        Picasso.get().load(item.bannerUrl).into(binding.imgBanner)
    }

}