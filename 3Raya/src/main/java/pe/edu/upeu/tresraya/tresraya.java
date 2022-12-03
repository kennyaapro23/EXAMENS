/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package pe.edu.upeu.tresraya;

import pe.edu.upeu.gui.ControlarJuego;
import pe.edu.upeu.gui.Inicio;
import pe.edu.upeu.gui.ModeloJuego;

/**
 *
 * @author HP
 */
public class tresraya {

    public static void main(String[] args) {
        ModeloJuego model = new ModeloJuego();
        Inicio view = new Inicio();
        ControlarJuego controlador = new ControlarJuego(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
