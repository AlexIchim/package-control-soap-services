package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Alex Ichim on 17.12.2016.
 */
public class ConnectionJDBC {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/a4_2_db";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    private Connection conn;

    private ConnectionJDBC(){
    }

    public Connection getInstance () {

        if (conn == null) {
            synchronized (this) {
                try {
                    // Register JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");

                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return  conn;
    }
}
