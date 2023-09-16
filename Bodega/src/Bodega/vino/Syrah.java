package Bodega.vino;
/**
 * Clase del vino Syrah. Posee las temperaturas y tiempos por defectos propios de la clase
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau y Julian Montano
 */
public class Syrah extends Tinto implements Prints{
    //Atributos

    //Constructor
    /**
     * Constructor de la clase
     * @param lote Es el lote del vino. Es un int
     * @param anoElaboracion Es el anio de insercion del vino en el sistema. Es un int
     */
    public Syrah(int lote, int anoElaboracion) {
        super("Syrah", "Tinto", lote, anoElaboracion, 0, 0, 0);
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

    //Imprime las características del vino
    /**
     * Imprime las caracteristicas del vino
     */
    @Override
    public void printCaracteristicas() {
        System.out.println("Las características del vino elegido son: ");
        System.out.println("Posee mucho color oscuro e intenso, además, es muy aromático y muy afamado en la viticultura mundial. Tienen aromas a fruta madura, como las grosellas, violetas, moras silvestres o frambuesas.");
        System.out.println("Además, mantienen sus aromas a pimiento, canela o clavo. Finalmente, posee taninos muy suaves y cuando envejecen, no toman mucho aroma de la madera.");
    }
}
