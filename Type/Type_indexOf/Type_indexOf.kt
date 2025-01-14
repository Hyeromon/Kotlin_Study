fun main(){
    var stringValue : String = "Hello Kotlin String Hello Kotlin String"

    //indexOf/lastIndexOf
    println(stringValue.indexOf("Ko"))
    println(stringValue.indexOf("Ro"))
    
    println(stringValue.indexOf("Ko", 7))
    println(stringValue.lastIndexOf("Ko"))

    //startsWith,endsWith,contains
    println(stringValue.startsWith("He"))
    println(stringValue.endsWith("He"))
    println(stringValue.contains("He"))

    var resplaceValue : String = stringValue.replace("Kotlin","Java")
    println(resplaceValue)

    var formatValue:String = String.format("%s %s", "Hello", "Kotlin")
    println(formatValue)
}