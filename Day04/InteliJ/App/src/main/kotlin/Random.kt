package com.example

import kotlin.random.Random

fun main(){
    var list = List(10){Random.nextInt(0,100)}
    println("0-100까지 번호 랜덤 추첨 : ${list}")

    for(i in 0 .. 5) {
        var lotto = List(6) { Random.nextInt(1, 46) }
        println("lotto번호 추첨 : ${lotto}")
    }
}

