package org.example.board.model2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

class WriteOkActon: Action {
    override fun execute(request: HttpServletRequest, response: HttpServletResponse) {
        println( "WriteOkAction")
    }
}