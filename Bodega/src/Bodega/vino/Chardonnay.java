package Bodega.vino;

public class Chardonnay extends Vino {
    private String[] listadoEtapas;
    private String caracteristicas;

    public Chardonnay(int lote, int añoElaboracion, String etapaActual, float temperaturaFermentacion, int tiempoCrianza, int tiempoMaceracion) {
        super("Chardonnay", "Blanco", lote, añoElaboracion);
        this.setEtapaActual(etapaActual); // Usamos el método heredado de Vino para establecer la etapa actual
        this.temperaturaFermentacion = temperaturaFermentacion;
        this.tiempoCrianza = tiempoCrianza;
        this.tiempoMaceracion = tiempoMaceracion;
        this.listadoEtapas = new String[]{"Etapa 1", "Etapa 2", "Etapa 3"}; // Ejemplo de listado de etapas
        this.caracteristicas = "Características específicas de Chardonnay";
    }

    public String[] getEtapasProceso() {
        return listadoEtapas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}