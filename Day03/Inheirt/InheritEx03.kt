open class BasePerson(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    fun talk() {
        println("$name 이고 $age 입니다.")
    }

    fun walk() {
        println("$name 은(는) 걷는다")
    }
}

open class BasePerson2(name: String, age: Int, club: String) {
    var name: String = name
    var age: Int = age
    var club: String = club

    fun talk() {
        println("$name 이고 $age 입니다.")
    }

    fun walk() {
        println("$name 은(는) 걷는다")
    }
}

class FootballPlayer(name: String, age: Int, club: String) : BasePerson(name, age) {
    init {
        println("$name, $age, $club")
    }

    fun playFootball() {
        println("Play Football..")
    }
}

class FootballPlayer2(name: String, age: Int, club: String = "클럽명") : BasePerson2(name, age, club) {
    init {
        println("$name, $age, $club")
    }

    fun playFootball() {
        println("Play Football..")
    }
}

fun main() {
    val person01 = FootballPlayer2("Min", 25) // 기본값 사용
    person01.talk()
    person01.playFootball()

    val person02 = FootballPlayer2("John", 30, "FC Seoul") // 명시적 전달
    person02.talk()
    person02.playFootball()
}
