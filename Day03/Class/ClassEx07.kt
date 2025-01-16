var highdata: String ="234567"

fun doFunc(){
    
    println("doFunc() 호출")
    // println(highdata)
}
class Student(){
    var data:String ="123456"
    
    fun doFunc1(){
        println(data)
        println(this.data)

        doFunc2()
        this.doFunc2()

        println(this)
        
        // 상위
        doFunc()
        println(highdata)
    }

    fun doFunc2(){
        println("doFunc2() 호출")
    }

}
fun main(){
    var s: Student = Student()
    s.doFunc1()
}