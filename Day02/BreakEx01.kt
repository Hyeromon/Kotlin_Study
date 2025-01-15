fun main(){
    println("시작")

    var i : Int = 0

    outer@ while(i<=5){
        var j : Int = 0

        while(j<=5){
            if(j == 3) break@outer //지정한 레이블 반복문 종료

            println("i:$i / j : $j")
            j++
        }
        println("=========")
        i++
    }

    println("끝")
}