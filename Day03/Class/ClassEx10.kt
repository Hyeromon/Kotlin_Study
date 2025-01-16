class Person(name: String, age: Int) {
    var name = name
        get() {
            println("name get() 호출")
            return field
        }
        // private set(value) {
        //      println("name set() 호출")
        //     field = value 
        // }
        private set

    var age = age
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
    var p: Person = Person("박문수", 22)
    println("${p.name} ${p.age}") 

    //p.name ="정년이"
    p.age = 26
    println("${p.name} ${p.age}") 
}
