package Bodega.vino;
/**
 * Clase que engloba a los vinos Rosado. Es abstracta y tiene como atributo importante el array de String con las etapas
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau, Julian Montano
 */
public abstract class Rosado extends Vino {
    //Array de string con el listado de etapas de los vinos Blancos
    /**
     * Es el array de String con las etapas del tipo de vino
     */
    protected String[] listadoEtapas;

    //Constructor
    /**
     * Es el constructor de la clase
     * @param nombreVino Es el nombre del vino como String, es decir, Malbec, Merlot, entre otros.
     * @param tipoVino Es el tipo de vino (Tinto, Blanco, Rosado o Cava) como String.
     * @param lote Es el numero identificador del vino. Es entero
     * @param anoElaboracion Es el anio en el que es ingresado al sistema. Es entero
     * @param etapaActual Es la etapa en la que se encuentra al momento de ser ingresado. Es String
     * @param temperaturaFermentacion Es la temperatura a la que se fermenta el vino. Medido en C. Es float
     * @param tiempoCrianza Es el tiempo de crianza que tendra el vino. Medido en meses. Es float
     * @param tiempoMaceracion Es el tiempo de maceracion que tendra el vino. Medido en meses. Es float
     */
    public Rosado(String nombreVino, String tipoVino, int lote, int anoElaboracion, String etapaActual, float temperaturaFermentacion, float tiempoCrianza, float tiempoMaceracion) {
        super(nombreVino, tipoVino, lote, anoElaboracion, etapaActual, temperaturaFermentacion, tiempoCrianza, tiempoMaceracion);
        //Asignación de los valores por defecto - a modificar
        this.listadoEtapas = new String[20];
    }
}
