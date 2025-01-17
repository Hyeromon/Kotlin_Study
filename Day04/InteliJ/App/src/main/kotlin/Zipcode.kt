package com.example

import java.io.BufferedReader
import java.io.FileReader

fun main(){
    val br= BufferedReader(FileReader("./zipcode_seoul_utf8_type2.csv"))

    var line:String? = null
    while(true){
        line = br.readLine()
        if(line == null){
            break
        }else{
            val addresses = line.split(",")
            println(addresses[3])
        }
    }
    br.close()
}