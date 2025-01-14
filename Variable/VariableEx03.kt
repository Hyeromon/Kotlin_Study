var data11 : Int = 1234
var data12 : Int = 1234

//const(상수) 선언 가능
const val data13 : Int = 1234

//외부 선언
fun main(){
    var data21 : Int = 1234
    var data22 : Int = 1234

    //재선언 가능
    var data11 : Int = 3456
    var data12 : Int = 3456

    //Local 내에서는 상수 선언을 할 수 없음.
    const val data23 : Int = 1234

    println(data11)
    println(data12)
    println(data21)
    println(data22)
    println(data13)
}