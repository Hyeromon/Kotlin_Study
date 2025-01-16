class Person(var name:String = "홍길동", var age:Int = 26){
    init{
        println("init 호출")
    }
}

fun main(){
    var p: Person = Person()
    println( "${ p.name }" )
}
