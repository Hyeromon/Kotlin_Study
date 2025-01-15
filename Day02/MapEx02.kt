fun main(){
    var mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "Kotlin", 2 to "Java", 3 to "Python")

    println(mutableMap) 

    mutableMap[1] = "Python"  
    println(mutableMap) 

    mutableMap[4] = "Python" 
    println(mutableMap) 

    mutableMap.put(5, "C++")  
    println(mutableMap)  

    mutableMap.remove(1)
    println(mutableMap)

    var newMutableMap = mutableMap -3
    println(newMutableMap)

}