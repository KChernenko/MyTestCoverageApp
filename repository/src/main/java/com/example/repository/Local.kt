package com.example.repository

interface Local {

    fun getData(): Int

}

class Localmpl: Local {

    override fun getData(): Int {
        return Int.MAX_VALUE
    }

}