/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package upeu.tresenrayamvc;


import upeu.tresenrayamvc.gui.ControllerGameMVC;
import upeu.tresenrayamvc.gui.ModelGameMVC;
import upeu.tresenrayamvc.gui.ViewGameMVC;

/**
 *
 * @author ASUS
 */
public class TresEnRayaMVC {

    public static void main(String[] args) {
        ModelGameMVC model = new ModelGameMVC();
        ViewGameMVC view = new ViewGameMVC();
        ControllerGameMVC Cgamer = new ControllerGameMVC(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);

    }
}
