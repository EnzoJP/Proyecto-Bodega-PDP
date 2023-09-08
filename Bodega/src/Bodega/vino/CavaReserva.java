package Bodega.vino;
/**
 * Clase del vino Cava Reserva. Posee las temperaturas y tiempos por defectos propios de la clase
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau y Julian Montano
 */
public class CavaReserva extends Cava implements Prints {
    //Atributos

    //Constructor
    /**
     * Constructor de la clase
     * @param lote Es el lote del vino. Es un int
     * @param anoElaboracion Es el anio de insercion del vino en el sistema. Es un int
     * @param etapaActual Es la etapa en la que se encuentra el vino actualmente. Es una string
     */
    public CavaReserva(int lote, int anoElaboracion, String etapaActual) {
        super("Cava Reserva", "Cava", lote, anoElaboracion, etapaActual, 0, 0, 0);
    }

    //Muestra el listado de etapas del presente vino
    /**
     * Muestra el listado de etapas del vino
     */
    public void mostrarEtapas() {
        System.out.println("========== LISTADO DE ETAPAS ==========");
        for (int i = 0; i < listadoEtapas.length; i++) {
            System.out.println(i + ". " + listadoEtapas[i]);
            System.out.print(" ");
        }
        System.out.println("========================================");
    }

    //Retorna la etapa que se encuentra en la posición i pasada como parámetro
    /**
     * Devuelve la etapa que se encuentra en la posicion seleccionada
     * @param i Es la posicion de la etapa en el array de etapas. Sera seleccionada por el usuario mediante un menu
     * @return String con la etapa de la posicion pasada como parametro
     */
    public String getEtapa(int i) {
        return listadoEtapas[i];
    }

    //Imprime las características del vino
    /**
     * Imprime las caracteristicas del vino
     */
    @Override
    public void printCaracteristicas() {
        System.out.println("Las características del vino elegido son: ");
        System.out.println("Posee un color amarillo claro con reflejos dorados. Además, tiene un aroma de intensidad media alta, anís, melocotón, albaricoque, flor de manzanos y ligeros toques tostados.");
        System.out.println("Tiene una buena presencia de burbuja fina e integrada. Muy agradable a la boca, con buena acidez y final ligeramente amargo.");
    }
}
