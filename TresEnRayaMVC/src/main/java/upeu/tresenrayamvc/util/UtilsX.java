/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.tresenrayamvc.util;

import java.net.URL;

/**
 *
 * @author ASUS
 */
public class UtilsX {
        public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }
}
