package Bodega.vino;

/**
 * Clase que implementa el vino de mezclas de Blancos, hereda de la clase Blend
 *  @version 1.0.0
 *  @author Tomas Rando, Enzo Palau, Julian Montano
 *
 */
public class BlendVinoSabroso extends Blend {
    //Atributos

    //Constructor

    /**
     * Constructor de la clase
     * @param lote Es el lote del vino. Es un int
     * @param anoElaboracion Es el anio de insercion del vino en el sistema. Es un int
     */
    public BlendVinoSabroso(int lote, int anoElaboracion) {
        super("Blend VinoSabroso", "Blend", lote, anoElaboracion, 0, 0, 0);
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
    @Override
    public String getEtapa(int i) {
        return listadoEtapas[i];
    }

    //Funcion que imprime las caracteristicas del vino

    /**
     * Imprime las caracteristicas del vino
     */
    @Override
    public void printCaracteristicas() {
        System.out.println("Las características del vino elegido son: ");
        System.out.println("Es el vino especialidad de la casa. Compuesto por 30% Sauvignon Blanc, 20% Chardonnay, 30% Semillon y 20% Viognier. Es un vino de color dorado pálido con tintes verdosos. Su olor es muy complejo y de varias capas aromáticas.");
        System.out.println("Primero aparecen notas frescas de cítricos como lima. Luego frutas como el durazno blanco. Finalmente se encuentran damascos maduros, ananá y algunas hierbas. En boca es un vino acidez vibrante y crocante, refrescante, de final jugoso");
    }



}
