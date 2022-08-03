package com.thiago.myfood

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.thiago.myfood.databinding.FragmentRestaurantBinding

class RestaurantFragment : Fragment(R.layout.fragment_restaurant){

    private var binding: FragmentRestaurantBinding? = null;

    private var filters = arrayOf(
        FilterItem("Ordenar"),
        FilterItem("Para retirar"),
        FilterItem("Entrega Grátis"),
        FilterItem("Vale Refeição"),
        FilterItem("Entrega Parceria"),
        FilterItem("Super restaurante"),
        FilterItem("Filtros")
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRestaurantBinding.bind(view)

        binding?.let { filters.forEach { filter ->
                it.chipGroupFilter.addView(filter.toChip(requireContext()))
            }
        }
    }
}

