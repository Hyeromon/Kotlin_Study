fun main(){
    var stringValue: String ="Hello Kotlin String"
    var stringValue2: String ="Hello Kotlin String/Hello/Kotlin/String"
    
    println(stringValue)
    println("문자열의 길이 : ${stringValue.length }")

    //문자열의 분리
    println(stringValue.substring(5))
    //범위
    println(stringValue.substring(5,9))
    //범위 연산자 : util
    println(stringValue.substring(5 until 9 ))
    //범위 연산자 : ..
    println(stringValue.substring(5 .. 9 ))

    //문자열 분리
    var splitValue = stringValue.split(" ");
    println(splitValue)     //[Hello, Kotlin, String]
    var splitValue2 = stringValue.split(" ",limit = 2);
    println(splitValue2)    //[Hello, Kotlin String]
    var splitValue3 = stringValue2.split(" ","/");
    println(splitValue3)    //[Hello, Kotlin, String, Hello, Kotlin, String]

    //글자 개수 중심의 문자열 분리
    var chunkedValue1 = stringValue2.chunked(3);
    println(chunkedValue1)  //[Hel, lo , Kot, lin,  St, rin, g/H, ell, o/K, otl, in/, Str, ing]
    var chunkedValue2 = stringValue2.chunked(5);
    println(chunkedValue2)  //[Hello,  Kotl, in St, ring/, Hello, /Kotl, in/St, ring]

    //대소문자
    println(stringValue.lowercase())
    println(stringValue.uppercase())
}