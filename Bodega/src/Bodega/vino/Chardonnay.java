package Bodega.vino;
/**
 * Clase del vino Chardonnay. Posee las temperaturas y tiempos por defectos propios de la clase
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau y Julian Montano
 */
public class Chardonnay extends Blanco implements Prints{
    //Atributos

    //Constructor
    /**
     * Constructor de la clase
     * @param lote Es el lote del vino. Es un int
     * @param anoElaboracion Es el anio de insercion del vino en el sistema. Es un int
     */
    public Chardonnay(int lote, int anoElaboracion) {
        super("Chardonnay", "Blanco", lote, anoElaboracion, 0, 0, 0);
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
        System.out.println("El Chardonnay puede desarrollar un acentuado perfil tropical o uno más mineral. De ambas formas, sus aromas remiten a la lima, la mandarina, el melón, las frutas tropicales y los minerales.");
        System.out.println("En cualquiera de sus versiones este cepaje es tan rotundo que no se puede probar ningún tinto luego de haber bebido una copa de este blanco: en la boca toca todas las papilas gustativas, la impregna con su sabor.");
    }
}
