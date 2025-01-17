enum class Color(var r:Int, val g:Int, val b: Int){
    RED(255,0,0),
    BULE(0,0,255),
    GREEN(0,255,0),

    ORANGE(255,165,0),
    YELLOW(255,255,0);

    fun rgb() = (r*256 + g)*256 +b

}

fun getColorName(color:Color) = when(color){
    Color.RED ->"빨강"
    Color.ORANGE ->"주황"
    Color.YELLOW ->"노랑"
    Color.GREEN ->"초록"
    Color.BULE ->"파랑"
}

fun main(){
    println(getColorName(Color.BULE))
}