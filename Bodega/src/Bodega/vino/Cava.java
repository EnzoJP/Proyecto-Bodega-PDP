package Bodega.vino;
/**
 * Clase que engloba a los vinos Cava. Es abstracta y tiene como atributo importante el array de String con las etapas
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau, Julian Montano
 * @see Bodega.vino.Vino
 */
public abstract class Cava extends Vino {
    //Array de string con el listado de etapas de los vinos Cava
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
     * @param temperaturaFermentacion Es la temperatura a la que se fermenta el vino. Medido en C. Es float
     * @param tiempoCrianza Es el tiempo de crianza que tendra el vino. Medido en meses. Es float
     * @param tiempoMaceracion Es el tiempo de maceracion que tendra el vino. Medido en meses. Es float
     * @param maridaje Es el String con el maridaje del vino instanciado
     */
    public Cava(String nombreVino, String tipoVino, int lote, int anoElaboracion, float temperaturaFermentacion, float tiempoCrianza, float tiempoMaceracion, String maridaje) {
        super(nombreVino, tipoVino, lote, anoElaboracion, temperaturaFermentacion, tiempoCrianza, tiempoMaceracion, maridaje);
        //Asignación de los valores por defecto - a modificar
        //19
        this.listadoEtapas = new String[]{"Recoleccion", "Transporte", "Reparticion", "Despalillado", "Desfangado", "TrasladoSolidos", "Maceracion", "FermentacionAlcoholica", "FermentacionVirgen", "LicorDeTiraje", "Removido", "Deguelle", "LicorDeExpedicion", "Trasiego", "Clarificacion", "Estabilizacion", "Crianza", "Embotellado", "Venta"};
    }

}
