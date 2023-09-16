package Bodega.vino;

/**
 * Clase del vino Cabernet Sauvignon. Posee las temperaturas y tiempos por defectos propios de la clase
 *
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau y Julian Montano
 */
public class CabernetSauvignon extends Tinto {
    //Atributos

    //Constructor

    /**
     * Constructor de la clase
     * @param lote Es el lote del vino. Es un int
     * @param anoElaboracion Es el anio de insercion del vino en el sistema. Es un int
     */
    public CabernetSauvignon(int lote, int anoElaboracion) {
        super("Cabernet Sauvignon", "Tinto", lote, anoElaboracion, 0, 0, 0);
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
    public String getEtapa(int i) {return listadoEtapas[i];
    }

    //Funcion que imprime las caracteristicas del vino

    /**
     * Imprime las caracteristicas del vino
     */
    @Override
    public void printCaracteristicas() {
        System.out.println("Las características del vino elegido son: ");
        System.out.println("Es un vino de color rojo profundo con aromas a mermelada de grosella y pimienta negra. Generoso en boca, con un final sedoso y taninos maduros.");
        System.out.println("Un ejemplar en el que se destaca la mineralidad del suelo, el carácter de la fruta y la estructura.");
    }


}
