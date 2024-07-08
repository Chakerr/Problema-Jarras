/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import gfutria.SearchStateSpaces;
import java.util.ArrayList;
import mundo.Jarras;

/**
 * Clase main encargada de ejecutar el programa.
 * @version 2.0.
 * @author Mario Palencia
 * @author Kevin Navarrete
 * @author Gabriel Romero
 * @author Daniel Torres
 */
public class InterfazAPP {

    /**
     * Constructor de la clase principal.
     */
    public InterfazAPP() {
    }
    
    /**
     * Metodo principal que inicia la interfaz de la aplicacion
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        SearchStateSpaces ss;
        Jarras jarras;
        ArrayList<String> lst;

        System.out.println("Jarras S3...");
        jarras = new Jarras(3, 2);

        ss = new SearchStateSpaces("0:4", jarras, 8);
        lst = ss.solve();

        System.out.println("numero de pasos: " + lst.size());
        if (lst.size() > 0) {
            for (int i = 0; i < lst.size(); i++) {
                System.out.println(lst.get(i));
            }
        }
    }
}
