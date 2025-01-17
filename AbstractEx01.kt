class Animal(){
    init{
        println("Animal 초기화 블럭")
    }
    fun bark(){
        println("멍멍")
    }
}

fun main(){
    var a: Animal = Animal()
    a.bark()
}