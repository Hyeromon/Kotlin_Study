open class Person {
    init {
        println("Person 초기화 블럭")
    }

    open fun needToSleep() {
        println("사람은 잠이 필요해")
    }
}

abstract class Student : Person() {
    init {
        println("Student 초기화 블럭")
    }

    abstract override fun needToSleep()
}

class HighSchoolStudent : Student() {
    init {
        println("HighSchoolStudent 초기화 블럭")
    }

    override fun needToSleep() {
        println("HighSchoolStudent는 잠이 더 필요해")
    }
}

fun main() {
    val p: Person = Person()
    p.needToSleep()
    println()

    val p1: Person = HighSchoolStudent()
    p1.needToSleep()
    println()

    val p2: Student = HighSchoolStudent()
    p2.needToSleep()
}
