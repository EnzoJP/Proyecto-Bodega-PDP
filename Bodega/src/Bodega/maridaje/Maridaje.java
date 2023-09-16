package Bodega.maridaje;
import java.util.Scanner;

/**
 * Clase que se encarga del maridaje. Basicamente es el contenedor del maridaje de cada vino
 * @version 1.0.0
 * @author Enzo Palau, Tomas Rando, Julian Montano
 * @since 11
 */
public class Maridaje {
    private String maridaje;

    /**
     * Constructor de la clase Maridaje
     * @param maridaje String con el maridaje del vino
     */
    public Maridaje(String maridaje) {
        this.maridaje = maridaje;
    }

    /**
     * Getter del atributo maridaje
     * @return El string que tiene el maridaje
     */
    public String getMaridaje() {return maridaje;}
}
