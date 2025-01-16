class FoodPoll(val name:String){
    companion object{
        var total:Int =0
    }
    var count: Int =0

    fun vote(){
        count++
    }
}
fun main(){
    var fp1: FoodPoll = FoodPoll(" 짜장면 ")
    var fp2: FoodPoll = FoodPoll(" 짬뽕 ")

    fp1.vote()
    fp2.vote()

    fp1.vote()
    fp2.vote()
    fp2.vote()

    println("${fp1.name} : ${fp1.count}")
    println("${fp2.name} : ${fp2.count}")
    println(" 총계 : ${FoodPoll.total} ")

}