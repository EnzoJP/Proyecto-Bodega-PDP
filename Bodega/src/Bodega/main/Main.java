package Bodega.main;
import Bodega.bodega.Bodega;
import Bodega.vino.Vino;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase que contendra la estructura basica del programa y unira ciertas partes mediante diferentes menus
 * @version 1.0.0
 * @author Enzo Palau, Tomas Rando, Julian Montano
 * @since 11
 */
public class Main {

    public static void main(String[] args) {
        Bodega bodega = new Bodega("Vino Sabroso", "Calle Manzana, Lujan de Cuyo","Pablo Vidal");
        menuPrincipal(bodega);

    }

    /**
     * Metodo donde se realizara toda la ejecucion del programa. Es un menu que llama a bodega dependiendo de la opcion elegida
     * @param bodega Recibe el objeto bodega, se utilizara para llamar a los distintos metodos dependiendo de la opcion
     */
    public static void menuPrincipal(Bodega bodega) {
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);
        int option;
        int lote;
        int vinos;
        while (!stop) {

            String optionSt;

            System.out.println("========== BIENVENIDO A VINO SABROSO ==========");
            System.out.println("1. Generar vinos");
            System.out.println("2. Borrar vinos");
            System.out.println("3. Cambiar de etapa");
            System.out.println("4. Consultar etapa");
            System.out.println("5. Consultar maridaje");
            System.out.println("6. Consultar información de vinos");
            System.out.println("7. Mostrar lista de vinos existentes");
            System.out.println("8. Mostrar información de la bodega");
            System.out.println("9. Cerrar programa");
            System.out.println("===============================================");
            System.out.println(" ");
            do {
                System.out.println("Ingrese opción: ");

                try {
                    option = scanner.nextInt();
                    scanner.nextLine();
                    if (option == 1) {
                        System.out.println("Seleccione el vino que desea generar: ");
                        optionSt = menuVinos();
                        System.out.println(" ");
                        lote = inputLote();
                        System.out.println(" ");
                        bodega.instanciarVino(optionSt, lote);
                    } else if (option == 2) {
                        System.out.println("Seleccione el vino que desea borrar: ");
                        vinos = seleccionarVinoMenu(bodega);
                        if (vinos == -1) {
                            System.out.println("No hay vinos instanciados");
                        } else {
                            bodega.borrarVino(vinos);
                        }
                    } else if (option == 3) {
                        System.out.println("Seleccione el vino que cambiará de etapa: ");
                        vinos = seleccionarVinoMenu(bodega);
                        if (vinos == -1) {
                            System.out.println("No hay vinos instanciados");
                        } else {
                            bodega.cambiarDeEtapa(vinos);
                        }
                    } else if (option == 4) {
                        System.out.println("Seleccione el vino del cual desea saber la etapa: ");
                        vinos = seleccionarVinoMenu(bodega);
                        if (vinos == -1) {
                            System.out.println("No hay vinos instanciados");
                        } else {
                            bodega.consultarEtapa(vinos);
                        }
                    } else if (option == 5) {
                        System.out.println("Seleccione el vino del cual desea saber el maridaje: ");
                        vinos = seleccionarVinoMenu(bodega);
                        if (vinos == -1) {
                            System.out.println("No hay vinos instanciados");
                        } else {
                            bodega.consultarMaridaje(vinos);
                        }
                    } else if (option == 6) {
                        System.out.println("Seleccione el vino del cual desea consultar la información: ");
                        vinos = seleccionarVinoMenu(bodega);
                        if (vinos == -1) {
                            System.out.println("No hay vinos instanciados");
                        } else {
                            bodega.consultarCaracteristicas(vinos);
                        }
                    } else if (option == 7) {
                        System.out.println("Mostrando la lista de vinos existentes");
                        bodega.mostrarVinos();
                    } else if (option == 8){
                        System.out.println("El nombre de la bodega es: " + bodega.getNombreDeBodega() + ".");
                        System.out.println("La bodega está ubicada en: " + bodega.getDireccionDeBodega() + ".");
                        System.out.println("El director actual es: " + bodega.getDirectorDeBodega() + ".");
                        System.out.println(" ");
                    } else if (option == 9) {
                        System.out.println("Gracias por utilizar el programa.");
                        stop = true;
                    } else {
                        System.out.println("La entrada ingresada no corresponde a una opción. Intente nuevamente");
                    }
                } catch (InputMismatchException e1) {
                    scanner.nextLine();
                    System.out.println("Entrada no válida. Por favor, ingrese un número válido.");

                    option = 10;
                }
            } while ((option > 9) || (option < 1));
        }

    }

    /**
     * Metodo con el menu de los vinos de la bodega. Se encarga de mostrar los vinos y pedir la seleccion de un vino
     * @return El String con el vino elegido
     */
    public static String menuVinos() {
        int option, option2;
        System.out.println("=========== Ingrese el tipo de vino: ===========");
        System.out.println("1. Tintos");
        System.out.println("2. Blancos");
        System.out.println("3. Rosados");
        System.out.println("4. Cavas");
        System.out.println("5. Blends");
        System.out.println("===============================================");
        option = inputInt(1, 5);

        System.out.println(" ");
        if (option == 1) {
            System.out.println("1. Merlot");
            System.out.println("2. Malbec");
            System.out.println("3. Cabernet Sauvignon");
            System.out.println("4. Syrah");
            option2 = inputInt(1, 4);
        } else if (option == 2) {
            System.out.println("1. Chardonnay");
            System.out.println("2. Semillon");
            System.out.println("3. Viognier");
            System.out.println("4. Sauvignon Blanc");
            option2 = inputInt(1, 4);
        } else if (option == 3) {
            System.out.println("1. Malbec Rose");
            System.out.println("2. Cabernet Sauvignon Rose");
            System.out.println("3. Syrah Rose");
            System.out.println("4. Merlot Rose");
            option2 = inputInt(1, 4);
        } else if (option == 4) {
            System.out.println("1. Cava Gran Reserva");
            System.out.println("2. Cava joven ");
            System.out.println("3. Cava Reserva");
            option2 = inputInt(1, 3);
        } else {
            System.out.println("1. Amansado Blend");
            System.out.println("2. Vino Sabroso Blend");
            option2 = inputInt(1, 2);
        }

        if (option == 1) {
            if (option2 == 1) {
                return "Merlot";
            } else if (option2 == 2) {
                return "Malbec";
            } else if (option2 == 3) {
                return "CabernetSauvignon";
            } else {
                return "Syrah";
            }
        } else if (option == 2) {
            if (option2 == 1) {
                return "Chardonnay";
            } else if (option2 == 2) {
                return "Semillon";
            } else if (option2 == 3) {
                return "Viognier";
            } else {
                return "SauvignonBlanc";
            }
        } else if (option == 3) {
            if (option2 == 1) {
                return "MalbecRose";
            } else if (option2 == 2) {
                return "CabernetSauvignonRose";
            } else if (option2 == 3) {
                return "SyrahRose";
            } else {
                return "MerlotRose";
            }
        } else if (option == 4) {
            if (option2 == 1) {
                return "CavaGranReserva";
            } else if (option2 == 2) {
                return "CavaJoven";
            } else {
                return "CavaReserva";
            }
        } else {
            if (option2 == 1) {
                return "BlendAmansado";
            } else {
                return "BlendVinoSabroso";
            }
        }
    }

    /**
     * Metodo para pedir un entero por pantalla de un dato que tenga un minimo y un maximo
     * @param min El valor minimo que puede tomar el dato solicitado
     * @param max El valor maximo que puede tomar el dato solicitado
     * @return El entero ingresado por pantalla
     */
    public static int inputInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            try {
                System.out.println("Ingrese opción: ");
                option = scanner.nextInt();
                if (option < min || option > max) {
                    System.out.println("La opción ingresada no está dentro de la lista de opciones. Intente nuevamente");
                }
            } catch (InputMismatchException e1) {
                System.out.println("La opción ingresada no es válida. Intente nuevamente");
                scanner.nextLine();
                option = max + 1;
            }
        } while (option < min || option > max);
        scanner.nextLine();
        return option;
    }

    /**
     * Metodo para pedir el ingreso por pantalla del numero de lote
     * @return El entero con el lote ingresado por pantalla
     */
    public static int inputLote() {
        Scanner scanner = new Scanner(System.in);
        int lote;
        int min = 0;
        do {
            try {
                System.out.println("Ingrese lote: ");
                lote = scanner.nextInt();
                if (lote < min) {
                    System.out.println("El lote no puede ser negativo. Intente nuevamente");
                }
            } catch (InputMismatchException e1) {
                System.out.println("El lote ingresado no es válido. Intente nuevamente");
                scanner.nextLine();
                lote = -5;
            }
        } while (lote < min);
        scanner.nextLine();
        return lote;
    }

    /**
     * Metodo que se encarga de llamar al metodo de bodega encargado de imprimir los vinos y pedir el indice del vino por teclado
     * @param bodega Objeto bodega, sera necesario para utilizarlo para llamar al metodo de imprimirVinos
     * @return El entero con el indice del vino elegido
     */
    public static int seleccionarVinoMenu(Bodega bodega) {
        int vinoOption;
        vinoOption = bodega.imprimirVinos();
        return vinoOption;
    }
}