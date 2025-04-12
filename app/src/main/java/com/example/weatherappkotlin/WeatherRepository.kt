package com.example.weatherappkotlin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeatherRepository {
    private val api: WeatherApi
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.open-meteo.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        api = retrofit.create(WeatherApi::class.java)
    }

    suspend fun getWeather(lat: Double, lon: Double) : WeatherResponse {
        return api.getWeather(lat,lon)
    }
}