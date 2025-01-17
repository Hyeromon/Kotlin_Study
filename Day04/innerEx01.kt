class Outer(){
    var text:String ="Outer Class"

    inner class Inner(){
        fun introduce(){
            println("inner class: ${text}")
        }
    }
}

fun main(){
    var outer = Outer()
    var outerInner = outer.Inner()

    outerInner.introduce()
}