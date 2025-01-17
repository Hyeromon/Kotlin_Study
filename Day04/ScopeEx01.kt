//스코프함수
class Book(var name:String, var price:Int){
    fun discount(){
        price -= 2000
    }
}

fun main(){
    var b1: Book = Book("Kotlin",10000)
    b1.discount();
    println(b1.name)
    println(b1.price)
    
    var b2: Book = Book("Kotlin",10000).apply{
        name="[초특가]"+name
        discount()
        discount()
    }

    b2.run{
        println(name)
        println(price)  
    }
    

}