object Counter{
    var count:Int = 1

    fun countUp(){
        count++
    }
    fun countDown(){
        count--
    }

    fun clear(){
        count =0

    }
}
fun main(){
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.countDown()
    Counter.countDown()
    println(Counter.count)

    Counter.clear()
    println(Counter.count)

}