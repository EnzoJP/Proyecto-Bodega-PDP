package Bodega.control;
import Bodega.vino.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {
    private ArrayList<Vino> inventarioVinos;
    private int cantVinosContador;
    private int anoActual;

    public Control(int anoActual) {
        inventarioVinos = new ArrayList<>();
        this.cantVinosContador = 0;
        this.anoActual = anoActual;
    }

    public void consultarCaracteristicas(int index) {
        Vino vinoOption = inventarioVinos.get(index);
        vinoOption.printCaracteristicas();
        System.out.println(" ");
    }
    public void instanciarVino(String opcionVino, int lote) {
        Vino v1;
        if (opcionVino.equals("Malbec")) {
            v1 = new Malbec(lote, anoActual);
        } else if (opcionVino.equals("Merlot")) {
            v1 = new Merlot(lote, anoActual);
        } else if (opcionVino.equals("CabernetSauvignon")) {
            v1 = new CabernetSauvignon(lote, anoActual);
        } else if (opcionVino.equals("Syrah")) {
            v1 = new Syrah(lote, anoActual);
        } else if (opcionVino.equals("Chardonnay")) {
            v1 = new Chardonnay(lote, anoActual);
        } else if (opcionVino.equals("Semillon")) {
            v1 = new Semillon(lote, anoActual);
        } else if (opcionVino.equals("Viognier")) {
            v1 = new Viognier(lote, anoActual);
        } else if (opcionVino.equals("SauvignonBlanc")) {
            v1 = new SauvignonBlanc(lote, anoActual);
        } else if (opcionVino.equals("MalbecRose")) {
            v1 = new MalbecRose(lote, anoActual);
        } else if (opcionVino.equals("CabernetSauvignonRose")) {
            v1 = new CabernetSauvignonRose(lote, anoActual);
        } else if (opcionVino.equals("SyrahRose")) {
            v1 = new SyrahRose(lote, anoActual);
        } else if (opcionVino.equals("MerlotRose")) {
            v1 = new MerlotRose(lote, anoActual);
        } else if (opcionVino.equals("CavaGranReserva")) {
            v1 = new CavaGranReserva(lote, anoActual);
        } else if (opcionVino.equals("CavaReserva")) {
            v1 = new CavaReserva(lote, anoActual);
        } else if (opcionVino.equals("CavaJoven")) {
            v1 = new CavaJoven(lote, anoActual);
        } else if (opcionVino.equals("BlendAmansado")) {
            v1 = new BlendAmansado(lote, anoActual);
        } else {
            v1 = new BlendVinoSabroso(lote, anoActual);
        }

        cambiarDeEtapa(v1);
        inventarioVinos.add(v1);
        aumentoContador();
    }

    //Es el cambio individualmente
    public void cambiarDeEtapa(Vino vino) {
        String tipo = vino.getTipoDeVino();
        String etapa;
        Scanner scanner = new Scanner(System.in);
        int maxEtapas;
        int etapaIndice;
        if (tipo.equals("Tinto")) {
            System.out.println("Este es el listado de etapas de los vinos tintos: ");
            maxEtapas = 16;
        } else if (tipo.equals("Blanco")) {
            System.out.println("Este es el listado de etapas de los vinos blancos: ");
            maxEtapas = 15;
        } else if (tipo.equals("Cava")) {
            System.out.println("Este es el listado de etapas de los vinos cava: ");
            maxEtapas = 19;
        } else if (tipo.equals("Rosado")) {
            System.out.println("Este es el listado de etapas de los vinos rosados: ");
            maxEtapas = 16;
        } else {
            System.out.println("Este es el listado de etapas de los vinos blend: ");
            maxEtapas = 17;
        }
        System.out.println(" ");
        vino.mostrarEtapas();
        System.out.println("Por favor, seleccione la etapa de su vino");
        do {
            try {
                System.out.println("Ingrese índice: ");
                etapaIndice = scanner.nextInt();
                if (etapaIndice < 0 || etapaIndice > (maxEtapas - 1)) {
                    System.out.println("El indice no es correcto. Intente nuevamente");
                }
            } catch (InputMismatchException e1) {
                System.out.println("El indice ingresado no es válido. Intente nuevamente");
                scanner.nextLine();
                etapaIndice = 100;
            }
        } while (etapaIndice < 0 || etapaIndice > (maxEtapas - 1));
        scanner.nextLine();
        etapa = vino.getEtapa(etapaIndice);
        vino.setEtapa(etapa);

    }

    public void aumentoContador(){
        this.cantVinosContador++;
    }

    public void consultarMaridaje(int index) {
        Vino vino = inventarioVinos.get(index);
        System.out.println("El maridaje del vino seleccionado es: " + vino.getMaridaje());
        System.out.println(" ");
    }

    //Se ingresa el vino a eliminar
    public void borrarVino(int i){
        inventarioVinos.remove(i);
    }

    public Vino getVinos(int index) {
        return inventarioVinos.get(index);
    }

    public void setInventarioVinos(ArrayList<Vino> inventarioVinos) {
        this.inventarioVinos = inventarioVinos;
    }

    public int getCantVinosContador() {
        return cantVinosContador;
    }

    public void setCantVinosContador(int cantVinosContador) {
        this.cantVinosContador = cantVinosContador;
    }

    public int getAnoActual() {
        return anoActual;
    }

    public void setAnoActual(int anoActual) {
        this.anoActual = anoActual;
    }

    public void consultarEtapa(Vino vino){
        System.out.println("El vino seleccionado se encuentra en la etapa: " + vino.getEtapaActual());
        System.out.println(" ");
    }

    public int imprimirVinos() {
        if (inventarioVinos.isEmpty()) {
            return -1;
        }
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        int index;
        System.out.println("=========================");
        for (Vino vino : inventarioVinos) {
            System.out.println(cont + ". Vino: " + vino.getNombreDeVino() + " - Lote: " + vino.getLote());
            cont = cont + 1;
        }
        System.out.println("=========================");
        System.out.println(" ");
        do {
            try {
                System.out.println("Ingrese índice: ");
                index = scanner.nextInt();
                if (index < 0 || index > inventarioVinos.size()) {
                    System.out.println("El índice está fuera del rango. Intente nuevamente");
                }
            } catch (InputMismatchException e1) {
                System.out.println("El índice ingresado no es válido. Intente nuevamente");
                scanner.nextLine();
                index = -5;
            }
        } while (index < 0 || (index > inventarioVinos.size()));
        scanner.nextLine();
        System.out.println(" ");
        return index;
    }


    public void avanzarAno(){
        this.anoActual++;
    }



}