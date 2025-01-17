package com.example

import java.io.File

fun main(){
    //디렉토리 내부 목록
    var file: File = File("/Users/songhyewon/Kotlin_Study")

    //자식
    var lists = file.list()
    //listFile()
    println(lists.contentToString())

//    var lists2 = file.walk()
//    println(lists2)

    //자식 - 손자까지 나옴(recusive)
    file.walk().forEach {
        println(it)
    }
}