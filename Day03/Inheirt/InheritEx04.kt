open class BasePerson {
    var name: String = ""
    var age: Int = 0

    constructor(name: String) {
        this.name = name
        this.age = 10
        println("BasePerson 생성자 호출: $name, $age")
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        println("BasePerson 생성자 호출: $name, $age")
    }
}

class FootballPlayer : BasePerson {
    constructor(name: String) : this(name, 10)  
    constructor(name: String, age: Int) : super(name, age) // 부모 클래스 생성자 호출

    fun playFootball() {
        println("$name is playing football!")
    }
}

fun main() {
    val player1 = FootballPlayer("Cane")
    player1.playFootball()

    val player2 = FootballPlayer("Son", 30)
    player2.playFootball()
}
