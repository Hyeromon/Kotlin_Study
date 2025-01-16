class Person{
    var name : String = "tester"
    var age: Int =20
}

fun main(){
    var p1: Person = Person()
    println( p1 )
    println(p1.name)
    println(p1.age)

    var p2: Person = Person()
    println( p2 )

    println(p2.name)
    println(p2.age)
}