package com.MyWeather.weatherapp

import android.app.Application
import com.MyWeather.weatherapp.data.source.repository.WeatherRepository

class WeatherApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }

    val weatherRepository: WeatherRepository
        get() = ServiceLocator.provideWeatherRepository(this)

}