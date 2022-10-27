/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.dao.conx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class ConexionBD {
    
    
    public static String url = "jdbc:sqlite:data/db_ventas.db";
    public static String Usuario = "root";
    public static String Contraseña = "root";
    public static String clase = "org.sqlite.JDBC";
    
    public static Connection conectar() {
        Connection conexion = null;
        
        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url,Usuario,Contraseña);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
        
    }
    
}
