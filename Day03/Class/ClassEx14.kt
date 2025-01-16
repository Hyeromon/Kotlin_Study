class Person1(var name:String, var age:Int)
data class Person2(val name:String, val age:Int)
//toString() / copy() / equals() / hashcode()

fun main(){
    var p1: Person1 = Person1("홍길동", 22)
    println(p1)
    println(p1.toString())
    println(p1.name)
    println(p1.age)
    
    // var p4:Person = p1.copy(name="박문수")
    // println(p4.toString())

    var p2: Person2 = Person2("홍길동", 22)
    println(p2)
    println(p2.toString())
    println(p2.name)
    println(p2.age)

    var p3: Person2 = p2.copy(name="박문수")
    println(p3.toString())

}