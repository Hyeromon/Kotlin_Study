//추상클래스
abstract class Animal(){
    init{
        println("Animal 초기화 블럭")
    }
    fun bark(){
        println("멍멍")
    }
    //추상메서드
    abstract fun eat()
}

class Dog: Animal(){
    init{
        println("Dog 초기화 블럭")
    }
    override fun eat(){
        println("사료를 먹는다")
    }
}

fun main(){
    // var a: Animal = Animal()
    // a.bark()

    var d: Dog = Dog()
    d.bark()
    d.eat()
}