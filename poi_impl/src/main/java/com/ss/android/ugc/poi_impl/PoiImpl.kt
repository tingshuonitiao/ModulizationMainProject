package com.ss.android.ugc.poi_impl

import android.util.Log
import com.ss.android.ugc.base.ServiceManager
import com.ss.android.ugc.enterprise_api.IEnterpriseApi
import com.ss.android.ugc.poi_api.IPoiApi

class PoiImpl : IPoiApi {
    override fun init() {
        val greeting = ServiceManager.getService(IEnterpriseApi::class.java)?.getGreeting()
        Log.e("zxz", "get enterprise greeting: $greeting")
    }

    override fun getGreeting(): String {
        return "PoiHello"
    }
}