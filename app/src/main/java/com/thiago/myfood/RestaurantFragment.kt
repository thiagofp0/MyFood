package com.thiago.myfood

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import co.tiagoaguiar.atway.ui.adapter.ATAdapter
import com.thiago.myfood.databinding.FragmentRestaurantBinding

class RestaurantFragment : Fragment(R.layout.fragment_restaurant){

    private var binding: FragmentRestaurantBinding? = null;

    private val categoryAdapter = ATAdapter({ CategoryView(it)})

    private var filters = arrayOf(
        FilterItem(1,"Ordenar", closeIcon = R.drawable.ic_baseline_keyboard_arrow_down_24),
        FilterItem(2,"Para retirar", icon = R.drawable.ic_baseline_directions_walk_24),
        FilterItem(3,"Entrega Grátis"),
        FilterItem(4,"Vale Refeição", closeIcon = R.drawable.ic_baseline_keyboard_arrow_down_24),
        FilterItem(5,"Distância", closeIcon = R.drawable.ic_baseline_keyboard_arrow_down_24),
        FilterItem(6,"Entrega Parceria"),
        FilterItem(7,"Super restaurante"),
        FilterItem(8,"Filtros", closeIcon = R.drawable.ic_baseline_filter_list_24)
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryAdapter.items = arrayListOf(
            Category(1, "https://www.ifood.com.br/static/images/categories/market.png", "Mecado", 0xFFB6D048),
            Category(2, "https://www.ifood.com.br/static/images/categories/restaurant.png", "Restaurante", 0xFFE91D2D),
            Category(3, "https://www.ifood.com.br/static/images/categories/drinks.png", "Bebidas", 0xFFF6D553),
            Category(4, "https://static-images.ifood.com.br/image/upload/f_auto/webapp/landingV2/express.png", "Express", 0xFFFFF0000),
            Category(5, "https://parceiros.ifood.com.br/static/media/salad.9db040c0.png", "Saudável", 0xFFE91D2D),
            Category(6, "https://www.ifood.com.br/static/images/categories/drinks.png", "Salgados", 0xFFF8C60C5),
        )

        binding = FragmentRestaurantBinding.bind(view)

        binding?.let {
            it.rvCategory.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            it.rvCategory.adapter = categoryAdapter
            filters.forEach { filter ->
                it.chipGroupFilter.addView(filter.toChip(requireContext()))
            }
        }
    }
}

