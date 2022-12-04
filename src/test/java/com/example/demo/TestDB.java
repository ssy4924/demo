package com.example.demo;

import oracle.ucp.jdbc.oracle.OracleDriverConnectionFactoryAdapter;

import java.sql.*;

public class TestDB {

    public static void main (String args []) throws SQLException, SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");// jdbc driver load
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@orcl_high?TNS_ADMIN=./src/main/resources/Wallet_orcl/", "ADMIN", "Kblife@2022");

        Statement stmt = conn.createStatement ();
        ResultSet rset = stmt.executeQuery ("select '  --> ' || username from ALL_USERS");
        while (rset.next ()) {
            System.out.println (rset.getString (1));
        }

        rset.close();
        stmt.close();
        conn.close();
    }

}
