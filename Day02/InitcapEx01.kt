fun main() {
    val args = arrayOf("hong gil dong")
    
    println(args.contentToString())  
    println(args.size)               

    val names: List<String> = args[0].split(" ")

    for (name in names) {
        // println(name)
        
        //Hong Gil Dong으로 바꾸기
        println(name.substring(0 until 1).uppercase()+name.substring(1))
    }
}
