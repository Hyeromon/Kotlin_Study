class Outer(){
    var text:String ="Outer Class"

    //중첩클래스
    class Nested(){
        fun introduce(){
            //외부 클래스 내용 공유할 수 없음
            println("nested class")
        }
    }
}

fun main(){
    var outerNested = Outer.Nested()
    outerNested.introduce()
}