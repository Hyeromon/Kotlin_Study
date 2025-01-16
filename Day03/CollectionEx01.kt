fun main() {
    val arrayList1: List<Int> = arrayListOf(1, 2, 3, 4, 5)

    println(arrayList1)
    
    println(arrayList1.filter { it % 2 == 0 }) 
    println(arrayList1.filterNot { it % 2 == 0 }) 

    println(arrayList1.filterIndexed{index, i -> (index +i) %3 == 0})
}