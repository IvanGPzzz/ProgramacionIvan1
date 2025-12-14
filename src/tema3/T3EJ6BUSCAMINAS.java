package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T3EJ6BUSCAMINAS {

    static final int TAMANO_TABLERO = 20;
    static final int NUMERO_MINAS = 6;
    static final String MINA = "*";
    static final String OCULTO = "?";
    static int turno;

    static String[] tableroJuego;
    static String[] tableroVisible;

    static int casillasReveladas = 0;
    static final int CASILLAS_SEGURAS_TOTALES = TAMANO_TABLERO - NUMERO_MINAS;

    static void inicializarTableros() {
        tableroJuego = new String[TAMANO_TABLERO];
        tableroVisible = new String[TAMANO_TABLERO];
        Arrays.fill(tableroVisible, OCULTO);
        Arrays.fill(tableroJuego, "0");

        Random random = new Random();
        int minasColocadas = 0;

        while (minasColocadas < NUMERO_MINAS) {
            int pos = random.nextInt(TAMANO_TABLERO);
            if (!tableroJuego[pos].equals(MINA)) {
                tableroJuego[pos] = MINA;
                minasColocadas++;
            }
        }

        for (int i = 0; i < TAMANO_TABLERO; i++) {
            if (!tableroJuego[i].equals(MINA)) {
                int contadorMinas = 0;

                if (i > 0 && tableroJuego[i - 1].equals(MINA)) {
                    contadorMinas++;
                }

                if (i < TAMANO_TABLERO - 1 && tableroJuego[i + 1].equals(MINA)) {
                    contadorMinas++;
                }

                if (contadorMinas > 0) {
                    tableroJuego[i] = String.valueOf(contadorMinas);
                }
            }
        }
    }

    static int obtenerPosicionValida(Scanner scanner) {
        int posicion = -1;
        boolean valido = false;

        while (!valido) {
            System.out.print("Selecciona una posición (1-" + TAMANO_TABLERO + "): ");

            if (scanner.hasNextInt()) {
                posicion = scanner.nextInt();
                scanner.nextLine();

                if (posicion < 1 || posicion > TAMANO_TABLERO) {
                    System.out.println("⚠️ ¡Error! La posición debe estar entre 1 y " + TAMANO_TABLERO + ".");
                } else if (!tableroVisible[posicion - 1].equals(OCULTO)) {
                    System.out.println("⚠️ ¡Error! Esa posición ya ha sido revelada.");
                } else {
                    valido = true;
                    return posicion - 1;
                }
            } else {
                System.out.println("⚠️ ¡Error! Ingresa un número válido.");
                scanner.nextLine();
            }
        }
        return -1;
    }

    static void imprimirTablero(boolean mostrarTodo) {
        System.out.println("----------------------------------------");
        System.out.print("Posición: ");
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            System.out.printf("|%-2d", i + 1);
        }
        System.out.println("|");

        System.out.print("Tablero:  ");
        for (int i = 0; i < TAMANO_TABLERO; i++) {
            if (mostrarTodo) {
                System.out.printf("|%-2s", tableroJuego[i]);
            } else {
                System.out.printf("|%-2s", tableroVisible[i]);
            }
        }
        System.out.println("|");
        System.out.println("----------------------------------------");
    }

    static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugando = true;

        System.out.println("💣 ¡Bienvenido al Buscaminas Simple (20 casillas)! 💣");

        inicializarTableros();

        while (jugando) {
            turno++;
            limpiarPantalla();
            imprimirTablero(false);

            System.out.println("\n--- Turno " + turno + " ---");
            System.out.println("Casillas seguras restantes: " + (CASILLAS_SEGURAS_TOTALES - casillasReveladas));

            int posicion = obtenerPosicionValida(scanner);

            String contenido = tableroJuego[posicion];

            if (contenido.equals(MINA)) {
                tableroVisible[posicion] = MINA;
                limpiarPantalla();
                imprimirTablero(true);
                System.out.println("\n💥 ¡BOOM! Has pisado una mina en la posición " + (posicion + 1) + ".");
                System.out.println("--- ¡HAS PERDIDO LA PARTIDA! ---");
                jugando = false;
            } else {
                if (tableroVisible[posicion].equals(OCULTO)) {
                    tableroVisible[posicion] = contenido;
                    casillasReveladas++;
                }

                if (casillasReveladas == CASILLAS_SEGURAS_TOTALES) {
                    limpiarPantalla();
                    imprimirTablero(true);
                    System.out.println("\n🎉 ¡Felicidades! Has revelado todas las casillas seguras.");
                    System.out.println("--- ¡HAS GANADO LA PARTIDA! ---");
                    jugando = false;
                } else {
                    limpiarPantalla();
                    imprimirTablero(false);
                    System.out.println("\nCasilla " + (posicion + 1) + " revelada: " + contenido);
                    System.out.print("Pulsa ENTER para continuar...");
                    scanner.nextLine();
                }
            }
        }
        scanner.close();
    }
}