class Person {
    constructor(name: String, age: Int) {
        println("생성자 호출")
        this.name = name
        this.age = age
    }

    var name: String = ""
    var age: Int = 0
}

class Person1(name: String, age: Int) {
    var name: String = name
    var age: Int = age
}

class Person2(name: String, age: Int) {
    var name: String = name
    var age: Int = age
}

class Person3(name: String, age: Int) {
    var name: String = name
    var age: Int = age
}

class Person4(val name: String, val age: Int) {
    // 주 생성자에서 바로 변수 선언 (val로 선언)
}

fun main() {
    var p1: Person1 = Person1("tester1", 20)
    println(p1.name)
    println(p1.age)

    var p2: Person2 = Person2("tester2", 22)
    println(p2.name)
    println(p2.age)

    var p3: Person3 = Person3("tester3", 24)
    println(p3.name)
    println(p3.age)

    var p4: Person4 = Person4("tester4", 26)
    println(p4.name)  
    println(p4.age)   
}
