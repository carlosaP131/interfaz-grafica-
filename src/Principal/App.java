/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import View.PlantillaLogeo;
import javax.swing.SwingUtilities;

/**
 *
 * @author labdessw09 
 */
public class App {
    public static void main(String[] args) {
        Runnable runnsplication = new Runnable() {
            @Override
            public void run() {
                PlantillaLogeo logeo = new PlantillaLogeo();
                logeo.getClass();
            }
        };
        SwingUtilities.invokeLater(runnsplication);

    }
}
