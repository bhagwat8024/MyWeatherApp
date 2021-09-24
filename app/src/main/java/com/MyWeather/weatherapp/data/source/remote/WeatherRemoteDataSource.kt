package com.MyWeather.weatherapp.data.source.remote

import com.MyWeather.weatherapp.data.model.LocationModel
import com.MyWeather.weatherapp.data.model.NetworkWeather
import com.MyWeather.weatherapp.data.model.NetworkWeatherForecast
import com.MyWeather.weatherapp.utils.Result

interface WeatherRemoteDataSource {
    suspend fun getWeather(location: LocationModel): Result<NetworkWeather>

    suspend fun getWeatherForecast(cityId: Int): Result<List<NetworkWeatherForecast>>

    suspend fun getSearchWeather(query: String): Result<NetworkWeather>
}