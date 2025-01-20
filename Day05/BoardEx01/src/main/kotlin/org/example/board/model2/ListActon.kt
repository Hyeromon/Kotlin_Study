package org.example.board.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.board.model1.BoardDAO
import org.example.board.model1.BoardTO

class ListActon: Action {
    override fun execute(request: HttpServletRequest, response: HttpServletResponse) {
        var dao: BoardDAO = BoardDAO();
        var lists: MutableList<BoardTO> = dao.boardList();

        request.setAttribute( "lists", lists );
    }
}