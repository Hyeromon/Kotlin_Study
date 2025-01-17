class Car{
    fun getPrice():Int{
        return 10000
    }
}
//getBarndName =>상속
//확장
fun Car.getBarndName():String{
    return "KIA"
}

fun main(){
    var c: Car = Car()
    println(c.getPrice())
    println(c.getBarndName())

}