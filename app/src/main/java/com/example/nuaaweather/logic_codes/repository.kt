package com.example.nuaaweather.logic_codes

import androidx.lifecycle.liveData
import com.example.nuaaweather.logic_codes.model.Place
import com.example.nuaaweather.logic_codes.network.NuaaWeatherNetwork
import kotlinx.coroutines.Dispatchers


/*
* repository（仓库）用于暂时存放网络接口返回的数据，将异步获取的数据返回上一层，类似本地缓存（区别在于这里不创建本地文件）
* */

object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = NuaaWeatherNetwork.searchPlaces(query)
            if (placeResponse.code == "200") {
                val places = placeResponse.location
                Result.success(places)
            } else {
                //异常处理  code不是200
                Result.failure(RuntimeException("response code is${placeResponse.code}, which isn't '200'"))
            }
        } catch (e: Exception) {
            //异常处理
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}
