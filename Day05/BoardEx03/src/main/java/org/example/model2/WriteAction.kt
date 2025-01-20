package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

class WriteAction : Action {
    override fun execute(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("Write Action 호출")

        // null 체크 또는 안전 호출
        if (req == null || resp == null) {
            println("Request or Response is null.")
            return
        }

        // req와 resp가 null이 아니면 작업을 계속 진행
    }
}
