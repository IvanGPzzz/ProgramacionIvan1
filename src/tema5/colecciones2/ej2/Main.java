package tema5.colecciones2.ej2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Acortador acortador = new Acortador();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            showMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    acortarURL(acortador, sc);
                    break;
                case 2:
                    buscarURL(acortador, sc);
                    break;
                case 3:
                    borrarURL(acortador, sc);
                    break;
                case 4:
                    acortador.mostrar();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");

            }
        } while (opcion != 0);


    }

    public static void showMenu() {
        System.out.println("---GESTOR DE URLs---");
        System.out.println("1. Acortar URL.");
        System.out.println("2. Buscar URL.");
        System.out.println("3. Borrar URL.");
        System.out.println("4. Ver lista de URLs.");
        System.out.println("5. Salir.");
        System.out.println("0. Selecciona una opción:");
    }

    public static void acortarURL(Acortador acortador, Scanner sc) {
        System.out.println("Introduce la URL:");
        String url = sc.nextLine();
        String clave = acortador.addRegistro(url);
        System.out.println("URL acortada: https://" + clave);
    }

    private static void buscarURL(Acortador acortador, Scanner sc) {
        System.out.println("Introduce la clave:");
        String clave = sc.nextLine();
        String resultado = acortador.buscarUrl(clave);
        System.out.println("URL: " + resultado);
    }

    private static void borrarURL(Acortador acortador, Scanner sc) {
        System.out.println("Introduce la clave:");
        String clave = sc.nextLine();
        boolean borrado = acortador.borrarUrl(clave);
        if (borrado) {
            System.out.println("URL borrado!");
        } else {
            System.out.println("URL nulo!");
        }
    }

}
