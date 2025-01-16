//Bubble sort
fun customSort(vararg arrvalue: Int){
    var tmp:Int =0
    for(i in arrvalue){
        for(j in 0 until arrvalue.size-1){
            if(arrvalue[j] > arrvalue[j+1]){
                tmp = arrvalue[j]
                arrvalue[j]=arrvalue[j+1]
                arrvalue[j+1]=tmp 
            }
        }
    }
    println(arrvalue.contentToString())
}
fun main(){
    customSort(5, 3, 8, 6, 2)
}