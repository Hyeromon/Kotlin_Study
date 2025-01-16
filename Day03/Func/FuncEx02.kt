//default argument / named argument
// => 오버로딩 줄일 수 있음.
fun deliveryItem(name: String, count: Int = 1,destination: String="집"){
    println("${name}, ${count}개를 ${destination}에 배달")
}

fun main(){
    deliveryItem("선물1",2,"우리집")
    deliveryItem("선물2",3,destination="친구집")

    deliveryItem("선물3")
    deliveryItem("선물4",destination="친구집")
    
}