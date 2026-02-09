package tema5;

import java.util.Scanner;
import static java.lang.Thread.sleep;

public class AppListaCompra {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcion;
        ListaCompra myList = new ListaCompra();

        do {
            System.out.println("¿Qué quieres hacer?: \n" +
                    "1. Añadir productos a la lista.\n" +
                    "2. Añadir producto al carro.\n" +
                    "3. Ver el carrito.\n" +
                    "4. Ver productos por añadir.\n" +
                    "0. Salir.");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Apunta los productos en la lista (fin para terminar): ");
                    while (true) {
                        String p = sc.next();
                        if (p.equals("fin")) {
                            break;
                        }
                        myList.addProducto(p);
                    }
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 2:
                    System.out.println("Añade los productos al carrito (fin para terminar): ");
                    while (true) {
                        String p = sc.next();
                        if (p.equals("fin")) {
                            break;
                        }
                        myList.addCarrito(p);
                    }
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 3:
                    myList.showCarrito();
                    sleep(3000);
                    limpiarPantalla();
                    break;
                case 4:
                    myList.showPendientes();
                    sleep(3000);
                    limpiarPantalla();
                    break;
                case 0:
                    limpiarPantalla();
                    System.out.println("Saliendo...");
                    sleep(1000);
                    limpiarPantalla();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    sleep(1000);
                    limpiarPantalla();
                    break;
            }
        } while(opcion != 0);

    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
