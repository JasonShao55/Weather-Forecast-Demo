package com.example.nuaaweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class NuaaWeatherApplication : Application() {


    companion object {

        const val key = "1261d309d4f8472fb18af845417a44f8"   //填和风天气的用户key，类型是安卓SDK，和PC区分

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}

