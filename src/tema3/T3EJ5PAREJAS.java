package tema3;

import java.util.*;
import java.util.stream.Collectors;

public class T3EJ5PAREJAS {

    // ----- VARIABLES GENERALES -----
    static String[] parejas = {
            "🐶", "🐱", "🐻", "🐮", "🐷", "🦁", "🐰", "🐴", "🐔", "🐵",
            "🐶", "🐱", "🐻", "🐮", "🐷", "🦁", "🐰", "🐴", "🐔", "🐵"
    };

    static boolean[] visiblePerma;
    static int tablero = parejas.length;
    static int turno = 0;

    // ----- FUNCIONES PARA USAR EN EL MAIN -----

    public static void barajar() {
        List<String> listaParejas = new ArrayList<>(List.of(parejas));
        Collections.shuffle(listaParejas);
        listaParejas.toArray(parejas);
    }

    public static void imprimir() {
        System.out.println("TURNO " + turno);
        System.out.println("----------------------------------------");
        for (int i = 0; i < tablero; i++) {
            if (visiblePerma[i]) {
                System.out.printf("| %-2s", parejas[i]);
            } else {
                System.out.printf("| %-2s", "?");
            }

            if ((i + 1) % 10 == 0) {
                System.out.println("|");
            }
        }
        System.out.println("----------------------------------------");
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static int esPosicionValida(Scanner scanner, int numPos, int... exclusiones) {
        int posicion = -1;
        boolean valido = false;
        List<Integer> exclusionesList = Arrays.stream(exclusiones).boxed().collect(Collectors.toList());

        while (!valido) {
            System.out.print("Selecciona una posición " + numPos + " (1-" + tablero + "): ");
            if (scanner.hasNextInt()) {
                posicion = scanner.nextInt();
                scanner.nextLine();

                if (posicion < 1 || posicion > tablero) {
                    System.out.println("⚠️ ¡Error! La posición debe estar entre 1 y " + tablero + ".");
                } else if (visiblePerma[posicion - 1]) {
                    System.out.println("⚠️ ¡Error! Esa posición ya forma parte de una pareja encontrada.");
                } else if (exclusionesList.contains(posicion)) {
                    System.out.println("⚠️ ¡Error! No puedes seleccionar la misma posición dos veces.");
                } else {
                    valido = true;
                }
            } else {
                System.out.println("⚠️ ¡Error! Ingresa un número válido.");
                scanner.nextLine();
            }
        }
        return posicion;
    }

    public static void visibleTempUnica(int pos) {
        boolean estadoOriginal = visiblePerma[pos - 1];

        visiblePerma[pos - 1] = true;
        limpiarPantalla();
        imprimir();

        visiblePerma[pos - 1] = estadoOriginal;
    }


    public static void visibleTempAmbas(int pos1, int pos2) {
        boolean estadoOriginal1 = visiblePerma[pos1 - 1];
        boolean estadoOriginal2 = visiblePerma[pos2 - 1];

        visiblePerma[pos1 - 1] = true;
        visiblePerma[pos2 - 1] = true;
        limpiarPantalla();
        imprimir();

        visiblePerma[pos1 - 1] = estadoOriginal1;
        visiblePerma[pos2 - 1] = estadoOriginal2;
    }

    public static boolean finJuego() {
        for (boolean visible : visiblePerma) {
            if (!visible) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        visiblePerma = new boolean[tablero];
        barajar();
        Scanner sc = new Scanner(System.in);

        while (!finJuego()) {
            turno++;
            limpiarPantalla();
            imprimir();

            int pos1 = esPosicionValida(sc, 1);
            visibleTempUnica(pos1);
            int pos2 = esPosicionValida(sc, 2, pos1);
            visibleTempAmbas(pos1, pos2);


            if (parejas[pos1 - 1].equals(parejas[pos2 - 1])) {
                System.out.println("🎉 ¡PAREJA ENCONTRADA! (" + parejas[pos1 - 1] + " y " + parejas[pos2 - 1] + ") 🎉");

                visiblePerma[pos1 - 1] = true;
                visiblePerma[pos2 - 1] = true;

                System.out.print("Pulsa ENTER para continuar...");
                sc.nextLine();

                if (finJuego()) {
                    break;
                }
            } else {
                System.out.println("❌ ¡NO SON PAREJA!");

                System.out.print("Pulsa ENTER para continuar y ocultar las cartas...");
                sc.nextLine();
            }
        }

        limpiarPantalla();
        imprimir();
        System.out.println("🏆 ¡GANASTE EN " + turno + " TURNOS! 🏆");
        sc.close();
    }
}