package Bodega.main;

import Bodega.bodega.Bodega;
import Bodega.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bodega VinoSabroso = new Bodega("Vino sabroso", "calle Manzana,Lujan de Cuyo","Pablo Vidal");
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("========== BIENVENIDO A VINO SABROSO ==========");
            System.out.println("1. Generar vinos");
            System.out.println("2. Borrar vinos");
            System.out.println("3. Cambiar de etapa");
            System.out.println("4. Consultar etapa");
            System.out.println("5. Consultar maridaje");
            System.out.println("6. Consultar información de vinos");
            System.out.println("7. Cerrar");
            System.out.println("===============================================");
            System.out.println(" ");
            System.out.println("Ingrese opción: ");

            option = scanner.nextInt();
            if (scanner.hasNextInt()) {
                switch (option) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("La opción ingresada no es correcta, intentelo nuevamente");
                        scanner.next();
                }
                }else {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                scanner.next();
            }
        } while (option > 7);
    }


}