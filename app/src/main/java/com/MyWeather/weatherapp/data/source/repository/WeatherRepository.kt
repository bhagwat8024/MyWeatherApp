package com.MyWeather.weatherapp.data.source.repository

import com.MyWeather.weatherapp.data.model.LocationModel
import com.MyWeather.weatherapp.data.model.Weather
import com.MyWeather.weatherapp.data.model.WeatherForecast
import com.MyWeather.weatherapp.utils.Result

interface WeatherRepository {

    suspend fun getWeather(location: LocationModel, refresh: Boolean): Result<Weather?>

    suspend fun getForecastWeather(cityId: Int, refresh: Boolean): Result<List<WeatherForecast>?>

    suspend fun getSearchWeather(location: String): Result<Weather?>

    suspend fun storeWeatherData(weather: Weather)

    suspend fun storeForecastData(forecasts: List<WeatherForecast>)

    suspend fun deleteWeatherData()

    suspend fun deleteForecastData()
}