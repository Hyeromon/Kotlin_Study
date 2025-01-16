data class Person(val name: String, var age:Int)

fun main(){
    val person01 = Person("UncleBae",40)
    val person02 = person01.copy()
    val person03 = person01.copy(name="Ruby")

    println("person01: " +person01.hashCode())
    println("person02: " +person02.hashCode())
    println("person03: " +person03.hashCode())
    
    if(person01.equals(person02) == true){
        println("equals")
    }else{
        println("not equals")
    }

    if(person01.equals(person03) == true){
        println("equals")
    }else{
        println("not equals")
    }
}