fun main(){
    var a:Int = 10000
    var boxedA: Int = a
    var anotherBoxedA : Int = a

    //JAVA : 기본자료형(객체 x)/ wrapper형(객체 o)

    println( a )
    println( boxedA )
    println( anotherBoxedA )

    // ==  : 값을 비교함.(equals)
    // === : 주소를 비교 (deprecated)

    println(boxedA == anotherBoxedA)    //true
    println(boxedA === anotherBoxedA)   //?(o):false, ?(x):true
}