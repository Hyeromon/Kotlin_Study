fun main() {
    var mutableSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Python", "JavaScript")
    println(mutableSet)

    println(mutableSet)

    mutableSet.add("C++")
    println(mutableSet)

    mutableSet.add("Java")
    println(mutableSet)

    mutableSet.remove("Python")
    println(mutableSet)
}
