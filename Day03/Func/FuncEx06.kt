fun play(){
    println("play")
}

fun main(){
    // val pl: () -> Unit = ::play
    val pl: () -> Unit = {println("play")}
    pl()
}