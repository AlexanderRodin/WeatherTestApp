package com.example.weatherapi_test

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapi_test.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}