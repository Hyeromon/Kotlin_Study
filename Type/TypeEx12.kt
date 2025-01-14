fun main(){
    var stringValue: StringBuilder = StringBuilder("Hello Kotlin String")

    // stringValue.reverse();

    // println(stringValue)

    println(stringValue.substring(0 .. 5))
    println(stringValue[0])
    println(stringValue[1]) 

    var tempValue:String = stringValue.toString()
    
    println( tempValue )   

}