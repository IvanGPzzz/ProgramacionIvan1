package tema5.colecciones2.ej1Parque;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParqueNatural parque = new ParqueNatural();
        int opcion;
        int opcion2;
        Scanner sc = new Scanner(System.in);
        showMenu();
        opcion = sc.nextInt();

        do {
            switch (opcion) {
                case 1:
                    showMenu();
                    opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            addSerpiente(parque, sc);
                            sleep(1000);
                            limpiarPantalla();
                            break;
                        case 2:
                            addPajaro(parque, sc);
                            sleep(1000);
                            limpiarPantalla();
                            break;
                        case 3:
                            addManadas(parque, sc);
                            sleep(1000);
                            limpiarPantalla();
                            break;
                        default:
                            System.out.println("Opció inválida.");
                            break;
                    }
                case 2:
                    parque.diurnos();
                    sleep(2000);
                    limpiarPantalla();
                    break;
                case 3:
                    parque.nocturnos();
                    sleep(2000);
                    limpiarPantalla();
                    break;
                case 4:
                    parque.showManadas();
                    sleep(2000);
                    limpiarPantalla();
                    break;
                case 5:
                    parque.showPajaros();
                    sleep(2000);
                    limpiarPantalla();
                    break;
                case 6:
                    parque.showManadas();
                    sleep(2000);
                    limpiarPantalla();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    sleep(2000);
                    limpiarPantalla();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void showMenu() {
        System.out.println("1. Añadir avistamiento." +
                "\n2. Ver avistamientos diurnos." +
                "\n3. Ver avistamientos nocturnos." +
                "\n4. Ver manadas de lobos." +
                "\n5. Ver serpientes." +
                "\n6. Ver pájaros." +
                "\n0. Salir.");
    }

    public static void showMenu2() {
        System.out.println("1. Serpientes.\n2. Pájaros.\n3. Manadas de lobos.");
    }

    public static void addSerpiente(ParqueNatural parque, Scanner sc) {
        System.out.println("Hora: ");
        int hora = sc.nextInt();
        System.out.println("Especie: ");
        String especie = sc.nextLine();
        System.out.println("Longitud: ");
        double longitud = sc.nextDouble();
        parque.addAvistamiento(new Serpiente(hora, longitud, especie));
        System.out.println("Avistamieto añadido con éxito!");
    }

    public static void addPajaro(ParqueNatural parque, Scanner sc) {
        System.out.println("Hora: ");
        int hora = sc.nextInt();
        System.out.println("Especie: ");
        String especie = sc.nextLine();
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        parque.addAvistamiento(new Serpiente(hora, peso, especie));
        System.out.println("Avistamieto añadido con éxito!");
    }

    public static void addManadas(ParqueNatural parque, Scanner sc) {
        System.out.println("Hora: ");
        int hora = sc.nextInt();
        System.out.println("Cantidad de lobos: ");
        int cantidad = sc.nextInt();
        System.out.println("Observaciones: ");
        String observaciones = sc.nextLine();
        parque.addAvistamiento(new ManadaLobos(hora, cantidad, observaciones));
        System.out.println("Avistamieto añadido con éxito!");
    }

}
