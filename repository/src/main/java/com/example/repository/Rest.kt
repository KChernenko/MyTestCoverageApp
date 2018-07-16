package com.example.repository

interface Rest {

    fun getData(): Int

}

class RestImpl: Rest {

    override fun getData(): Int {
        return Int.MAX_VALUE
    }

}