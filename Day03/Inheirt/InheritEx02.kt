open class BasePerson(name: String, age: Int){
    var name:String = name
    var age:Int = age

    fun talk(){
        println("$name 이고 $age 입니다.")
    }

    fun walk(){
        println("$name 은(는) 걷는다")
    }    
}
class MathTeacher(name: String, age:Int): BasePerson(name, age){
    fun teachMath(){
        println("Teach Math")
    }
}

class FootballPlayer(name: String, age:Int):BasePerson(name, age){
        fun playFootball(){
            println("Play Football..")
        }
}

fun main(){
    val person01 = MathTeacher("Cane",20)
    person01.talk()
    person01.teachMath()

    val person02 = FootballPlayer("Son",33)
    person02.talk()
    person02.playFootball()
}