package com.dao.impl;

import com.dao.PackageDAO;
import com.entities.PackageCl;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Alex Ichim on 16.12.2016.
 */
public class PackagesDAOImpl implements PackageDAO {

    //JDBC driver name and db URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3307/dbpackagetracking";


    //Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    private Connection conn;

    public PackagesDAOImpl(){
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
    public ArrayList<PackageCl> getClientPackages(String clientId) {
        ArrayList<PackageCl> packages = new ArrayList<>();

        try {
            PreparedStatement stmt;
            String sql = "SELECT * FROM packages WHERE sender = ? OR receiver = ?;";
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, clientId);
            stmt.setString(2, clientId);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){

                PackageCl newPackage = new PackageCl(
                        rs.getInt("id"),
                        rs.getString("sender"),
                        rs.getString("receiver"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("senderCity"),
                        rs.getString("destinationCity"),
                        rs.getBoolean("tracking")
                );
                packages.add(newPackage);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return packages;
    }

    @Override
    public ArrayList<PackageCl> getPackagesById(String packageName) {
        ArrayList<PackageCl> packages = new ArrayList<>();

        try {
            PreparedStatement stmt;
            String sql = "SELECT * FROM packages WHERE name LIKE ?;";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, packageName);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){

                PackageCl newPackage = new PackageCl(
                        rs.getInt("id"),
                        rs.getString("sender"),
                        rs.getString("receiver"),
                        rs.getString("name"),
                        rs.getString("description"),
                        rs.getString("senderCity"),
                        rs.getString("destinationCity"),
                        rs.getBoolean("tracking")
                );
                packages.add(newPackage);

                packages.add(newPackage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return packages;
    }
}
