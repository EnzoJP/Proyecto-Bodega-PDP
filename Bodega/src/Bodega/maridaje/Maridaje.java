package Bodega.maridaje;
import java.util.Scanner;

public class Maridaje {
    private String[] comida;
    private String[] vinoPorTipo;
    private String[] vinoPorClase;

    public Maridaje() {
        // Inicializar los otros arreglos por defecto
        this.comida = new String[]{"Comida1", "Comida2", "Comida3"};
        this.vinoPorTipo = new String[]{"VinoTipo1", "VinoTipo2", "VinoTipo3"};
        this.vinoPorClase = new String[]{"VinoClase1", "VinoClase2", "VinoClase3"};
    }

    public void getMaridajeComida() {

    }

    public void getMaridajeVinoTipo() {

    }

    public void getMaridajeVinoClase() {

    }

    public void eleccion() {
        Scanner scanner = new Scanner(System.in);
        int eleccion;
        do {
            System.out.println("Menú de Maridajes");
            System.out.println("1) Comida");
            System.out.println("2) Sepa de uva");
            System.out.println("3) Tipo de vino");
            System.out.println("4) Salir");
            System.out.print("Selecciona una opción: ");
            eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1:
                    getMaridajeComida();
                    break;
                case 2:
                    getMaridajeVinoTipo();
                    break;
                case 3:
                    getMaridajeVinoClase();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (eleccion !=4 );
        scanner.close();

    }
}
