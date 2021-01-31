package com.ss.android.ugc.enterprise_impl

import android.util.Log
import com.ss.android.ugc.base.ServiceManager
import com.ss.android.ugc.enterprise_api.IEnterpriseApi
import com.ss.android.ugc.poi_api.IPoiApi

class EnterpriseImpl : IEnterpriseApi {
    override fun init() {
        val greeting = ServiceManager.getService(IPoiApi::class.java)?.getGreeting()
        Log.e("zxz", "get poi greeting: $greeting")
    }

    override fun getGreeting(): String {
        return "EnterpriseHello"
    }
}