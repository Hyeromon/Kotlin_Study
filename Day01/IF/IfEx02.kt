/*
(강사님_ver)
점수를 입력받아서
90점 이상 '점수에 대한 학점은 A'라고 출력
80점 이상 '점수에 대한 학점은 B'라고 출력
70점 이상 '점수에 대한 학점은 C'라고 출력
60점 이사 '점수에 대한 학점은 F'라고 출력
 */
 fun main(){
    //var intJumsu:Int = readln().toInt()
    var intJumsu:Int = 81

    if(intJumsu>=90){
        println("$intJumsu 에 대한 학점은 A ")
    }else if(intJumsu>80){
        println("$intJumsu 에 대한 학점은 B ")
    }
    else if(intJumsu>70){
        println("$intJumsu 에 대한 학점은 C ")
    }
    else if(intJumsu>60){
        println("$intJumsu 에 대한 학점은 D ")
    }else{
        println("$intJumsu 에 대한 학점은 F ")
    }
 }