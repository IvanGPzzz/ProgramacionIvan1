package tema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AppGym {


    public static void main(String[] args) throws InterruptedException {
        Map<String, GymUser> users= new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        String nombre = "";
        int edad = 0;
        String dni = "";
        String nombre2 = "";
        int edad2 = 0;

        do {
            System.out.println("¿Qué quieres hacer?: \n" +
                    "1. Dar de alta a un usuario.\n" +
                    "2. Dar de baja a un usuario.\n" +
                    "3. Ver datos de un usuario.\n" +
                    "4. Modificar un usuario.\n" +
                    "0. Salir.");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    alta(dni, nombre, edad, users);
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 2:
                    baja(dni, users);
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 3:
                    showUser(dni, users);
                    sleep(3000);
                    limpiarPantalla();
                    break;
                case 4:
                    modUser(dni,nombre2,edad2, users);
                    sleep(1000);
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

    // dar de alta
    public static void alta(String dni, String nombre, int edad, Map<String, GymUser> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dni del usuario:");
        dni = sc.nextLine();

        if (users.containsKey(dni)) {
            System.out.println("El usuario ya existe");
        } else  {
            System.out.println("Ingresa el nombre del usuario:");
            nombre = sc.nextLine();
            System.out.println("Ingresa la edad del usuario:");
            edad = sc.nextInt();

            users.put(dni, new GymUser(nombre, edad));
            System.out.println("Usuario inscrito correctamente");
        }
    }

    //dar de baja
    public static void baja(String dni, Map<String, GymUser> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el DNI del usuario a ELIMINAR:");
        dni = sc.nextLine();;

        if (users.containsKey(dni)) {
            System.out.println("¿Seguro que quieres ELIMINAR al usuario (s/n)?");
            String confirmacion = sc.nextLine();
            if (confirmacion.equals("s")) {
                users.remove(dni);
                System.out.println("Usuario eliminado correctamente.");
            } else {
                System.out.println("Usuario no eliminado.");
            }
        } else  {
            System.out.println("Usuario no encontrado.");
        }

    }

    // mostrar usuario
    public static void showUser(String dni, Map<String, GymUser> users){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el DNI del usuario que quiere ver:");
        dni = sc.nextLine();
        GymUser u = users.get(dni);
        if (u != null) {
            System.out.println(u + "\nDNI: " + dni);
        } else  {
            System.out.println("Usuario no encontrado.");
        }
    }

    // modificar usuario
    public static void modUser(String dni, String nombre, int edad, Map<String, GymUser> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el DNI del usuario que quiere modificar: ");
        dni = sc.nextLine();
        if (users.containsKey(dni)) {
            System.out.println("Nuevo nombre: ");
            nombre = sc.nextLine();
            System.out.println("Nueva edad: ");
            edad = sc.nextInt();
            users.put(dni, new GymUser(nombre, edad));
            System.out.println("Usuario modificado correctamente.");
        } else   {
            System.out.println("Usuario no encontrado.");
        }

    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
