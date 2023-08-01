/*
* 用于访问天气城市搜索API的Retrofit接口
* */

package com.example.nuaaweather.logic_codes.network

import com.example.nuaaweather.NuaaWeatherApplication           //路径不要出错！
import com.example.nuaaweather.logic_codes.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    //当调用searchPlaces()方法的时候，Retrofit就会自动发起一条GET请求，去访问@GET注解中配置的地址。

    //按照天气API文档中的域名格式
    //这两行代码就是访问 https://geoapi.qweather.com/v2/city/lookup?location=beij&key=你的KEY
    //searchPlaces()返回最终的结果

    @GET("v2/city/lookup?token=${NuaaWeatherApplication.key}")             //改成英语可以加&lang=en
    fun searchPlaces(@Query("location") query: String): Call<PlaceResponse>

}