fun main() {
    //filter / filterNot / filterIndexed / filterNotNull
    val arrayList1: List<Int> = arrayListOf(1, 2, 3, 4, 5, 7,8,9)
    var arrayList2 = arrayListOf(null, "data1", "data2", null, "data3")

    println(arrayList1)
    
    println(arrayList1.filter { it % 2 == 0 }) 
    println(arrayList1.filterNot { it % 2 == 0 }) 

    println(arrayList1.filterIndexed{index, i -> (index +i) %3 == 0})

    println(arrayList2.filterNotNull())


    //map / mapIndexed / mapNotNull
    println(arrayList1.map{ it *2 })

    println(arrayList1.mapIndexed{ index, i -> index * i })

    println(arrayList2.mapNotNull{ it })

/* 
    조건에 의한 검사 = true / false
    all / any / none / first / last / single / find / findLast / count
    / indexOfFirst / indexOfLast
*/
    println(arrayList1.all { it < 10 })
    println(arrayList1.any { it > 10 })

    println(arrayList1.first { it %4 == 0 })
    println(arrayList1.last { it % 4 == 0})


}