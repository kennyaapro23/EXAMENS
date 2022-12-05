
import pe.edu.upeu.examen2.gui.ControllerGame;
import pe.edu.upeu.examen2.gui.Inicio;
import pe.edu.upeu.examen2.gui.ModelGame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class tresraya {
        public static void main(String[] args) {
        ModelGame model = new ModelGame();
        Inicio view = new Inicio();
        ControllerGame controlador = new ControllerGame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
