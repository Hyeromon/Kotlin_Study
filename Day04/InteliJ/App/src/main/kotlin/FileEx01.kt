package com.example

import java.io.File

fun main(){
    //현재 경로
    //java.lang.System
    ///Users/songhyewon/Kotlin_Study/Day04/InteliJ/App
    println(System.getProperty("user.dir"))

    var file: File =File("./")
    println(file.path)
    println(file.absolutePath)
    println(file.canonicalPath)

    var file2:File =File("./zipcode_seoul_utf8_type2.csv")
    if(file2.exists()){
        println("있음")
    }else{
        println("없음")
    }

    //isDirectory
    if(file2.isFile){
        println("File")
    }else{
        println("Directory")
    }

    println(file2.length()) //용량
    println(file2.lastModified()) //마지막 수정 시간
}