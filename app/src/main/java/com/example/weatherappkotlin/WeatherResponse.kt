package com.example.weatherappkotlin

data class WeatherResponse(
    val latitude: Double,
    val longitude: Double,
    val current: CurrentWeather,
    val hourly: HourlyWeather,
    val daily: DailyWeather
)

data class CurrentWeather(
    val time: String,
    val temperature_2m: Double,
    val weather_code: Int,
    val apparent_temperature: Double
)

data class HourlyWeather(
    val time: List<String>,
    val temperature_2m: List<Double>,
    val weather_code: List<Int>,
    val precipitation_probability: List<Int>
)

data class DailyWeather(
    val time: List<String>,
    val weather_code: List<Int>,
    val temperature_2m_max: List<Double>,
    val temperature_2m_min: List<Double>,
    val apparent_temperature_min: List<Double>
)
