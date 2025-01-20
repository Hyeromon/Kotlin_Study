package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO
import org.example.model1.BoardTO

class DeleteAction : Action {
    override fun execute(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("DeleteAction 호출")

        if (req == null || resp == null) {
            // null 처리 로직 (예: 예외 처리)
            return
        }

        var to = BoardTO()
        to.seq = req.getParameter("seq")

        val dao = BoardDAO()
        to = dao.boardDelete(to)

        req.setAttribute("to", to)
    }
}
