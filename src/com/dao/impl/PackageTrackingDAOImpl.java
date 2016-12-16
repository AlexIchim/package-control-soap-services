package com.dao.impl;

import com.dao.PackageTrackingDAO;
import com.entities.PackageTracking;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Alex Ichim on 16.12.2016.
 */
public class PackageTrackingDAOImpl implements PackageTrackingDAO {

    //JDBC driver name and db URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/dbpackagetracking";


    //Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    private Connection conn;

    public PackageTrackingDAOImpl(){
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
    public ArrayList<PackageTracking> checkStatus(int packageIdToCheck) {
        ArrayList<PackageTracking> packageTrackings = new ArrayList<>();

        try {
            PreparedStatement stmt;
            String sql = "SELECT * FROM package_tracking WHERE packages_id = ?;";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, packageIdToCheck);

            ResultSet rs=  stmt.executeQuery(sql);

            while (rs.next()) {
                PackageTracking packageTracking = new PackageTracking(
                        rs.getInt("id"),
                        rs.getInt("packages_id"),
                        rs.getString("city"),
                        rs.getDate("time")
                );

                packageTrackings.add(packageTracking);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return packageTrackings;
    }
}
