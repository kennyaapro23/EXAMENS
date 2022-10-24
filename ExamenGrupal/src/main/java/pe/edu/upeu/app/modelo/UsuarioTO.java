/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.edu.upeu.app.dao.conx.ConexionBD;

/**
 *
 * @author HP
 */
public class UsuarioTO {

    public static ConexionBD conexcion = new ConexionBD();

    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    public int guardar(String nombre, String apellido, String usuario, String clave) {

        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO usuario(nombre, apellido, usuario, clave) values (?,?,?,?)");

        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellido);
            sentencia_preparada.setString(3, usuario);
            sentencia_preparada.setString(4, clave);
            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public static String buscarnombre(String usuario) {
        String busqueda_nombre = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT nombre, apellido FROM usuario WHERE usuario = '" + usuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                busqueda_nombre = (nombre + " " + apellido);
            }
            conexion.close();

        } catch (Exception e) {

            System.out.println(e);
        }
        return busqueda_nombre;
    }

    public static String BuscarUsuarioRegistrado(String usuario, String contraseña) {
        String busqueda_usuario = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT nombre,usuario,clave FROM usuario WHERE usuario = '" + usuario + "' and clave='" + contraseña + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);

            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = "Usuario encontrado";
            } else {
                busqueda_usuario = "Usuario no encontrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }
}
