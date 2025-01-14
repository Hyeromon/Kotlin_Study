fun main(){
    var byteValue : Byte =127
    var shortValue : Short = 32767
    var intValue : Int = 2147483547
    var longValue : Long = 98876554433
    var floatValue : Float = 3.14F
    var doubleValue : Double = 3.141592653589793

    val uByteValue : UByte = 255u
    val uIntValue : UInt = 4294967295u

    println(byteValue)
    println(uByteValue)

    var value1 = 2147483547
    var value2 = 98876554433 
    //var value3 :Int = 98876554433 //추론 : 성립하지 않음 -> 에러발생
    println(value1)
    println(value2)
    //println(value3)

    println(value1 :: class.simpleName) //->Int
    println(value2 :: class.simpleName) //->Long
}