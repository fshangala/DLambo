package com.fshangala.dlambo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Dictionary

class DViewModel : ViewModel() {
    var menuItems = MutableLiveData<Array<String>>(arrayOf("Connections"))
    var connections = MutableLiveData<Array<Map<String,String>>>(arrayOf(mapOf(Pair("devicetype","android 11"),Pair("datetime","2023-07-07T00:00"))))
}