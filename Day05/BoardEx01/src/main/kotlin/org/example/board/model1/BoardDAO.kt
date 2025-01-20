package org.example.board.model1

import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import javax.naming.Context
import javax.naming.InitialContext
import javax.sql.DataSource

class BoardDAO {
    lateinit var dataSource: DataSource

    constructor() {
        val initCtx: Context = InitialContext()
        val envCtx: Context = initCtx.lookup( "java:comp/env" ) as Context
        this.dataSource = envCtx.lookup( "jdbc/mariadb" ) as DataSource
    }

    fun boardList(): MutableList<BoardTO> {
        var lists: MutableList<BoardTO> = mutableListOf()

        var conn: Connection = this.dataSource.connection

        val sql: String = "select seq, subject, writer, date_format( wdate, '%Y/%m/%d' ) wdate, hit, datediff( now(), wdate ) wgap from board1 order by seq desc"
        val pstmt: PreparedStatement = conn.prepareStatement( sql )

        val rs: ResultSet = pstmt.executeQuery();

        while ( rs.next() ) {
            var seq: String = rs.getString( "seq" )
            var subject = rs.getString( "subject" )
            var writer = rs.getString( "writer" )
            var wdate =  rs.getString( "wdate" )
            var hit =  rs.getString( "hit" )
            var wgap = rs.getInt("wgap" )

            var to: BoardTO = BoardTO( seq = seq, subject = subject, writer = writer, wdate = wdate, hit = hit, wgap = wgap )
            lists.add( to )
        }

        rs.close()
        pstmt.close()
        conn.close()

        return lists
    }
}