package com.example.nuaaweather.logic_codes.network

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine



//【重要】统一的网络数据源访问入口，对所有网络请求的API进行封装
object NuaaWeatherNetwork {

    //placeService数据结构
    private val placeService = ServiceCreator.create(PlaceService::class.java)

    //调用刚刚在PlaceService接口中定义的searchPlaces()方法，查找城市
    suspend fun searchPlaces(query: String) = placeService.searchPlaces(query).await()

    //定义await函数(挂起函数，执行await的时候应用暂停，直到await返回值)
    private suspend fun <T> Call<T>.await(): T {
        //Kotlin的协程机制，suspendCoroutine()挂起当前协程，等待返回值
        return suspendCoroutine{ continuation ->
            enqueue(object : Callback<T> {
                override fun onResponse(call: Call<T>, response: Response<T>) {
                    val body = response.body()     //body()方法返回用户请求的数据
                                                    //此处是searchPlaces()调用，返回被搜索的城市数据（string类型）
                    if (body != null) continuation.resume(body)
                    else
                        //如果body是空的，也要抛出异常
                        continuation.resumeWithException(
                        RuntimeException("response body is null"))
                }
                override fun onFailure(call: Call<T>, t: Throwable) {
                    //网络请求失败，抛出异常
                    continuation.resumeWithException(t)
                }
            })
        }
    }

}