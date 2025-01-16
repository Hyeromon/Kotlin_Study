class Person(var name:String = "홍길동", var age:Int = 26)

fun main() {
    var p1: Person = Person("박문수", 22)
    println("${p1.name}은/는 ${p1.age}살이다")

    var p2: Person = Person("이몽룡")
    println("${p2.name}은/는 ${p2.age}살이다")

    var p3: Person = Person()
    println("${p3.name}은/는 ${p3.age}살이다")
}