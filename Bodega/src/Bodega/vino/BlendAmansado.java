package Bodega.vino;

/**
 * Clase que implementa el vino de mezclas de Tinto, hereda de la clase Blend
 *  @version 1.0.0
 *  @author Tomas Rando, Enzo Palau, Julian Montano
 *
 */
public class BlendAmansado extends Blend implements Prints{
    //Atributos

    //Constructor

    /**
     * Constructor de la clase
     * @param lote Es el lote del vino. Es un int
     * @param anoElaboracion Es el anio de insercion del vino en el sistema. Es un int
     */
    public BlendAmansado(int lote, int anoElaboracion) {
        super("Blend Amansado", "Blend", lote, anoElaboracion, 0, 0, 0);
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
        System.out.println("Este vino es un buen ejemplo de la combinación de los mejores varietales tintos de la bodega. Esta compuesto por 50% Malbec y 50% Cabernet Sauvignon.");
        System.out.println("Es un vino con mucho cuerpo, en nariz se perciben notas a frutas rojas, negras y pimiento rojo. En boca es largo, profundo, untuoso, graso y pesado, pero no pierde frescura gracias a su acidez.");
    }



}