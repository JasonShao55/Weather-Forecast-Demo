package com.example.nuaaweather.UI_Design.Places

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.nuaaweather.logic_codes.Repository
import com.example.nuaaweather.logic_codes.model.Place

//介于UI和logic_codes之间的层
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()
    //对界面上显示的城市数据进行缓存，便于UI相关代码中调用
    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)      //调用仓库中的searchPlaces发出网络查找请求
    }
    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}