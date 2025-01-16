data class Person(val name:String, val age: Int, val gender: String)

fun main(){
    val p =Person("홍길동", 30, "Male")

    val (name, age, gender) = p

    println(name)
    println(age)
    println(gender)

    //componentN 형식
    println("[componentN] ")
    println(p.component1())
    println(p.component2())
    println(p.component3())
}