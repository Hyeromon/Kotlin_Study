class Person(name: String, age: Int) {
    var name = "홍길동"
        get() {
            println("name get() 호출")
            return field
        }
        set(value) {
             println("name set() 호출")
            field = value 
        }
    var age = 20
        get() {
             println("age get() 호출")
            return field  
        }
        set(value) {
             println("age set() 호출")
            field = value 
        }
}

fun main() {
    var p: Person = Person()
    println("${p.name} ${p.age}") 

    // p.name ="정년이"
    // p.age = 26
    // println("${p.name} ${p.age}") 
}
//??에러발생