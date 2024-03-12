package com.example.activityjdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass{
    protected static String DB = "secls"; //dbname
    protected static String IP = " 192.168.100.107"; //ip add of server
    protected static String PORT = "3306"; //port of the server; look in xampp
    protected static String USER = "root";
    protected static String PASS = "";

    public Connection CONN(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionString = "activityjdbc:mysql://"+IP+":"+PORT+"/"+DB;
            conn = DriverManager.getConnection(connectionString,USER,PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}

