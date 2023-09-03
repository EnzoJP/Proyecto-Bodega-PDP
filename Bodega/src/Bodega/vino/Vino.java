package Bodega.vino;

public abstract class Vino {
    protected String nombreDeVino;
    protected String tipoDeVino;
    protected int lote;
    protected int añoElaboracion;
    protected String etapaActual;
    protected float temperaturaFermentacion;
    protected int tiempoCrianza;
    protected int tiempoMaceracion;

    public Vino(String nombreDeVino, String tipoDeVino, int lote, int añoElaboracion) {
        this.nombreDeVino = nombreDeVino;
        this.tipoDeVino = tipoDeVino;
        this.lote = lote;
        this.añoElaboracion = añoElaboracion;
        this.etapaActual = "En proceso"; // Valor predeterminado
    }

    public String getNombreVino() {
        return nombreDeVino;
    }

    public String getTipoVino() {
        return tipoDeVino;
    }

    public int getLote() {
        return lote;
    }

    public int getAñoElaboracion() {
        return añoElaboracion;
    }

    public String getEtapaActual() {
        return etapaActual;
    }

    public float getTemperaturaFermentacion() {
        return temperaturaFermentacion;
    }

    public int getTiempoCrianza() {
        return tiempoCrianza;
    }

    public int getTiempoMaceracion() {
        return tiempoMaceracion;
    }

    public void setEtapaActual(String etapaActual) {
        this.etapaActual = etapaActual;
    }

}
