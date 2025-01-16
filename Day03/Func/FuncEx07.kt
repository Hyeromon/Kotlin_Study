fun manipulateTwoThree1( a:Int, b:Int ){
    println( "${a} / ${b}" )
}

fun manipulateTwoThree2( func: ( Int, Int ) -> Int){
    println( func( 2, 3 ) )
}

fun main(){
    manipulateTwoThree1(10,20)
    manipulateTwoThree2({a, b -> a + b})
}