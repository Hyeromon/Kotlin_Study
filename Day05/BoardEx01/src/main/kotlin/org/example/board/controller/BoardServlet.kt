package org.example.board.controller

import jakarta.servlet.RequestDispatcher
import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.HttpServlet
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.board.model2.Action
import org.example.board.model2.ListActon
import org.example.board.model2.WriteActon
import org.example.board.model2.WriteOkActon

@WebServlet( "*.do" )
class BoardServlet: HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    override fun doPost(request: HttpServletRequest, response: HttpServletResponse) {
        this.doProcess(request, response)
    }

    fun doProcess(request: HttpServletRequest, response: HttpServletResponse) {
        response.characterEncoding = "UTF-8"

        var path: String = request.getServletPath();

        var action: Action? = null
        var url: String = "/WEB-INF/views/error.jsp"
        if( path.equals( "/list.do" ) ) {
            action = ListActon() as Action
            action.execute( request, response );

            url = "/WEB-INF/views/board_list1.jsp"
        } else if ( path.equals( "/write.do" ) ) {
            action = WriteActon() as Action
            action.execute( request, response );

            url = "/WEB-INF/views/board_write1.jsp"
        } else if ( path.equals( "/write_ok.do" ) ) {
            action = WriteOkActon() as Action
            action.execute( request, response );

            url = "/WEB-INF/views/board_write1_ok.jsp"
        }

        val dispatcher: RequestDispatcher = request.getRequestDispatcher( url )
        dispatcher.forward( request, response )
    }
}