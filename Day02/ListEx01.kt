fun main(){
    val readOnlyList : List<String> = listOf("Kotlin","Java","Pyhton")

    println(readOnlyList.size)
    println(readOnlyList[0])
    println(readOnlyList.get(1))

    // readOnlyList[0] ="GO" => 한번 지정하면 바꿀 수 없음.
    for( i in 0..readOnlyList.size-1){
        println(readOnlyList.get(i))
    }

    //forEach
    readOnlyList.forEach({
        println(it)
    })

    //indexOf
    println(readOnlyList.indexOf("Go"))
    println(readOnlyList.indexOf("Kotlin"))
}