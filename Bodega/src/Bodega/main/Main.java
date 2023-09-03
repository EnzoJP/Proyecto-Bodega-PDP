package Bodega.main;

import Bodega.bodega.Bodega;
import Bodega.control.Control;
import Bodega.vino.Vino;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bodega VinoSabroso = new Bodega("Vino sabroso", "calle Manzana,Lujan de Cuyo","Pablo Vidal");
        ArrayList<Vino> inventarioVinos = new ArrayList<>();
        Control controlDeBodega= new Control(inventarioVinos ,0, 2023);
    }


}