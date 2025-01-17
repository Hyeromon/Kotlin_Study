interface Runner{
    fun run()
}

interface Eater{
    fun eat(){
        println("먹이를 먹는다.")
    }
}
//인터페이스의 다중상속
class Dog: Runner,Eater{
    override fun run(){
        println("강아지가 뛴다")
    }

    override fun eat(){
        println("강아지가 사료를 먹는다")
    }
}

fun main(){
    var d: Dog=Dog()
    d.run()
    d.eat()
}