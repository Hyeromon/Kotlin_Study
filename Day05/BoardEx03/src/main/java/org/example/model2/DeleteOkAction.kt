package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO
import org.example.model1.BoardTO

class DeleteOkAction : Action {
    override fun execute(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("DeleteOkAction 호출")

        if (req == null || resp == null) {
            // req 또는 resp가 null일 때 적절한 예외를 던지거나 로깅 처리
            println("Request or Response is null.")
            return
        }

        val to = BoardTO()
        to.seq = req.getParameter("seq")  // req가 null이 아닌 경우에만 호출됩니다.
        to.password = req.getParameter("password")

        val dao = BoardDAO()
        val flag = dao.boardDeleteOk(to)

        req.setAttribute("flag", flag)
    }
}
