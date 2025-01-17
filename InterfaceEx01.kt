interface Person1{
    abstract fun needToSleep()
    open fun getName():String{
        return "홍길동"
    }
}

 Student: Person1{
    override fun needToSleep(){
        println("사람은 잠이 필요해")
    }
    override fun getName():String{
        return "박문수"
    }
}

fun main(){
    var stu: Student = Student()
    stu.needToSleep()
    println( stu.getName() )
}