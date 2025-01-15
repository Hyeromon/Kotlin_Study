fun func1(){
    println("func1 호출")
}

fun func2(data1: Int){
    println("func2호출: " + data1)
} 
fun func3(data1: Int, data2: Int){
    var sum = data1+data2
    return sum
}
fun func4(data1: Int, data2: Int):Int{
    var sum = data1+data2
    return sum
}

fun main(){
    func1()
    func2(10)
    func3(10,20)

    var sum:Int = func4(10,20)
    println(sum)
}