package Bodega.control;
import Bodega.vino.Vino;
import java.util.ArrayList;

public class Control {
    private ArrayList<Vino> inventarioVinos;
    private int cantVinosContador;
    private int añoActual;

    public Control(ArrayList<Vino> inventarioVinos, int cantVinosContador, int añoActual) {
        this.inventarioVinos = inventarioVinos;
        this.cantVinosContador = cantVinosContador;
        this.añoActual = añoActual;
    }

    public ArrayList<Vino> getInventarioVinos() {
        return inventarioVinos;
    }

    public void setInventarioVinos(ArrayList<Vino> inventarioVinos) {
        this.inventarioVinos = inventarioVinos;
    }

    public int getCantVinosContador() {
        return cantVinosContador;
    }

    public void setCantVinosContador(int cantVinosContador) {
        this.cantVinosContador = cantVinosContador;
    }

    public int getAñoActual() {
        return añoActual;
    }

    public void setAñoActual(int añoActual) {
        this.añoActual = añoActual;
    }

    public void imprimirVinos(){
    }
}