package com.example.activityjdbc;


import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public class ConnectionClass{
    protected static String DB = "secls"; //dbname
    protected static String IP = "192.168.100.107"; //ip add of server
    protected static String PORT = "3306"; //port of the server; look in xampp
    protected static String USER = "prim";
    protected static String PASS = "pr1mNotLianne";

    public Connection CONN(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String connectionString = "jdbc:mysql://"+IP+":"+PORT+"/"+DB;
            conn = DriverManager.getConnection(connectionString,USER,PASS);
        } catch (Exception e) {
            Log.e("Error", Objects.requireNonNull(e.getMessage()));
        }
        return conn;
    }
}

