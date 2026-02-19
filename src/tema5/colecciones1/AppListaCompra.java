package tema5.colecciones1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Thread.sleep;

public class AppListaCompra {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean seguir = true;

        Set<String> lista = new HashSet();
        Set<String> carrito = new HashSet();

        do {
            opcion = sc.nextInt();
            showMenu();

            switch(opcion) {
                case 1:
                    System.out.println("Apunta los productos en la lista (fin para terminar): ");
                    seguir = true;
                    while (seguir) {
                        String p = sc.next();
                        if (p.equals("fin")) {
                            seguir = false;
                        }
                        addProducto(p, lista);
                    }
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 2:
                    System.out.println("Añade los productos al carrito (fin para terminar): ");
                    seguir = true;
                    while (seguir) {
                        String p = sc.next();
                        if (p.equals("fin")) {
                            seguir = false;
                        }
                        addCarrito(p, lista,  carrito);
                    }
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 3:
                    showCarrito(carrito);
                    sleep(3000);
                    limpiarPantalla();
                    break;
                case 4:
                    showPendientes(lista, carrito);
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

    public static void showMenu() {
        System.out.println("¿Qué quieres hacer?: \n" +
                "1. Añadir productos a la lista.\n" +
                "2. Añadir producto al carro.\n" +
                "3. Ver el carrito.\n" +
                "4. Ver productos por añadir.\n" +
                "0. Salir.");
    }

    //1. añadir productos
    public static boolean addProducto(String producto, Set<String> lista) {
        boolean anyadido = false;
        if (lista.contains(producto)) {
            System.out.println("\nEl producto " + producto + " ya existe");
            anyadido = false;
            //return prodExists; //1
        }
        else{
            lista.add(producto);
            anyadido = true;
        }
         return anyadido;
    }

    //1. mostrar lista de productos
    public static void showLista(Set<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("\nNo hay productos en la lista.");
        } else {
            System.out.println("\n---LISTA DE LA COMPRA---");
            for (String producto : lista) {
                System.out.println("- " + producto);
            }
        }
    }

    //4. añadir al carrito
    public static void addCarrito(String producto,  Set<String> lista, Set<String> carrito) {
        if(lista.contains(producto)) {
            carrito.add(producto);
            System.out.println("\n" + producto + " añadido al carrito correctamente.");
        } else {
            System.out.println("\nEl producto '" + producto + "' no está en tu lista de la compra.");
            carrito.add(producto);
        }
    }

    //4. ver carrito
    public static void showCarrito(Set<String> carrito) {
        if (carrito.isEmpty()) {
            System.out.println("\nEl carrito está vacío.");
        } else {
            System.out.println("\n---CARRITO---");
            for (String producto : carrito) {
                System.out.println("- " + producto);}
        }
    }

    //4. ver productos en la lista que faltan en el carrito
    public static void showPendientes(Set<String> lista,  Set<String> carrito) {
        Set<String> pendientes = new HashSet(lista);
        pendientes.removeAll(carrito);

        if (pendientes.isEmpty()) {
            System.out.println("\nHas añadido toda tu lista al carrito.");
        } else {
            System.out.println("\n---PRODUCTOS PENDENTES---");
            for (String producto : pendientes) {
                System.out.println("- " + producto);
            }
        }
    }
}
