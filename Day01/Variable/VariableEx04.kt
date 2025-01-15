fun main(){
    var intValue1:Int = 1234
    //타입추론
    var intValue2 = 1234

    println(intValue1)
    println(intValue2)
    
    //is
    println(intValue1 is Int)   //true
    println(intValue2 is Int)   //true
    //println(intValue2 is Long) //false

    var StringValue = "Test"
    println(StringValue is String)

}