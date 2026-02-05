package tema4;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class PruebaCuentas {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Personaa[] personas = new Personaa[5];
        int numPersonas = 0;
        String opcion;

    /*
          __  __ ______ _   _ _    _
         |  \/  |  ____| \ | | |  | |
         | \  / | |__  |  \| | |  | |
         | |\/| |  __| | . ` | |  | |
         | |  | | |____| |\  | |__| |
         |_|  |_|______|_| \_|\____/
    */

        do {
            showMenu();
            opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    numPersonas = anadirPersona(numPersonas, personas, sc);
                    sleep(1000);
                    limpiarPantalla();
                    break;

                case "b":
                    anadirCuenta(numPersonas, personas, sc);
                    sleep(1000);
                    limpiarPantalla();
                    break;

                case "c":
                    verDatos(numPersonas, personas, sc);
                    sleep(2000);
                    limpiarPantalla();
                    break;

                case "d":
                    realizarOperacion(numPersonas, personas, sc);
                    sleep(1000);
                    limpiarPantalla();
                    break;

                case "e":
                    transferencia(numPersonas, personas, sc);
                    sleep(1000);
                    limpiarPantalla();
                    break;

                case "f":
                    printMorosos(numPersonas, personas, sc);
                    sleep(1000);
                    limpiarPantalla();
                    break;

                case "x":
                    System.out.println("Saliendo del programa...");
                    sleep(1000);
                    limpiarPantalla();
                    break;

                default:
                    System.out.println("Opción no válida.");
                    sleep(1000);
                    limpiarPantalla();
                    break;
            }

        } while (!opcion.equals("x"));
        sc.close();

    }

    /*
          ______ _    _ _   _  _____ _____  ____  _   _ ______  _____
         |  ____| |  | | \ | |/ ____|_   _|/ __ \| \ | |  ____|/ ____|
         | |__  | |  | |  \| | |      | | | |  | |  \| | |__  | (___
         |  __| | |  | | . ` | |      | | | |  | | . ` |  __|  \___ \
         | |    | |__| | |\  | |____ _| |_| |__| | |\  | |____ ____) |
         |_|     \____/|_| \_|\_____|_____|\____/|_| \_|______|_____/
     */

    //showMenu
    public static void showMenu() {
        System.out.println("""
                ¿Qué quieres hacer?
                a) Añadir persona.
                b) Añadir cuenta.
                c) Ver datos.
                d) Realizar operación (ingreso/cargo).
                e) Realizar transferencia.
                f) Ver personas morosas.
                x) Salir.""");
    }

    //limpiarPantalla
    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    //buscarPersona
    public static Personaa buscarPersona(Personaa[] personas, int numPersonas, String dniIntro) {
        Personaa personaSelec = null;
        for (int i = 0; i < numPersonas; i++) {
            if (personas[i].getDni().equals(dniIntro)) {
                personaSelec = personas[i];
            }
        }
        return personaSelec;
    }

    // buscarCuenta
    public static Cuenta buscarCuenta(Personaa personaElegida, int numCuenta) {
        Cuenta cuentaSelec = null;
        for (int i = 0; i < personaElegida.cuentas.length; i++) {
            if (personaElegida.cuentas[i].getNumCuenta() == numCuenta) {
                cuentaSelec = personaElegida.cuentas[i];
            }
        }
        return cuentaSelec;
    }

    //anadirPersona
    public static int anadirPersona(int numPersonas, Personaa[] personas, Scanner sc) {
        if (numPersonas < personas.length) {
            System.out.println("Introduce los datos del nuevo cliente: ");
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("DNI: ");
            String dni = sc.nextLine();
            personas[numPersonas] = new Personaa(nombre, dni);
            numPersonas++;
            System.out.println("¡Cliente añadido correctamente!");
        } else {
            System.out.println("Se ha alcanzado el límite máximo de clientes.");
        }
        return numPersonas;
    }

    //anadirCuenta
    public static void anadirCuenta(int numPersonas, Personaa[] personas, Scanner sc) {
        if (numPersonas == 0) {
            System.out.println("Todavía no hay clientes.");
        }
        System.out.println("Introduce el DNI del cliente al que quieres agregar una cuenta: ");
        String dni = sc.nextLine();
        Personaa personaElegida = buscarPersona(personas, numPersonas, dni);

        if (personaElegida == null) {
            System.out.println("El cliente no existe");
        }
        System.out.println("Introduce las credenciales de la nueva cuenta: ");
        System.out.println("Número de cuenta: ");
        int numCuenta = sc.nextInt();
        sc.nextLine();
        System.out.println("Saldo: ");
        int saldo = sc.nextInt();
        sc.nextLine();

        if (!personaElegida.addAcc(new Cuenta(numCuenta, saldo))) {
            System.out.println("Se ha excedido el número de cuentas máximo.\n" +
                    "La cuenta bancaria no ha sido agregada.");
        } else {
            System.out.println("¡Cuenta agregada correctamente!");
        }
    }

    // verDatos
    public static void verDatos(int numPersonas, Personaa[] personas, Scanner sc) {
        if (numPersonas == 0) {
            System.out.println("Todavía no hay clientes.");
        }
        System.out.println("Introduce el DNI del cliente para ver sus datos: ");
        String dni = sc.nextLine();
        Personaa personaElegida = buscarPersona(personas, numPersonas, dni);
        System.out.println("Nombre: " + personaElegida.getNombre());
        System.out.println("DNI: " + personaElegida.getDni());
        for (int i = 0; i < personaElegida.getAccCont(); i++) {
            System.out.println("Número de cuenta: " + (i + 1) + personaElegida.cuentas[i].getNumCuenta());
            System.out.println("Saldo: " + personaElegida.cuentas[i].getSaldo());
        }
    }

    // elegir cuenta
    public static Cuenta elegirCuenta(int numPersonas, Personaa[] personas, Scanner sc) {
        if (numPersonas == 0) {
            System.out.println("Todavía no hay clientes.");
        }
        System.out.println("Introduce el DNI: ");
        String dni = sc.nextLine();
        Personaa personaElegida = buscarPersona(personas, numPersonas, dni);

        if (personaElegida == null) {
            System.out.println("El cliente no existe");
        }
        System.out.println("Introduce el número de cuenta: ");
        int numCuenta = sc.nextInt();
        sc.nextLine();
        Cuenta cuentaElegida = buscarCuenta(personaElegida, numCuenta);
        return cuentaElegida;
    }

    //realizarOperacion
    public static void realizarOperacion(int numPersonas, Personaa[] personas, Scanner sc) throws InterruptedException {
        int opcion;
        do {
            System.out.println("¿Sobre que cuenta quieres realizar la operación?");
            Cuenta cuentaElegida = elegirCuenta(numPersonas, personas, sc);
            System.out.println("¿Qué operación desea realizar?\n" +
                    "1- Ingresar nómina.\n" +
                    "2- Retirar cargo.\n" +
                    "0- Salir.");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cuál es la cantidad a ingresar?");
                    int nomina = sc.nextInt();
                    sc.nextLine();
                    cuentaElegida.ingresar(nomina);
                    System.out.println("¡Nómina ingresada!");
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 2:
                    System.out.println("¿Cuál es la cantidad a retirar?");
                    int cargo = sc.nextInt();
                    sc.nextLine();
                    cuentaElegida.retirar(cargo);
                    System.out.println("¡Cargo retirado!");
                    sleep(1000);
                    limpiarPantalla();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    sleep(1000);
                    limpiarPantalla();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    sleep(1000);
                    limpiarPantalla();
                    break;
            }
        } while (opcion != 0);
    }

    //transferencia
    public static void transferencia(int numPersonas, Personaa[] personas, Scanner sc) {
        System.out.println("Introduce la cuenta emisora: ");
        Cuenta cuentaEmisora = elegirCuenta(numPersonas, personas, sc);
        System.out.println("Introduce la cuenta receptora: ");
        Cuenta cuentaReceptora = elegirCuenta(numPersonas, personas, sc);

        System.out.println("Introduce la cantidad a transferir: ");
        int dineroTransferencia = sc.nextInt();
        sc.nextLine();

        cuentaEmisora.retirar(dineroTransferencia);
        cuentaReceptora.ingresar(dineroTransferencia);
        System.out.println("¡Transferencia realizada!");
    }

    //printMorosos
    public static void printMorosos(int numPersonas, Personaa[] personas,  Scanner sc) {
        if (numPersonas == 0) {
            System.out.println("Todavía no hay clientes.");
        }
        boolean hayMorosos = false;
        for (int i = 0; i < numPersonas; i++) {
            if (personas[i].esMoroso()) {
                System.out.println("Sr./Sra. " + personas[i].getNombre() + " con DNI: " + personas[i].getDni());
                hayMorosos = true;
            }
        }
        if (!hayMorosos) {
            System.out.println("No hay morosos.");
        }
        System.out.println("Presiona enter para terminar...");
        sc.nextLine();
    }

}
