package Bodega.bodega;

import Bodega.control.Control;
import java.util.ArrayList;
import java.util.Scanner;

import Bodega.maridaje.Maridaje;
import Bodega.vino.*;

public class Bodega {
    private  String nombreDeBodega;
    private  String direccionDeBodega;
    private  String directorDeBodega;
    private Control controlDeBodega; //objeto

    public Bodega(String nombreDeBodega, String direccionDeBodega, String directorDeBodega) {
        this.nombreDeBodega = nombreDeBodega;
        this.direccionDeBodega = direccionDeBodega;
        this.directorDeBodega = directorDeBodega;
        this.controlDeBodega  = new Control(2023);

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

    }

    public void imprimirVinos(){
        controlDeBodega.imprimirVinos();
    }
    /*
    public void avanzarAno(){
        controlDeBodega.avanzarAno()
    }


    public void consultarEtapa(){
        controlDeBodega.consultarEtapa;
    }

     */
    public void obtenerMaridaje(){
        Maridaje maridaje = new Maridaje();
        maridaje=null; //Borrado de objeto
    }


}
