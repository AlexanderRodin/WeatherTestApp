package com.example.weatherapi_test.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.weatherapi_test.R
import com.example.weatherapi_test.adapters.WeatherAdapter
import com.example.weatherapi_test.adapters.WeatherModel
import com.example.weatherapi_test.databinding.FragmentHoursBinding


class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecView()
    }

    private fun initRecView() = with(binding){
        rcViewHours.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcViewHours.adapter = adapter

        val list = listOf(
            WeatherModel("","12:00",
                "Sunny", "25 C", "",
                "", "", ""),
            WeatherModel("","13:00",
                "Sunny", "27 C", "",
                "", "", ""),
            WeatherModel("","14:00",
                "Sunny", "30 C", "",
                "", "", "")
        )

        adapter.submitList(list)
    }

    companion object {

        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}