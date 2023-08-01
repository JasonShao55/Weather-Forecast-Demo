package com.example.nuaaweather.logic_codes.model

//PlaceResponse中的类完全按照JSON字段返回的格式定义

import com.google.gson.annotations.SerializedName


/*
data class PlaceResponse(val status: String, val places: List<Place>)

                                                           //SerializedName注解,将原有JSON注解成下面这样
data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)

 */
data class PlaceResponse(val code: String, val location: List<Place>, val refer:List<Reference>)

data class Place(val name: String, val id:String ,val location: Location,val adm2:String, val adm1:String, val country:String,
            val tz:String,val utcOffset:String, val isDst:String,  val type:String,  val rank:String,  val fxLink:String)


data class Location(val lat: String, val lon: String)

data class Reference(val sources: String,val license: String)