package com.example.misturador

import kotlin.random.Random

class PrimeiraCor {

    constructor(){
    }

    fun setCores(): ArrayList<Int> {
        var cores = ArrayList<Int>()
        while (cores.size < 3){
            cores.add(Random.nextInt(0,255))
        }
        return cores
    }
}