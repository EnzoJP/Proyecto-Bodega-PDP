package Bodega.vino;
import Bodega.maridaje.Maridaje;
/**
 * La clase vino es la clase abstracta usada para modelar los vinos en general. Es un contenedor de los atributos que se usaran en las clases que
 * la hereden.
 * @version 1.0.0
 * @author Tomas Rando, Enzo Palau y Julian Montano
 * @since 11
 */

public abstract class Vino implements Prints{
    //Declaración de variables
    /**
     * El nombre del vino, es decir, Malbec, Sauvignon, etc
     */
    protected String nombreDeVino; //Nombre de vino se refiere a la "categoria", es decir Malbec, Sauvignon, etc
    /**
     * El tipo de vino, es decir, tinto, blanco, cava o rosado
     */
    protected String tipoDeVino; // Referida al tipo (tinto, blanco, cava o rosado)
    /**
     * El lote es el numero identificador del vino en cuestion. Sera un entero
     */
    protected int lote;
    /**
     * El anio en el que se inserta en el sistema el vino. Sera un entero
     */
    protected int anoElaboracion; //Anio en el que es insertado en el sistema
    /**
     * Etapa en la que se encuentra el vino actualmente. Sera un string
     */
    protected Etapas etapaActual; //Etapa en la que se encuentra

    /**
     * Es la temperatura a la que se fermenta el vino. Medida en C y es un float.
     */
    protected float temperaturaFermentacion;

    /**
     * El tiempo en meses que demora la crianza del vino. Se toma como float
     */
    protected float tiempoCrianza;

    /**
     * El tiempo que demora la maceracion del vino en dias. Se toma como float
     */
    protected float tiempoMaceracion;
    protected Maridaje maridaje;
    //Constructor
    /**
     * Este metodo es el constructor de la clase Vino.
     * @param nombreDeVino Es el nombre del vino como String, es decir, Malbec, Merlot, entre otros.
     * @param tipoDeVino Es el tipo de vino (Tinto, Blanco, Rosado o Cava) como String.
     * @param lote Es el numero identificador del vino. Es entero
     * @param anoElaboracion Es el anio en el que es ingresado al sistema. Es entero
     * @param temperaturaFermentacion Es la temperatura a la que se fermenta el vino. Medido en C. Es float
     * @param tiempoCrianza Es el tiempo de crianza que tendra el vino. Medido en meses. Es float
     * @param tiempoMaceracion Es el tiempo de maceracion que tendra el vino. Medido en meses. Es float
     */
    public Vino(String nombreDeVino, String tipoDeVino, int lote, int anoElaboracion, float temperaturaFermentacion, float tiempoCrianza, float tiempoMaceracion, String maridaje) {
        this.nombreDeVino = nombreDeVino;
        this.tipoDeVino = tipoDeVino;
        this.lote = lote;
        this.anoElaboracion = anoElaboracion;
        this.etapaActual = Etapas.Recoleccion ;
        this.temperaturaFermentacion = temperaturaFermentacion;
        this.tiempoCrianza = tiempoCrianza;
        this.tiempoMaceracion = tiempoMaceracion;
        this.maridaje = new Maridaje(maridaje);
    }

    //Getters
    //Retorna el nombre del vino

    /**
     * Devuelve el nombre del vino
     * @return Nombre del vino como String
     */
    public String getNombreDeVino() {return nombreDeVino;}
    //Retorna el tipo de vino
    /**
     * Devuelve el tipo del vino
     * @return Tipo del vino como String
     */
    public String getTipoDeVino() {return tipoDeVino;}
    //Retorna la etapa actual
    /**
     * Devuelve la etapa actual del vino
     * @return Etapa actual del vino como String
     */
    public String getEtapaActual() {return etapaActual.toString();}
    //Retorna el lote
    /**
     * Devuelve el numero del lote del vino
     * @return Numero de lote del vino como entero
     */
    public int getLote() {return lote;}
    //Retorna el anio de elaboración
    /**
     * Retorna el anio de insercion del vino en el sistema
     * @return Anio de inserción del vino al sistema como entero
     */
    public int getAnoElaboracion() {return anoElaboracion;}
    //Retorna el tiempo de maceración
    /**
     * Devuelve el tiempo de maceracion del vino
     * @return Tiempo de maceracion del vino en meses
     */
    public float getTiempoMaceracion() {return tiempoMaceracion;}
    //Retorna el tiempo de crianza necesario
    /**
     * Devuelve el tiempo de crianza del vino
     * @return Tiempo de crianza del vino en meses
     */
    public float getTiempoCrianza() {return tiempoCrianza;}
    //Retorna la temperatura de la fermentacion
    /**
     * Devuelve la temperatura de fermentacion del vino
     * @return Temperatura de fermentacion del vino en C
     */
    public float getTemperaturaFermentacion() {return temperaturaFermentacion;}

    //Setters
    /**
     * Cambia la etapa actual del vino por la del parametro usando el enumerator Etapas
     * @param newEtapa Nueva etapa del vino como String
     */
    public void setEtapa(String newEtapa) {
        Etapas s = Etapas.Recoleccion;

        if (newEtapa.equals("Transporte")) {
            s = Etapas.Transporte;
        }
        if (newEtapa.equals("Reparticion")) {
            s = Etapas.Reparticion;
        }
        if (newEtapa.equals("Despalillado")) {
            s = Etapas.Despalillado;
        }
        if (newEtapa.equals("Estrujado")) {
            s = Etapas.Estrujado;
        }
        if (newEtapa.equals("Remontado")) {
            s = Etapas.Remontado;
        }
        if (newEtapa.equals("TrasladoSolidos")) {
            s = Etapas.TrasladoSolidos;
        }
        if (newEtapa.equals("Maceracion")) {
            s = Etapas.Maceracion;
        }
        if (newEtapa.equals("FermentacionAlcoholica")) {
            s = Etapas.FermentacionAlcoholica;
        }
        if (newEtapa.equals("Prensado")) {
            s = Etapas.Prensado;
        }
        if (newEtapa.equals("FermentacionMalolactica")) {
            s = Etapas.FermentacionMalolactica;
        }
        if (newEtapa.equals("FermentacionVirgen")) {
            s = Etapas.FermentacionVirgen;
        }
        if (newEtapa.equals("Trasiego")) {
            s = Etapas.Trasiego;
        }
        if (newEtapa.equals("Clarificacion")) {
            s = Etapas.Clarificacion;
        }
        if (newEtapa.equals("Filtracion")) {
            s = Etapas.Filtracion;
        }
        if (newEtapa.equals("Crianza")) {
            s = Etapas.Crianza;
        }
        if (newEtapa.equals("Embotellado")) {
            s = Etapas.Embotellado;
        }
        if (newEtapa.equals("Venta")) {
            s = Etapas.Venta;
        }
        if (newEtapa.equals("LicorDeTiraje")) {
            s = Etapas.LicorDeTiraje;
        }
        if (newEtapa.equals("Removido")) {
            s = Etapas.Removido;
        }
        if (newEtapa.equals("Deguelle")) {
            s = Etapas.Deguelle;
        }
        if (newEtapa.equals("LicorDeExpedicion")) {
            s = Etapas.LicorDeExpedicion;
        }
        if (newEtapa.equals("Desfangado")) {
            s = Etapas.Desfangado;
        }
        if (newEtapa.equals("Estabilizacion")) {
            s = Etapas.Estabilizacion;
        }
        if (newEtapa.equals("Mezcla")) {
            s = Etapas.Mezcla;
        }
        etapaActual = s;
        }

    //Servicios

    /**
     * Muestra las etapas de los vinos
     */
    public abstract void mostrarEtapas(); //Muestra todas las etapas por las que tiene que pasar el vino. Varia entre todos.

    /**
     * Se le pasa un indice como parametro y devuelve la etapa correspondiente al indice
     */
    public abstract String getEtapa(int i);

    public String getMaridaje() {return maridaje.getMaridaje();};
}
