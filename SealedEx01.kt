sealed class PersonState

class Running: PersonState()
class Walking: PersonState()  
class Idle: PersonState()

fun getStateMessage(personState: PersonState): String {
    return when (personState) {
        //Sealed class를 사용할 때는 exhaustive (모든 경우를 처리하는) 조건을 만족해야 합
        is Running -> "Person is running"
        is Walking -> "Person is walking"
        is Idle -> "Person is idle"
    }
}

fun main() {
    val runningState = Walking()  
    println(getStateMessage(runningState))  

    var idleState: Idle = Idle()
    println(getStateMessage(idleState))
}
