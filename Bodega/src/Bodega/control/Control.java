package Bodega.control;
import Bodega.vino.Vino;
import java.util.ArrayList;

public class Control {
    private ArrayList<Vino> inventarioVinos;
    private int cantVinosContador;
    private int anoActual;

    public Control(int anoActual) {
        inventarioVinos = new ArrayList<>();
        this.cantVinosContador = 0;
        this.anoActual = anoActual;
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

    public int getAnoActual() {
        return anoActual;
    }

    public void setAnoActual(int anoActual) {
        this.anoActual = anoActual;
    }

    public void imprimirVinos(){
    }



}