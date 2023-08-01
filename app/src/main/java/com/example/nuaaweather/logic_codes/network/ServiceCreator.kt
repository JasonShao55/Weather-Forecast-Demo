package com.example.nuaaweather.logic_codes.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//为了能够使用定义好了的PlaceService接口
object ServiceCreator {

    private const val BASE_URL = "https://geoapi.qweather.com/"   //试验和风天气API

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)

}

