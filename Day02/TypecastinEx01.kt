fun main(){
    val anyValue : Any ="Hello"

    //is / is?
    if(anyValue is String){
        println("string")
        //as / as?
        val strValue : String = anyValue as String
        println(strValue)
    }else{
        println("Any")
    }
}
