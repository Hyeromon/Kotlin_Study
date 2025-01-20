package org.example.board.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

interface Action {
    open fun execute(request: HttpServletRequest, response: HttpServletResponse);
}