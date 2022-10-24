/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import pe.edu.upeu.app.dao.conx.Conn;
import pe.edu.upeu.app.modelo.UsuarioTO;
import pe.edu.upeu.app.util.ErrorLogger;

/**
 *
 * @author ASUS
 */
public class UsuarioDAO implements UsuarioDaoI {

    public static void create(String text, String text0, String text1, String text2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Statement stmt = null;
    Vector columnNames;
    Vector visitdata;
    Connection connection = Conn.connectSQLite();
    static PreparedStatement ps;
    static ErrorLogger log = new ErrorLogger(UsuarioDAO.class.getName());
    ResultSet rs = null;

    public UsuarioDAO(Vector columnNames, Vector visitdata) {
        columnNames = new Vector();
        visitdata = new Vector();
    }

    @Override
    public int create(UsuarioTO d) {
        int rsId = 0;
        String[] returns = {"usuario"};
        String sql = "INSERT INTO usuario(nombre, apellido, correo, usuario, contraseña) "
                + "VALUES(?,?,?,?,?)";
        int i = 0;
        try {
            ps = connection.prepareStatement(sql, returns);
            ps.setString(++i, d.getNombre());
            ps.setString(++i, d.getApellido());
            ps.setString(++i, d.getCorreo());
            ps.setString(++i, d.getUsuario());
            ps.setString(++i, d.getContrasenia());
            rsId = ps.executeUpdate();// 0 no o 1 si commit
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    rsId = rs.getInt(1);
                }
                rs.close();
            }
        } catch (SQLException ex) {
//System.err.println("create:" + ex.toString());
            log.log(Level.SEVERE, "create", ex);
        }
        return rsId;
    }

    @Override
    public int delete(String id) throws Exception {
        int comit = 0;
        String sql = "DELETE FROM usuario WHERE usuario = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, id);
            comit = ps.executeUpdate();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "delete", ex);
// System.err.println("NO del " + ex.toString());
            throw new Exception("Detalle:" + ex.getMessage());
        }
        return comit;
    }

    @Override
    public int update(UsuarioTO d) {
        System.out.println("actualizar d.getContraseña: " + d.getContrasenia());
        int comit = 0;
        String sql = "UPDATE usuario SET "
                + "contraseña=?, ";

        int i = 0;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(++i, d.getNombre());
            ps.setString(++i, d.getApellido());
            ps.setString(++i, d.getCorreo());
            ps.setString(++i, d.getUsuario());
            ps.setString(++i, d.getContrasenia());
            comit = ps.executeUpdate();
        } catch (SQLException ex) {
            log.log(Level.SEVERE, "update", ex);
        }
        return comit;
    }

    @Override
    public List<UsuarioTO> listCmb(String filter) {
        List<UsuarioTO> ls = new ArrayList();
        ls.add(new UsuarioTO());
        ls.addAll(listarUsuarios());
        return ls;
    }

    @Override
    public List listarUsuarios() {

        return null;

    }

    @Override
    public UsuarioTO buscarUsuarios(String dni) {
        UsuarioTO usuario = new UsuarioTO();
        String sql = "SELECT * FROM usuario WHERE usuario = ?";
        try {
            connection = new Conn().connectSQLite();
            ps = connection.prepareStatement(sql);
            ps.setString(1, null);
            rs = ps.executeQuery();
            if (rs.next()) {
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setContrasenia(rs.getString("contraseña"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return usuario;
    }

    @Override
    public void reportarUsuariose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
