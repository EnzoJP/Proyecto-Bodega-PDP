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

    /*
    public consultarCaracteristicas(){
        
        return ;
    }
    */

    //Es el cambio individualmente
    public Vino cambiarDeEtapa(Vino vino, String[] listEtapaTipo){
        for(int i=0; i<listEtapaTipo.length; i++){
            if (vino.getEtapaActual()==listEtapaTipo[i]){
                vino.setEtapa(listEtapaTipo[i++]);
                return vino;
            }
        }
        return vino;
    }

    public void aumentoContador(){ 
        this.cantVinosContador++;
    }

    //Se ingresa el vino a eliminar
    public void borrarVino(Vino deleted){
        ArrayList<Vino> vino=this.inventarioVinos;
        for (int i=0; i<vino.size(); i++){
            if (vino.get(i).getLote()==deleted.getLote()){
                vino.remove(i);
                this.cantVinosContador--;
                break;
            }
        }
    }

    //Se ingresa el vino ya instanciado
    public void agregarVino(Vino newVino){
        this.inventarioVinos.add(newVino);
        //aumentoContador();
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

    
    public String consultarEtapa(Vino vino){
        return vino.getEtapaActual();
    }

    public void imprimirVinos() {
        ArrayList<Vino> vinos=this.inventarioVinos;
        for(Vino vino : vinos){
            System.out.println("Nombre: "+vino.getNombreDeVino());
            System.out.println("Tipo de vino: "+vino.getTipoDeVino());
            System.out.println("Lote: "+vino.getLote());
            System.out.println("Año de la Elaboración: "+vino.getAnoElaboracion());
            System.out.println("Etapa Actual: "+vino.getEtapaActual());
            System.out.println("=================================================");
            System.out.println("");
        }
    }


    public void avanzarAno(){
        this.anoActual++;
    }



}