package com.dao.impl;

import com.dao.UsersDAO;
import com.entities.User;

import java.sql.*;

/**
 * Created by Alex Ichim on 16.12.2016.
 */
public class UsersDAOImpl implements UsersDAO{

    //JDBC driver name and db URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/dbpackagetracking";


    //Database credentials
    static final String USER = "root";
    static final String PASS = "";

    private Connection conn;

    public UsersDAOImpl(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User login(String username, String password) {
        User loggedIn = null;

        try {
            PreparedStatement stmt;
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?;";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String user = rs.getString("username");
                String pass = rs.getString("password");
                boolean isAdmin = rs.getBoolean("is_admin");

                loggedIn = new User(user, password, isAdmin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return loggedIn;
    }

    @Override
    public int register(String username, String password) {
        try{
            PreparedStatement stmt;
            String sql = "INSERT INTO users VALUES(?, ?, 0);";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);

            return stmt.executeUpdate();
        } catch (SQLException e ){
            e.printStackTrace();
        }
        return 0;
    }
}
