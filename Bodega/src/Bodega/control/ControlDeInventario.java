package Bodega.control;
import Bodega.vino.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase central o más importante de la bodega. Es la encargada de realizar todos los procesos de la bodega.
 * @author Tomas Rando, Enzo Palau, Julian Montano
 * @version 1.0.0
 * @since 11
 */

public class ControlDeInventario {
    /**
     * ArrayList con el inventario de los vinos. Es decir, todos los vinos seran almacenados aqui
     */
    private ArrayList<Vino> inventarioVinos;
    /**
     * Contador con todos los vinos de la bodega
     */
    private int cantVinosContador;
    /**
     * Anio actual
     */
    private int anoActual;

    /**
     * Constructor de la clase
     * @param anoActual Anio actual como entero
     */
    public ControlDeInventario(int anoActual) {
        inventarioVinos = new ArrayList<>();
        this.cantVinosContador = 0;
        this.anoActual = anoActual;
    }

    /**
     * Método para consultar las características de los vinos e imprimirlas por pantalla
     * @param index Entero con el indice del vino seleccionado
     */
    public void consultarCaracteristicas(int index) {
        Vino vinoOption = inventarioVinos.get(index);
        vinoOption.printCaracteristicas();
        System.out.println(" ");
    }

    /**
     * Utiliza la String con la opcion del vino y el lote para instanciarlo. Instancia cada uno tomando en cuenta su tipo.
     * Ademas, llama a la funcion para agregar la etapa del vino. Tambien, lo agrega al arrayList de vinos y aumenta el contador.
     * @param opcionVino String con el nombre del vino elegido
     * @param lote Int con el lote del vino a agregar
     */
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

    /**
     * Cambia la etapa del vino pasado como parametro. Dentro, muestra el listado de etapas de cada vino y pide al usuario un indice por pantalla.
     * @param vino Objeto del tipo Vino, sera el que recibira el cambio de etapa
     */
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

    /**
     * Aumenta el contador de control, se utiliza cuando se agrega un vino
     */
    public void aumentoContador(){
        this.cantVinosContador++;
    }

    /**
     * Metodo usado para consultar el maridaje del vino correspondiente al indice pasado como parametro
     * @param index Indice int con la posicion en el arrayList del vino
     */
    public void consultarMaridaje(int index) {
        Vino vino = inventarioVinos.get(index);
        System.out.println("El maridaje del vino seleccionado es: " + vino.getMaridaje());
        System.out.println(" ");
    }

    /**
     * Se borra la referencia al vino en el arrayList con los vinos. Por lo que se deja de referenciar en toda la ejecucion. Ademas se decrementa el contador
     * @param index Indice entero con la posicion del vino en el arrayList
     */
    //Se ingresa el vino a eliminar
    public void borrarVino(int index){
        cantVinosContador--;
        inventarioVinos.remove(index);
    }

    /**
     * Retorna el vino que se encuentra en la posicion del indice pasado como parametro
     * @param index Indice entero con la posicion del vino en el arrayList
     * @return El vino tipo Vino de la posicion seleccionada
     */
    public Vino getVinos(int index) {
        return inventarioVinos.get(index);
    }

    /**
     * Getter del contador con la cantidad de vinos de la bodega
     * @deprecated Actualmente en desuso, pues se penso en agregar para futuras versiones
     * @return Retorna el entero con el contador de vinos
     */
    public int getCantVinosContador() {
        return cantVinosContador;
    }

    /**
     * Setter para el contador de los vinos de control
     * @param cantVinosContador Entero con el valor del nuevo contador
     * @deprecated Actualmente en desuso, pues se pensaba utilizar para futuras versiones
     */
    public void setCantVinosContador(int cantVinosContador) {
        this.cantVinosContador = cantVinosContador;
    }

    /**
     * Getter del anio actual
     * @deprecated Actualmente en desuso, pues se pensaba utilizar para futuras versiones
     * @return Entero con el anio actual
     */
    public int getAnoActual() {
        return anoActual;
    }

    /**
     * Setter del anio actual
     * @deprecated Actualmente en desuso, pues se pensaba utilizar para futuras versiones
     * @param anoActual Entero con el anio actual
     */
    public void setAnoActual(int anoActual) {
        this.anoActual = anoActual;
    }

    /**
     * Metodo para consultar la etapa de un vino. Con el indice se busca el vino en el arrayList de vinos y se utiliza el getter correspondiente
     * @param index Indice entero con la posicion del vino en el ArrayList
     */
    public void consultarEtapa(int index){
        Vino vino = inventarioVinos.get(index);
        System.out.println("El vino seleccionado se encuentra en la etapa: " + vino.getEtapaActual());
        System.out.println(" ");
    }

    /**
     * Metodo para imprimir los vinos actualmente instanciados, ademas, pide por pantalla un indice y lo retorna
     * @return Entero con el indice seleccionado por el usuario, retorna -1 si no hay vinos instanciados
     */
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
                if (index < 0 || index >= inventarioVinos.size()) {
                    System.out.println("El índice está fuera del rango. Intente nuevamente");
                }
            } catch (InputMismatchException e1) {
                System.out.println("El índice ingresado no es válido. Intente nuevamente");
                scanner.nextLine();
                index = -5;
            }
        } while (index < 0 || (index >= inventarioVinos.size()));
        scanner.nextLine();
        System.out.println(" ");
        return index;
    }

    /**
     * Metodo para avanzar el anio en uno
     * @deprecated Actualmente en desuso, pues se pensaba utilizar para futuras versiones
     */
    public void avanzarAno(){
        this.anoActual++;
    }



}