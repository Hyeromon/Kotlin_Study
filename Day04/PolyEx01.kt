open class Drink {
    var name: String = "음료"
    open fun drink() {
        println( "${name}을 마십시다." )
    }
}
class Cola : Drink() {
    var type: String = "콜라"
    override fun drink() {
        println( "${name} 중에 ${type}을 마십니다." )
    }
    fun washDishes() {
		println( "${type}를 설거지를 합니다." )
    }
}
class Cider : Drink() {
    var type: String = "사이다"
    override fun drink() {
        println( "${name} 중에 ${type}을 마십니다." )
    }
    fun washDishes() {
		println( "${type}를 설거지를 합니다." )
    }
}
fun main() {
    // 상속
    var d1: Drink = Drink();
    d1.drink()
    //d1.washDishes()
    println()
    var c1: Cola = Cola();
    c1.drink()
    c1.washDishes()
    println()

    // 형변환(부모)
    var d2: Drink = Cola()
    d2.drink()
    println()

    // 형변환(자식)
    // is -> 검사 / 형변환
    //if( d2 is Cola ) {
    if( d2 is Cider ) {
        d2.drink()
        d2.washDishes()
    } else {
        println( "변경 불가" )
    }
    println()

    //as
    //d2,d3 모두 형변환
    var d3 = d2 as Cola
    d3.washDishes()
    d2.washDishes()

    // kotlinc PolyEx01.kt -d PolyEx01.jar
    // kotlin -classpath PolyEx01.jar PolyEx01Kt

}