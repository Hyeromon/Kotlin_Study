/*
점수를 입력받아서
90점 이상 '점수에 대한 학점은 A'라고 출력
80점 이상 '점수에 대한 학점은 B'라고 출력
70점 이상 '점수에 대한 학점은 C'라고 출력
60점 이하 '점수에 대한 학점은 F'라고 출력
 */

fun main() {
    print("점수를 입력하세요: ")
    val input = readLine() // 사용자로부터 입력 받기
    val score = input?.toIntOrNull() // 입력 값을 Int로 변환

    if (score != null) { // 유효한 정수인지 확인
        val grade = when {
            score >= 90 -> "A"
            score >= 80 -> "B"
            score >= 70 -> "C"
            score >= 60 -> "D"
            else -> "F"
        }
        println("점수에 대한 학점은 $grade 입니다.")
    } else {
        println("올바른 점수를 입력하세요.")
    }
}
