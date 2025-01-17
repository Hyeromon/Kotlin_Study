class MyStringCollection {
    private val collection = mutableListOf<String>() // 문자열 저장용 리스트

    infix fun add(s: String) {
        collection.add(s) // 문자열 추가
        println("Added: $s") // 로그 출력
    }

    fun build() {
        this add "abc"   // 중위 표현식 사용
        add("def")       // 일반 함수 호출
        // add "ghi"      // 컴파일 오류: this 없이 호출 불가
    }

    fun show() {
        println("Collection: $collection") // 리스트 내용 출력
    }
}

fun main() {
    val myCollection = MyStringCollection()
    myCollection.build() // build 호출
    myCollection.show()  // 리스트 출력
}
