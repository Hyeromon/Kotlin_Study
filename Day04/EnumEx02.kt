enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

fun getDirectionName(direction: Direction): String {
    return when (direction) {
        Direction.NORTH -> "북"
        Direction.SOUTH -> "남"
        Direction.WEST -> "서"
        Direction.EAST -> "동"
    }
}

fun main() {
    println(getDirectionName(Direction.EAST))  // 출력: 동
}
