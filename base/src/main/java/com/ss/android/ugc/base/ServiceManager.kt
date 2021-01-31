package com.ss.android.ugc.base

import java.util.*

object ServiceManager {

    fun <T> getService(service: Class<T>): T? {
        val load = ServiceLoader.load(service)
        val iterator = load.iterator()
        while (iterator.hasNext()) {
            return iterator.next()
        }
        return null
    }
}