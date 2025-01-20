package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO
import org.example.model1.BoardTO

class ViewAction : Action {
    override fun execute(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("ViewAction 호출")

        if (req == null || resp == null) {
            println("Request or Response is null.")
            return
        }

        var to = BoardTO()
        to.seq = req.getParameter("seq")

        val dao = BoardDAO()
        to = dao.boardView(to)

        req.setAttribute("to", to)
    }
}
