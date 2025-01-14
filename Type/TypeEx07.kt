fun main(){
    //문자열
    var stringValue1 : String = "Hello Kotlin"
    println(stringValue1)

    var stringValue2 : String = """Hello
    Kotlin"""
    println(stringValue2)

    //String(immutable) / StringBuffer, StringBuilder(mutable)

    var stringBuffer : StringBuffer = StringBuffer("Hello Kotlin")
    println(stringBuffer)

    var stringBuilder: StringBuilder = StringBuilder("Hello Kotlin")
    println(stringBuilder)
}