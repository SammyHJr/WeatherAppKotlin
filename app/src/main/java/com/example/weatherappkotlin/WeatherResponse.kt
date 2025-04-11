package com.example.weatherappkotlin

import android.health.connect.datatypes.units.Temperature

data class WeatherResponse(
    val latitude : Double,
    val longitude: Double,
    val timezone: String,
    val timezone_abbrevitation: String,
    val current: CurrentWeather,
    val daily: DailyWeather,
    val hourly: HourlyWeather
)

data class CurrentWeather(
    val time: String,
    val tempreture_2m: Double,
    val weather_code: Int,
    val apparentTemprature: Double
)

data class DailyWeather(
    val time: List<String>,
    val weather_code: List<Int>,
    val temperature_2m_max: List<Double>,
    val temprature_2m_min: List<Double>,
    val apparent_temprature_min: List<Double>
)

data class HourlyWeather(
    val time: List<String>,
    val temprature_2m: List<Double>,
    val weather_code: List<Int>,
    val precipitation_probabalility: List<Int>
)

