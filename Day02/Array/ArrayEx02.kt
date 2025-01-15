fun main(){
    // var arrValue: Array<String> = arrayOf("Kotlin","Java","C++")
    // var arrValue: Array<Int> = arrayOf(0,2,3,6,7)
    // var arrValue: Array<Any> = arrayOf(1, "Java","C++")

    var arrValue: Array<Int?> = arrayOfNulls(3)

    // arrValue.forEach({
    //     println(it)
    // })

     println(arrValue.contentToString())
}