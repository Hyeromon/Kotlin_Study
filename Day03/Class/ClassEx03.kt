//생성자 오버로딩
class Person {
    var name: String =""
    var age: Int = 0

    // 주 생성자
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    // 보조 생성자 1
    constructor(name: String) {
        this.name = name
        this.age = 20
    }

    // 보조 생성자 2
    constructor() {
        this.name = "홍길동"
        this.age = 22
    }
}

fun main(){
    var p1: Person = Person("박문수", 26)
    println( "${p1.name}은/는 ${p1.age}살이다")

    var p2: Person = Person("이몽룡")
    println( "${p2.name}은/는 ${p2.age}살이다")

    var p3: Person = Person()
    println( "${p3.name}은/는 ${p3.age}살이다")
}