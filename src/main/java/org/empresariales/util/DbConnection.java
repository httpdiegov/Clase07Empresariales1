package org.empresariales.util;


import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    private static DbConnection instance;
    private static Connection conexion;
    private static String URL = "jdbc:mysql://localhost:3306/northwind";
    private static String user = "root";
    private static String password = "";

    private DbConnection() throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, user, password);
        }catch (Exception e){
            throw new Exception("Error de conexión: " +e.getMessage());
        }
    }

    public Connection getConexion(){
        return conexion;
    }

    public static DbConnection getInstance() throws Exception {
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }

}