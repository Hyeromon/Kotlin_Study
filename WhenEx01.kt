fun main(){
    val dayOfWeek: Int=3

    //switch case 구문 대신 사용
    val dayName = when(dayOfWeek){
        1 -> "일요일"
        2 -> "월요일"
        3 -> "화요일"
        4 -> "수요일"
        5 -> "목요일"
        6 -> "금요일"
        else -> "토요일"
    }

    println(dayName)
}