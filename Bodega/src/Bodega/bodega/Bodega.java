package Bodega.bodega;

import Bodega.control.ControlDeInventario;

import Bodega.vino.*;
/**
 * Clase que forma el primer nivel de abstraccion de la bodega
 * @version 1.0.0
 * @author Enzo Palau, Tomas Rando, Julian Montano
 * @since 11
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
    private ControlDeInventario controlDeBodega; //objeto

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
        this.controlDeBodega  = new ControlDeInventario(2023);
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

    /**
     * Llama al metodo instanciar vino de control
     * @param vinoSt String con la opcion del vino elegido
     * @param lote Lote del vino a instanciar
     */
    public void instanciarVino(String vinoSt, int lote) {
        controlDeBodega.instanciarVino(vinoSt, lote);
    }

    /**
     * Obtiene el vino del ArrayList de vinos de control y lo usa para llamar a cambiarDeEtapa de control
     * @param vino Entero con el indice del vino al cual se le cambiara la etapa
     */
    public void cambiarDeEtapa(int vino) {
        Vino vinoOption = controlDeBodega.getVinos(vino);
        controlDeBodega.cambiarDeEtapa(vinoOption);
    }

    /**
     * Llama al metodo imprimirVinos de bodega para imprimir vinos y retornar el indice de uno de ellos
     * @return El indice del vino seleccionado
     */
    public int imprimirVinos() {
        return controlDeBodega.imprimirVinos();
    }

    /**
     * Llama a consultarEtapa de control, se utiliza para consultar la etapa actual del vino seleccionado
     * @param vino Entero con el indice del vino seleccionado en el ArrayList
     */
    public void consultarEtapa(int vino) {
        controlDeBodega.consultarEtapa(vino);
    }

    /**
     * Llama a consultarCaracteristicas de control, se utiliza para consultar las caracteristicas del vino seleccionado
     * @param index Entero con el indice del vino seleccionado dentro del ArrayList
     */
    public void consultarCaracteristicas(int index) {
        controlDeBodega.consultarCaracteristicas(index);
    }

    /**
     * Llama a consultarMaridaje de control, se utiliza para consultar el maridaje del vino seleccionado
     * @param index Entero con el indice del vino seleccionado dentro del ArrayList
     */
    public void consultarMaridaje(int index) {
        controlDeBodega.consultarMaridaje(index);
    }

    /**
     * Llama a borrarVino de control, se utiliza para borrar un vino de la ejecucion (o desinstanciarlo)
     * @param vino Entero con el indice del vino seleccionado dentro del ArrayList
     */
    public void borrarVino(int vino) {
        controlDeBodega.borrarVino(vino);
    }
    }


