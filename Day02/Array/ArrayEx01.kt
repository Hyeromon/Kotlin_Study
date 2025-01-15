fun main(){
    //배열의 선언
    // var arrValue1 = Array(3)
    // var arrValue1 :Array<Int> = Array<Int>(3)
    // var arrValue1 :Array<Int> = Array<Int>(3) { 0 }//0으로 초기화
    // var arrValue1 :Array<Int> = Array<Int>(3) {i -> 1 }
    // var arrValue1 :Array<Int> = Array<Int>(3) {i -> i}
    var arrValue1 :Array<Int> = Array<Int>(3){i -> i *5}

    println(arrValue1)
    println(arrValue1.contentToString())
    println(arrValue1.size)
    
    println(arrValue1[1])
    //collection
    println(arrValue1.get(1))

    arrValue1[0]=100
    println(arrValue1.contentToString())
    arrValue1.set(0,200)
    println(arrValue1.contentToString())

    for(i in 0 .. arrValue1.size-1){
        println(arrValue1[i])
    }

    for(data in arrValue1){
        println(data)
    }

    for(i in arrValue1.indices){
        // println(i)
        print(arrValue1[i])
    }

    //함수 <= 함수지향 프로그램의 핵심
    arrValue1.forEach({
        println(it)
    })
    

}