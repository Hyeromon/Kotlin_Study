//open class
// :
open class Animal(){
    //초기화 블럭
    init{
        println("Animal 호출")
    }
}

open class Dog() : Animal(){
    init{
        println("Dog 호출")
    }
}

class JindoDog() : Dog(){
    init{
        println("JindoDog 호출")
    }
}

fun main(){
    //var a:Animal = Animal()
    var d: JindoDog = JindoDog()
}