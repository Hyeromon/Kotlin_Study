val result1: ( String ) -> Unit = { str -> println("$str") }
// it
val result2: ( String ) -> Unit = { println("$it") }

fun main(){
    //지역함수
    val result3: ( String ) -> Unit = { println("$it") }

    result1("msg1")
    result2("msg2")
    result3("msg3")

}