package org.example.board.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

class WriteActon: Action {
    override fun execute(request: HttpServletRequest, response: HttpServletResponse) {
        println( "WriteAction")
    }
}