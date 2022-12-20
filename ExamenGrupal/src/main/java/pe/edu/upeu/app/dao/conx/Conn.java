/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.dao.conx;

import com.sun.tools.javac.Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conn {
    //Formato de fecha
    public static final String DEFAULT_DATE_STRING_FORMAT_PE = "dd/MM/yyyy";
    public static final String DEFAULT_DATE_STRING_FORMAT = "yyyy-MM-dd HH:mm:ss";
    static Connection conn = null;
    
    //Abrir coneccion
    public static Connection connectSQLite() {
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:data/db_ventas.db?foreign_keys=on;";
            if (conn == null) {
                conn = DriverManager.getConnection(dbURL);
            }
            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conn;
    }
    //Cerrar coneccion
    public static void closeSQLite(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        connectSQLite();
    }

    public static Conn getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
