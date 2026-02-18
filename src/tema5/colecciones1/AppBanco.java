package tema5.colecciones1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AppBanco {
    public static void main(String[] args) throws InterruptedException {
        List<BankUser> cola = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---COLA DEL BANCO---");
            System.out.println("¿Qué operación quiere realizar?\n" +
                    "1. Añadir usuario al final de la cola.\n" +
                    "2. Eliminar usuario atendido del principio de la cola.\n" +
                    "3 .Eliminar usuario que abandona su posición en la cola.\n" +
                    "4. Ver cola.\n" +
                    "0. Salir.");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    addUser(cola);
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 2:
                    assistUser(cola);
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 3:
                    removeUser(cola);
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 4:
                    showCola(cola);
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 0:
                    limpiarPantalla();
                    System.out.println("Saliendo...");
                    sleep(1000);
                    limpiarPantalla();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
                    sleep(1000);
                    limpiarPantalla();
                    break;
            }
        } while (opcion != 0);
    }

    //añadir usuario al final de la cola
    public static void addUser(List<BankUser> cola) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--NUEVO USUARIO--");
        System.out.println("Ingrese el nombre del usuario:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el edad del usuario:");
        int edad = sc.nextInt();
        System.out.println("Ingrese el DNI del usuario:");
        String dni = sc.nextLine();
        sc.nextLine();

        cola.add(new BankUser(nombre, edad, dni));
        System.out.println(nombre + " se ha unido a la cola.");
    }

    //atender(eliminar) al primer usuario de la cola
    public static void assistUser(List<BankUser> cola) {
        if (!cola.isEmpty()) {
            System.out.println("\n---USUARIO ATENDIDO---");
            BankUser atendido = cola.remove(0);
            System.out.println(atendido.getNombre() + " ha sido atendido.");
        } else {
            System.out.println("La cola ha terminado.");
        }
    }

    //un usuario abandona la cola
    public static void removeUser(List<BankUser> cola) {
        if (cola.isEmpty()) {
            System.out.println("La cola ha terminado.");
        }

        System.out.println("\n---USUARIO ABANDONA LA COLA---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posicion de la persona que abandona la cola (1 - " + cola.size() + ": ");
        int pos = sc.nextInt() - 1;
        if (pos >= 0 && pos < cola.size()) {
            BankUser abandona = cola.remove(pos);
            System.out.println(abandona.getNombre() + " ha abandonado la cola.");
        } else {
            System.out.println("Posicion inválida.");
        }
    }

    public static void showCola(List<BankUser> cola) {
        if (cola.isEmpty()) {
            System.out.println("La cola ha terminado.");
        } else {
            System.out.println("\n---VISTA DE LA COLA---");

            for (int i = 0; i < cola.size(); i++) {
                System.out.println((i+1) + ". " + cola.get(i).getNombre());
            }
        }
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
