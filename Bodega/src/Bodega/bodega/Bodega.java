package Bodega.bodega;

import Bodega.control.Control;
import java.util.ArrayList;
import java.util.Scanner;

import Bodega.maridaje.Maridaje;
import Bodega.vino.*;
/**
 * Clase que forma el primer nivel de abstraccion
 * @version 1.0.0
 * @author Enzo Palau, Tomas Rando, Julian Montano
 */

public class Bodega {
    //Atributos
    /**
     * El nombre de la Bodega en cuestion
     */
    private  String nombreDeBodega;
    /**
     * La direccion de la Bodega (calle, provincia etc)
     */
    private  String direccionDeBodega;
    /**
     * El nombre de el director/ceo de la bodega
     */
    private  String directorDeBodega;
    /**
     * Una clase para control de el inventario de la bodega, (realiza funciones elementales)
     */
    private Control controlDeBodega; //objeto
    //Constructor
    /**
     * Este metodo es el constructor de la clase Vino.
     * @param nombreDeBodega El nombre de la Bodega en cuestion
     * @param direccionDeBodega La direccion de la Bodega (calle, provincia etc)
     * @param directorDeBodega El nombre de el director/ceo de la bodega
     */

    public Bodega(String nombreDeBodega, String direccionDeBodega, String directorDeBodega) {
        this.nombreDeBodega = nombreDeBodega;
        this.direccionDeBodega = direccionDeBodega;
        this.directorDeBodega = directorDeBodega;
        this.controlDeBodega  = new Control(2023);
    }
    /**
     * Devuelve el nombre de la bodega
     * @return Nombre de la bodega
     */

    public String getNombreDeBodega() {
        return nombreDeBodega;
    }
    /**
     * Cambia el nombre de la bodega
     * @param nombreDeBodega  nombre de la bodega como string
     */

    public void setNombreDeBodega(String nombreDeBodega) {
        this.nombreDeBodega = nombreDeBodega;
    }
    /**
     * Devuelve la direccion de la bodega
     * @return direccion de la bodega
     */

    public String getDireccionDeBodega() {
        return direccionDeBodega;
    }
    /**
     * Cambia  la direccion de la bodega
     * @param direccionDeBodega  direccion de la bodega como string
     */

    public void setDireccionDeBodega(String direccionDeBodega) {
        this.direccionDeBodega = direccionDeBodega;
    }
    /**
     * Devuelve el nombre de el director de la bodega
     * @return Nombre de el director de la bodega
     */

    public String getDirectorDeBodega() {
        return directorDeBodega;
    }
    /**
     * Cambia el director de la bodega
     * @param directorDeBodega  nombre de el director como string
     */

    public void setDirectorDeBodega(String directorDeBodega) {
        this.directorDeBodega = directorDeBodega;
    }

    public void instanciarVino(String vinoSt, int lote) {
        controlDeBodega.instanciarVino(vinoSt, lote);
    }
    public void cambiarDeEtapa(int vino) {
        Vino vinoOption = controlDeBodega.getVinos(vino);
        controlDeBodega.cambiarDeEtapa(vinoOption);
    }
    public int imprimirVinos() {
        return controlDeBodega.imprimirVinos();
    }
    public void consultarEtapa(int vino) {
        Vino vinoOption = controlDeBodega.getVinos(vino);
        controlDeBodega.consultarEtapa(vinoOption);
    }
    public void consultarCaracteristicas(int index) {
        controlDeBodega.consultarCaracteristicas(index);
    }
    public void consultarMaridaje(int index) {
        controlDeBodega.consultarMaridaje(index);
    }
    public void borrarVino(int vino) {
        controlDeBodega.borrarVino(vino);
    }
    }


