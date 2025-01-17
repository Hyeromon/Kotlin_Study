//인덱스를 통해서 값 교환
//확장함수
fun MutableList<Int>.swap(index1:Int, index2:Int){
    var tmp = this[index1]
    this[index1]=this[index2]
    this[index2]=tmp
}


fun main() {
    var list: MutableList<Int> = mutableListOf(1, 2, 3)
    println(list)

    list.swap(0,2)
    println(list)
}
