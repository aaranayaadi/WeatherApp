package com.example.weatherapp.Repository

import com.example.weatherapp.Server.ApiServices

class WeatherRepository(val api:ApiServices) {

    fun getCurrentWeather(lat: Double, lng:Double, unit:String)=
        api.getCurrentWeatherData(lat, lng, unit, "67b057ae7c35771773385403a8db8d20")

    fun getForecastWeather(lat: Double, lng:Double, unit:String)=
        api.getForecastWeather(lat, lng, unit, "67b057ae7c35771773385403a8db8d20")
}