fun main(){
    var stringValue: StringBuilder = StringBuilder("Hello Kotlin String")

    println(stringValue)

    stringValue.append(" 123")
    stringValue.append(" 456")

    println(stringValue)    //Hello Kotlin String 123 456

    stringValue.insert(0,"String")

    println(stringValue)    //StringHello Kotlin String 123 456

    stringValue.delete(0,7)

    println(stringValue)    //ello Kotlin String 123 456

    stringValue.deleteCharAt(0)
    println(stringValue)    //llo Kotlin String 123 456
}