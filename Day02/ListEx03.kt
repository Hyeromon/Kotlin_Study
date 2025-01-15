fun main() {
    val mutableList = mutableListOf(5, 3, 8, 1, 9, 4)

    mutableList.shuffle()
    println("Shuffled list: $mutableList")

    
    val sortedList = mutableList.sorted()
    println("Sorted list: $sortedList")

  
    mutableList.sort()
    println("List after sort: $mutableList")


    mutableList.reverse()
    println("Reversed list: $mutableList")
}
