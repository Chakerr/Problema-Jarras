/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import gfutria.Logic;

/**
 * Clase encargada de manejar la logica del problema de las jarras.
 * @version 2.0.
 * @author Mario Palencia
 * @author Kevin Navarrete
 * @author Gabriel Romero
 * @author Daniel Torres
 * @see gfutria.Logic
 */
public class Jarras extends Logic {

    //Atributos
    /**
     *  Jarra con capacidad de 6 litros.
     */
    private int jarra6;
    /**
     * Jarra con capacidad de 8 litros.
     */
    private int jarra8;

    //constructores
    /**
     * Constructor que incializa las jarras
     */
    public Jarras() {

    }

    /**
     * Constructor que permite inicializar las jarras con una capacidad
     *
     * @param jarras6 Capacidad inicial de la jarra 6
     * @param jarra8 Capacidad inicial de la jarra 8
     */
    public Jarras(int jarras6, int jarra8) {
        this.jarra6 = jarras6;
        this.jarra8 = jarra8;

    }

    //metodos get o set
    /**
     * Se obtiene la cantidad de agua actual para la jarra de 6 litros
     *
     * @return la cantidad de agua en la jarra
     *
     */
    public int getJarra6() {
        return jarra6;
    }

    /**
     * Establece la cantidad de agua en la jarra de 6 litros
     *
     * @param jarra6 Nueva cantidad de agua en la jarra6
     */
    public void setJarra6(int jarra6) {
        this.jarra6 = jarra6;
    }

    /**
     * Se obtiene la cantidad de agua acutal para la jarra8
     *
     * @return la cantidad de agua en la jarra8
     */
    public int getJarra8() {
        return jarra8;
    }

    /**
     * Establece la cantidad de agua en la jarra8
     *
     * @param jarra8 Nueva cantidad de agua en la jarra8
     */
    public void setJarra8(int jarra8) {
        this.jarra8 = jarra8;
    }

    /**
     *
     * LLena la jarra6 hasta su maxima capacidad
     *
     */
    public void llenar6() {
        jarra6 = 6;

    }

    /**
     *
     * Llena la jarra8 hasta su maxima capacidad
     *
     */
    public void llenar8() {
        jarra8 = 8;

    }

    /**
     *
     * Vacia por completo la jarra6
     *
     */
    public void vaciar6() {
        jarra6 = 0;
    }

    /**
     *
     * Vacia por completo la jarra8
     *
     */
    public void vaciar8() {
        jarra8 = 0;
    }

    /**
     *
     * Llena la jarra6 con el agua que tiene la jarra8
     *
     */
    public void llenar6con8() {
        int espacioEnJarra6 = 6 - jarra6;
        if (jarra8 >= espacioEnJarra6) {
            jarra6 += espacioEnJarra6;
            jarra8 -= espacioEnJarra6;
        } else {
            jarra6 += jarra8;
            jarra8 = 0;
        }

    }
    /**
     * Llena la jarra8 con el agua que tiene la jarra6
     */
    public void llenar8con6() {
        int espacioEnJarra8 = 8 - jarra8;
        if (jarra6 >= espacioEnJarra8) {
            jarra8 += espacioEnJarra8;
            jarra6 -= espacioEnJarra8;
        } else {
            jarra8 += jarra6;
            jarra6 = 0;
        }
    }

    /**
     * Mueve el agua de la jarra6 ala jarra8
     */
    public void descargar6en8() {
        jarra8 += jarra6;
        jarra6 = 0;
    }

    /**
     * Mueve el agua de la jarra8 a la jarra6
     */
    public void descargar8en6() {
        jarra6 += jarra8;
        jarra8 = 0;
    }

    /**
     * Clona un objeto de tipo Jarras.
     * @param logic El objeto a clonar.
     * @return Una instancia clonada de la clase Jarras.
     */
    @Override
    public Logic cloneObject(Logic logic) {
        Jarras clonJarras = new Jarras();
        clonJarras.setJarra6(((Jarras) logic).getJarra6());
        clonJarras.setJarra8(((Jarras) logic).getJarra8());
        return (Logic) clonJarras;
    }

    /**
     * Devuelve el estado inicial del problema de las jarras.
     * @return El estado actual del problema en formato de cadena.
     */
    @Override
    public String state() {
        return jarra6 + ":" + jarra8;
    }

     /**
     * Realiza una acción específica según el parámetro proporcionado.
     * @param i El número de la acción a realizar.
     */
    @Override
    public void action(int i) {
        switch (i) {
            case 1:
                llenar6();
                break;
            case 2:
                llenar8();
                break;
            case 3:
                vaciar6();
                break;
            case 4:
                vaciar8();
                break;
            case 5:
                llenar6con8();
                break;
            case 6:
                llenar8con6();
                break;
            case 7:
                descargar6en8();
                break;
            case 8:
                descargar8en6();
                break;

        }
    }
}
