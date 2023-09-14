package Bodega.bodega;

import Bodega.control.Control;
import java.util.ArrayList;
import java.util.Scanner;

import Bodega.maridaje.Maridaje;
import Bodega.vino.*;
/**
 * Clase que forma el primer nivel de abstraccion
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau, Julian Montano
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













    // Esto deberia ir en control
    /*
    public void  instanciarVino(){
        Scanner scanner = new Scanner(System.in);
        Scanner scannerlote = new Scanner(System.in);
        int option;
        int lote;
        System.out.println("GENERAR VINOS :)");
        System.out.println("Ingrese número de lote: ");
        boolean parada = false;
        while (parada == false) {
            lote = scannerlote.nextInt();
            if (scannerlote.hasNextInt()) {
                parada = true;
            } else {
                System.out.println("La entrada no es válida, ingrese devuelta: ");
                scannerlote.next();
            }
        }
        System.out.println("====================");
        System.out.println("Elija el vino a crear");
        System.out.println("1) CabernetSauvignon ");
        System.out.println("2) CabernetSauvignonRose ");
        System.out.println("3) Cava Gran Reserva");
        System.out.println("4) Cava joven ");
        System.out.println("5) Cava Reserva");
        System.out.println("6) Chardonnay");
        System.out.println("7) Malbec");
        System.out.println("8) Malbec Rose");
        System.out.println("9) Merlot");
        System.out.println("10) Merlot Rose");
        System.out.println("11) Sauvignon Blanc");
        System.out.println("12) Semillon");
        System.out.println("13) Syrah");
        System.out.println("14) SyrahRose ");
        System.out.println("15) Viognier ");
        System.out.println("0) Salir");
        System.out.print("Selecciona una opción: ");
        Vino v1;
        do {
            option= scanner.nextInt();
            if (scanner.hasNextInt()) {
                switch (option){
                    case 1:
                        // v1 = new CabernetSauvignon();//

                }
            } else {
                scanner.next();
                System.out.println("Entrada no válida, ingrese nuevamente: ");
            }
            } while (option != 0 );
        scanner.close();
*/

    }


