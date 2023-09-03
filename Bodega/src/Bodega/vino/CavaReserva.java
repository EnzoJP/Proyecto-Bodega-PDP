package Bodega.vino;

public class CavaReserva extends Vino{
    //Atributos
    //Array con el listado de etapas por las que pasará
    private String[] listadoEtapas;
    //String con las características del vino
    private String caracteristicas;

    //Constructor
    public CavaReserva(int lote, int anoElaboracion, String etapaActual) {
        super("Cava Reserva", "Cava", lote, anoElaboracion, etapaActual, 0, 0, 0);
        /* Características y etapas a modificar
        Hay que cambiarlas cuando llenemos con información correcta. En el super los valores 0.0, 0, 0 también.
        Están por defecto para que quede la estructura pero después hay que modificarlos con la información que busquemos
         */
        this.caracteristicas = "-";
        this.listadoEtapas = new String[20];
    }

    //Muestra el listado de etapas del presente vino
    public void mostrarEtapas() {
        System.out.println("========== LISTADO DE ETAPAS ==========");
        for (int i = 0; i < listadoEtapas.length; i++) {
            System.out.println(i + ". " + listadoEtapas[i]);
            System.out.print(" ");
        }
        System.out.println("========================================");
    }

    //Retorna la etapa que se encuentra en la posición i pasada como parámetro
    public String getEtapa(int i) {
        return listadoEtapas[i];
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
}
