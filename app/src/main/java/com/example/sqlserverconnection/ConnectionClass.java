package com.example.sqlserverconnection;

import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass {
    private String login  = "sa";
    private String password = "12345";
    private String ip = "192.168.1.140";
    private String port = "1433";
    private String databaseName = "testdatabase";
    public Connection connection()
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String url = "";
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            url = "jdbc:jtds:sqlserver://"+ip+":"+port+";"+"databasename="+databaseName+";user="+login+";password="+password+";";
            connection = DriverManager.getConnection(url);
        }catch (Exception e){

        }
        return connection;
    }
}
