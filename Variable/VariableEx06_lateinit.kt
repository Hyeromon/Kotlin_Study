var name1: String = "Tom"
lateinit var name2: String //지연 초기화

fun initalize(){
    name2="Kevin"
}

fun main(){
    println(name1)
    
    initalize()
    println(name2)
}