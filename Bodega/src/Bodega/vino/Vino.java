package Bodega.vino;

public abstract class Vino {
    //Declaración de variables
    protected String nombreDeVino; //Nombre de vino se refiere a la "categoría", es decir Malbec, Sauvignon, etc
    protected String tipoDeVino; // Referida al tipo (tinto, blanco, cava o rosa)
    protected int lote;
    protected int anoElaboracion; //Año en el que es insertado en el sistema
    protected String etapaActual; //Etapa en la que se encuentra

    protected float temperaturaFermentacion;

    protected int tiempoCrianza;

    protected int tiempoMaceracion;

    //Constructor
    public Vino(String nombreDeVino, String tipoDeVino, int lote, int anoElaboracion, String etapaActual, float temperaturaFermentacion, int tiempoCrianza, int tiempoMaceracion) {
        this.nombreDeVino = nombreDeVino;
        this.tipoDeVino = tipoDeVino;
        this.lote = lote;
        this.anoElaboracion = anoElaboracion;
        this.etapaActual = etapaActual;
        this.temperaturaFermentacion = temperaturaFermentacion;
        this.tiempoCrianza = tiempoCrianza;
        this.tiempoMaceracion = tiempoMaceracion;
    }

    //Getters
    //Retorna el nombre del vino
    public String getNombreDeVino() {return nombreDeVino;}
    //Retorna el tipo de vino
    public String getTipoDeVino() {return tipoDeVino;}
    //Retorna la etapa actual
    public String getEtapaActual() {return etapaActual;}
    //Retorna el lote
    public int getLote() {return lote;}
    //Retorna el año de elaboración
    public int getAnoElaboracion() {return anoElaboracion;}
    //Retorna el tiempo de maceración
    public int getTiempoMaceracion() {return tiempoMaceracion;}
    //Retorna el tiempo de crianza necesario
    public int getTiempoCrianza() {return tiempoCrianza;}
    //Retorna la temperatura de la fermentación
    public float getTemperaturaFermentacion() {return temperaturaFermentacion;}

    //Setters
    public void setEtapa(String newEtapa) {etapaActual = newEtapa;}

    //Servicios
    public abstract void mostrarEtapas(); //Muestra todas las etapas por las que tiene que pasar el vino. Varía entre todos.

}