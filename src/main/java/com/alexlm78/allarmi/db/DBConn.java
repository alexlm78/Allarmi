package com.alexlm78.allarmi.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    private static final Logger log = LoggerFactory.getLogger(DBConn.class);

    private Connection getConnection(String strConn, String strUser, String strPass) throws  ClassNotFoundException, SQLException {
        Connection Conn = null;
        Class.forName("oracle.jdbc.OracleDriver");
        Conn = DriverManager.getConnection("jdbc:oracle:thin:@//"+strConn, strUser, strPass);
        log.debug("Connected: "+Conn.toString());
        return Conn;
    }
}
