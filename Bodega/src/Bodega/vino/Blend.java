package Bodega.vino;
/**
 * Clase que engloba a los vinos Blend. Es abstracta y tiene como atributo importante el array de String con las etapas
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau, Julian Montano
 * @see Bodega.vino.Vino
 */
public abstract class Blend extends Vino{
    //Array de string con el listado de etapas de los vinos Blancos
    /**
     * Es el array de String con las etapas del tipo de vino
     */
    protected String[] listadoEtapas;

    /**
     * Es el constructor de la clase
     * @param nombreVino Es el nombre del vino instanciado, por ejemplo Blend VinoSabroso, Merlot, etc
     * @param tipoDeVino Es el tipo de vino que se instancia (Tinto, Blanco, Rosado, Cava o Blend)
     * @param lote Es el numero identificador del vino. Es entero
     * @param anoElaboracion Es el anio en el que es ingresado al sistema. Es entero
     * @param temperaturaFermentacion Es la temperatura a la que se fermenta el vino. Medido en C. Es float
     * @param tiempoCrianza Es el tiempo de crianza que tendra el vino. Medido en meses. Es float
     * @param tiempoMaceracion Es el tiempo de maceracion que tendra el vino. Medido en meses. Es float
     */
    //Constructor
    public Blend(String nombreVino, String tipoDeVino, int lote, int anoElaboracion, float temperaturaFermentacion, float tiempoCrianza, float tiempoMaceracion, String maridaje) {
        super(nombreVino, tipoDeVino, lote, anoElaboracion, temperaturaFermentacion, tiempoCrianza, tiempoMaceracion, maridaje);

        //Asignación de los valores por defecto - a modificar
        //17
        this.listadoEtapas = new String[]{"Recoleccion", "Transporte", "Reparticion", "Despalillado", "Estrujado", "Desfangado", "TrasladoSolidos", "Maceracion", "FermentacionAlcoholica", "FermentacionVirgen", "Trasiego", "Clarificacion", "Filtracion", "Estabilizacion", "Crianza", "Embotellado", "Venta"};
    }
}
