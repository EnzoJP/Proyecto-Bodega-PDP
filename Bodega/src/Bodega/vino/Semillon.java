package Bodega.vino;
/**
 * Clase del vino Semillon. Posee las temperaturas y tiempos por defectos propios de la clase
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau y Julian Montano
 */
public class Semillon extends Blanco implements Prints{
    //Atributos

    //Constructor
    /**
     * Constructor de la clase
     * @param lote Es el lote del vino. Es un int
     * @param anoElaboracion Es el anio de insercion del vino en el sistema. Es un int
     * @param etapaActual Es la etapa en la que se encuentra el vino actualmente. Es una string
     */
    public Semillon(int lote, int anoElaboracion, String etapaActual) {
        super("Semillon", "Blanco", lote, anoElaboracion, etapaActual, 0, 0, 0);
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
        System.out.println("La maduración de sus uvas es muy equilibrada, con un gran contenido de azúcar y buena acidez. Su potencial permite elaborar grandes vinos dulces y secos, con una paleta aromática que varía de notas como el limón, manzana");
        System.out.println("verde o pera a frutas tropicales como el mango, flores blancas como la camomila, y destacadas notas a miel e higo. Es un vino de gran personalidad y buen volumen que evoluciona muy bien en botella hasta desarrollar aromas complejos y elegantes.");
    }
}
