//가변인자
fun sum(vararg numbers: Int) {
    println(numbers.size)             // 가변 인자의 크기 출력
    println(numbers::class.simpleName) // 가변 인자의 클래스 이름 출력
    for (number in numbers) {
        println(number)               // 가변 인자의 요소 출력
    }
}

fun main() {
    // sum()
    // sum(1)
    // sum(1,2)
    sum(1, 2, 3)
}