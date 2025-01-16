//forEachIndexed
fun main(){
    var arrayList: List<Int> = arrayListOf(1,2,3,4,5,6,7,8,9)

    arrayList.forEach(){
        println(it)
    }

    arrayList.forEachIndexed{ index, it -> println("${index} : ${it}" ) }

    //특정 조작(action) 후 출력
    println(arrayList.onEach{it + 2})

    //take / takeWhile / takeLast / drop / slice
    println(arrayList.take(3)) //처음부터 3개
    println(arrayList.takeLast(3)) //마지막에서 3개
    println(arrayList.takeWhile{ it < 6}) //조건

}