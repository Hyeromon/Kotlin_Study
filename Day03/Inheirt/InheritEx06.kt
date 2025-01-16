open class BasePerson(){
    open var age:Int =0
    get() = field
    set(value){
        field = value
    }
}
class SuperStar: BasePerson(){
    //재정의
    override var age : Int =0
        get()=field
        set(value){
            field = value - 5
        }
}

fun main(){
    var superStar : SuperStar = SuperStar()
    superStar.age=25
    println("${superStar.age}")
}