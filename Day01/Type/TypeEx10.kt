fun main(){
    var stringValue1: StringBuilder = StringBuilder()
    var stringValue2: StringBuilder = StringBuilder("Hello Kotlin String")
    var stringValue3: StringBuilder = StringBuilder( 10 )

    println(stringValue1)
    println(stringValue2)

    //내부에 저장된 문자열의 길이
    println(stringValue1.length)
    println(stringValue2.length)

    //내부 버퍼의 용량
    println(stringValue1.capacity() )
    println(stringValue2.capacity() )
    println(stringValue3.capacity() )    
}