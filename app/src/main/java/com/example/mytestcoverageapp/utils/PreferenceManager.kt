package com.example.mytestcoverageapp.utils

interface PreferenceManager {

    fun saveInt(someInt: Int)

    fun getInt(): Int

}

class PreferenceManagerImpl: PreferenceManager {

    override fun saveInt(someInt: Int) {

    }

    override fun getInt(): Int {
        return Int.MAX_VALUE
    }

}