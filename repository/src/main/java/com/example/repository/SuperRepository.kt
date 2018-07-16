package com.example.repository

class SuperRepository {

    val local: Local
    val rest: Rest

    init {
        local = Localmpl()
        rest = RestImpl()
    }
}