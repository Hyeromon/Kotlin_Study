package com.example

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val fileReader = FileReader("./text.txt")
    val br = BufferedReader(fileReader)

    try {
        var line: String?
        while (true) {
            line = br.readLine()
            if (line == null) { // EOF에 도달하면 종료
                break
            } else {
                println(line) // 읽은 내용을 출력
            }
        }
    } finally {
        br.close() // BufferedReader를 닫아 리소스 누수 방지
    }
}
