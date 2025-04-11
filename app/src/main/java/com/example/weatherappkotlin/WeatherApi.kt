package com.example.weatherappkotlin

import retrofit2.http.GET
import retrofit2.http.Query



interface WeatherApi {
    @GET("v1/forecast")
    suspend fun getWeather (
        @Query("latitude") lat: Double,
        @Query("longitude") lon: Double,
        @Query("Daily") daily: String = "weather_code, temperature_2m_max, temperature_2m_min",
        @Query("hourly") hourly: String = "temprature_2m",
        @Query("current") current: String = "temprature_2m, weather_code, apparent_temprature",
        @Query("timezone") timezone: String = "Asia/Bangkok"
    ):  WeatherResponse
}