/*
fun String.getLonggerString(x:String):String{
    return if(this.length> x.length)this else x
}
*/

//infix함수 표시
infix fun String.getLonggerString(x:String):String{
    return if(this.length> x.length)this else x
}


fun main(){
    //println("Hello".getLonggerString("Hi"))
    println("Hello".getLonggerString("Hi"))
}