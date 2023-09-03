package Bodega.maridaje;

public class Maridaje {
    private String comida;
    private String vinoPorTipo;
    private String vinoPorClase;

    public Maridaje(String comida, String vinoPorTipo, String vinoPorClase) {
        this.comida = comida;
        this.vinoPorTipo = vinoPorTipo;
        this.vinoPorClase = vinoPorClase;
    }

    public String getMaridajeComida() {
        return comida;
    }

    public String getMaridajeVinoPorTipo() {
        return vinoPorTipo;
    }

    public String getMaridajeVinoPorClase() {
        return vinoPorClase;
    }

    }
