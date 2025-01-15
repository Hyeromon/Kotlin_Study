/*
*
**
***
****
*****
...
**********(10)

 */
 fun main(){
    println("별 찍기(1)")
    for(i in 1 .. 10){
        for(j in 1 ..i){
            print("*")
        }
        println()
    }
    
    println()
    println("별 찍기(2)")
    for(i in 10 downTo 1){
        for(j in 1 ..i){
            print("*")
        }
        println()
    }

    println()
    println("별 찍기(3)")
    for (i in 'A'..'J') { 
        for (j in 'A'..i) { 
            print(j) 
        }
        println() 
    }
 }