package com.example.mytestcoverageapp.utils

interface ConnectivityManager {

    fun isConnected(): Boolean

}

class ConnectivityManagerImpl: ConnectivityManager {

    override fun isConnected(): Boolean {
        return true
    }

}