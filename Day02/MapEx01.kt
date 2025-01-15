fun main() {
    var readOnlyMap: Map<String, Int> = mapOf("Kotlin" to 1, "Java" to 2, "Python" to 3)
    println(readOnlyMap)  // map 출력

    // keys만 출력
    for (key in readOnlyMap.keys) {
        println(key)
    }

    // values만 출력 (value 변수명을 value로 수정)
    for (value in readOnlyMap.values) {
        println(value)
    }

    // key-value 쌍 출력
    for (item in readOnlyMap) {
        println(item)  // item은 Pair<String, Int> 형태
    }

    // key-value 쌍을 key와 value로 분리해서 출력
    for ((key, value) in readOnlyMap) {
        println("$key -> $value")
    }
}
