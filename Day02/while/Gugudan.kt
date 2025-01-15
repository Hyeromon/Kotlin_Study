/*1 X 1 =1 1 X 2= 2 
 ...
 9 X 1 = 9 9 X 2=18
*/
fun main(){
    /*while문 
    var i : Int = 1
    while(i<=9){
        var j : Int = 1
        while(j<=9){
            print(" $i X $j = ${i*j} ")
            j++
        }
        println()
        i++
    }
    */
    //do-while문
    var i = 1 // 단 초기화
    do {
        var j = 1 // 곱할 수 초기화
        do {
            print("$i X $j = ${i * j}  ") // 구구단 출력
            j++
        } while (j <= 9) // 1부터 9까지 반복
        println() // 줄바꿈
        i++
    } while (i <= 9) // 1단부터 9단까지 반복
}