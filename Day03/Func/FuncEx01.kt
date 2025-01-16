fun doFunc1() {
    println("doFunc1() 호출")
}

fun doFunc2(): Unit {
    println("doFunc2() 호출")
}

fun doFun3(a: Int, b: Int) {
    println("doFun3() 호출 - a: $a, b: $b")
}

fun doFun4(a: Int, b: Int) {
    println("doFun4() 호출 - a: $a, b: $b")
}

fun main() {
    doFunc1()
    doFunc2()
    doFun3(10, 29)
    doFun4(10, 20)
}
