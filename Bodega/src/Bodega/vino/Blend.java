package Bodega.vino;
/**
 * Clase que engloba a los vinos Blend. Es abstracta y tiene como atributo importante el array de String con las etapas
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau, Julian Montano
 */
public abstract class Blend extends Vino{
    //Array de string con el listado de etapas de los vinos Blancos
    /**
     * Es el array de String con las etapas del tipo de vino
     */
    protected String[] listadoEtapas;

    /**
     * Es el constructor de la clase
     * @param tipoVino Es el primer tipo de vino de la mezcla (Tinto, Blanco, Rosado o Cava) como String
     * @param tipoVino2 Es el segundo tipo de vino de la mezcla (Tinto, Blanco, Rosado o Cava) como String.
     * @param lote Es el numero identificador del vino. Es entero
     * @param anoElaboracion Es el anio en el que es ingresado al sistema. Es entero
     * @param etapaActual Es la etapa en la que se encuentra al momento de ser ingresado. Es String
     * @param temperaturaFermentacion Es la temperatura a la que se fermenta el vino. Medido en C. Es float
     * @param tiempoCrianza Es el tiempo de crianza que tendra el vino. Medido en meses. Es float
     * @param tiempoMaceracion Es el tiempo de maceracion que tendra el vino. Medido en meses. Es float
     */
    //Constructor
    public Blend(String tipoVino, String tipoVino2, int lote, int anoElaboracion, String etapaActual, float temperaturaFermentacion, float tiempoCrianza, float tiempoMaceracion) {
        super(tipoVino + "+" + tipoVino2, "Blend", lote, anoElaboracion, etapaActual, temperaturaFermentacion, tiempoCrianza, tiempoMaceracion);

        //Asignación de los valores por defecto - a modificar
        this.listadoEtapas = new String[20];
    }

}
