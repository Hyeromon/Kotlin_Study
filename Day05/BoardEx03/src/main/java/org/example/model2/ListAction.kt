package org.example.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.model1.BoardDAO
import org.example.model1.BoardTO

class ListAction : Action {
    override fun execute(req: HttpServletRequest?, resp: HttpServletResponse?) {
        println("ListAction 호출")

        // null 체크 후 처리
        val dao = BoardDAO()
        val lists = dao.boardList()

        // req가 null이 아닐 때만 setAttribute 호출
        req?.setAttribute("lists", lists)
    }
}
