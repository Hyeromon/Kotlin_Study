class Student {
    fun doFunc1() {
        var data: Int = 10
        println("doFunc1() 호출 : ${data}")
    }

    fun doFunc2(data1: Int) {
        println("doFunc2() 호출 : $data1")
    }

    fun doFunc3(data1: Int, data2: String) {
        println("doFunc3() 호출 : $data1")
        println("doFunc3() 호출 : $data2")
    }

    fun doFunc4(data1: Int, data2: Int): Int {
        var sum = data1 + data2
        return sum
    }
}

fun main() {
    var s: Student = Student()
    
    s.doFunc1()
    
    s.doFunc2(20)
    
    s.doFunc3(30, "Hello")
    
    val result = s.doFunc4(40, 50)
    println("doFunc4() 호출 결과 : $result")
}
