open class BasePerson(){
    open fun speakAge(age:Int){
        println("I'm $age years old.")
    }
}
class SuperStar: BasePerson(){
    override fun speakAge(age:Int){
        println("I'm ${age -5} years old officially.")
    }
}

fun main(){
    var superStar : SuperStar = SuperStar()
    superStar.speakAge(25)
}