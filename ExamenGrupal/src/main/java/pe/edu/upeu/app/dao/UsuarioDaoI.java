/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.util.List;
import pe.edu.upeu.app.modelo.UsuarioTO;

/**
 *
 * @author ASUS
 */
public interface UsuarioDaoI {
    
    public int create(UsuarioTO d);

    public int update(UsuarioTO d);

    public int delete(String id) throws Exception;

    public List<UsuarioTO> listCmb(String filter);

    public List<UsuarioTO> listarUsuarios();

    public UsuarioTO buscarUsuarios(String usuario);

    public void reportarUsuariose();
    
}
