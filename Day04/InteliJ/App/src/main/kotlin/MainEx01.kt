package com.example

import kotlin.math.*


fun main(){
    var x:Double = 5.7
    var y:Double = 5.5
    var z:Double = 5.3

    println("ceil")

    println("${ceil(x)}")
    println("${ceil(y)}")
    println("${ceil(z)}")

    println("floor")

    println("${floor(x)}")
    println("${floor(y)}")
    println("${floor(z)}")

    println("round")

    println("${round(x)}")
    println("${round(y)}")
    println("${round(z)}")

    println("random")

    var intRange: IntRange = 1 until 10

    println(intRange.random())
    println(intRange.random())



}