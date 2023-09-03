package Bodega.bodega;

import Bodega.control.Control;
import java.util.ArrayList;

import Bodega.maridaje.Maridaje;
import Bodega.vino.Vino;

public class Bodega {
    private  String nombreDeBodega;
    private  String direccionDeBodega;
    private  String directorDeBodega;
    private Control controlDeBodega; //objeto

    public Bodega(String nombreDeBodega, String direccionDeBodega, String directorDeBodega) {
        this.nombreDeBodega = nombreDeBodega;
        this.direccionDeBodega = direccionDeBodega;
        this.directorDeBodega = directorDeBodega;
    }

    public String getNombreDeBodega() {
        return nombreDeBodega;
    }

    public void setNombreDeBodega(String nombreDeBodega) {
        this.nombreDeBodega = nombreDeBodega;
    }

    public String getDireccionDeBodega() {
        return direccionDeBodega;
    }

    public void setDireccionDeBodega(String direccionDeBodega) {
        this.direccionDeBodega = direccionDeBodega;
    }

    public String getDirectorDeBodega() {
        return directorDeBodega;
    }

    public void setDirectorDeBodega(String directorDeBodega) {
        this.directorDeBodega = directorDeBodega;
    }

    public void  instanciarVino(){

    }

    public void imprimirVinos(){
        controlDeBodega.imprimirVinos();
    }
    public void avanzarAño(int año){
        controlDeBodega.setAñoActual(año);
    }
    /*
    public String obtenerMaridaje(String eleccionMenu){
        Maridaje maridaje = new Maridaje();
        String respuestaMaridaje = ;

        return respuestaMaridaje;
    }

     */
}
