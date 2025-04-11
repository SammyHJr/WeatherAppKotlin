package com.example.weatherappkotlin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.lifecycle.viewModelScope
import com.example.weatherappkotlin.WeatherRepository
import com.example.weatherappkotlin.WeatherResponse
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class WeatherViewModel {
    private val repository = WeatherRepository()

    private val _weatherData = MutableStateFlow<WeatherResponse?>(null)
    val  weatherData: StateFlow<WeatherResponse?> = _weatherData

    fun fetchWeather(lat: Double, lon: Double){
        viewModelScope.launch {
            try {
                val response = repository.getWeather(lat,lon)
                _weatherData.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}