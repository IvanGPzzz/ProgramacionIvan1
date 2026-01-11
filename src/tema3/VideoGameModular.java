package tema3;

import java.util.Random;
import java.util.Scanner;

public class VideoGameModular {

    // Variables globales
    static int vel1, att1, def1, hps1;
    static int vel2, att2, def2, hps2;
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        // 1. Inicializacar jugadores
        leerEstadisticasJugador(1);
        leerEstadisticasJugador(2);

        // 2. Decidir 1er turno
        boolean turnoP1 = decidirOrden();
        System.out.println("\n¡EL COMBATE COMIENZA!");

        // 3. Ciclo de juego
        int ronda = 1;
        while (hps1 > 0 && hps2 > 0) {
            mostrarInterfaz(ronda);

            if (turnoP1) {
                ejecutarTurno(1);
            } else {
                ejecutarTurno(2);
            }

            actualizarVida();
            turnoP1 = !turnoP1; // Alternamos turno
            ronda++;
        }

        // 4. Fin del juego
        anunciarVencedor();
    }

    // --- FUNCIONES LEER/VALIDAR  ---

    public static void leerEstadisticasJugador(int num) {
        boolean datosValidos = false;
        while (!datosValidos) {
            System.out.println("\n--- JUGADOR " + num + " ---");
            System.out.print("Velocidad: "); int v = sc.nextInt();
            System.out.print("Ataque: ");    int a = sc.nextInt();
            System.out.print("Defensa: ");   int d = sc.nextInt();
            System.out.print("Vida: ");      int h = sc.nextInt();

            if (validarStats(v, a, d, h)) {
                asignarStats(num, v, a, d, h);
                datosValidos = true;
            } else {
                System.out.println("Error: Stats entre 1-200 y suma total max 500.");
            }
        }
    }

    public static boolean validarStats(int v, int a, int d, int h) {
        boolean rango = (v >= 1 && v <= 200) && (a >= 1 && a <= 200) && (d >= 1 && d <= 200) && (h >= 1 && h <= 200);
        boolean suma = (v + a + d + h <= 500);
        return rango && suma;
    }

    public static void asignarStats(int num, int v, int a, int d, int h) {
        if (num == 1) {
            vel1 = v; att1 = a; def1 = d; hps1 = h;
        } else {
            vel2 = v; att2 = a; def2 = d; hps2 = h;
        }
    }

    // --- FUNCIONES COMBATE ---

    public static boolean decidirOrden() {
        if (vel1 == vel2) return rand.nextBoolean();
        return vel1 > vel2;
    }

    public static void ejecutarTurno(int num) {
        System.out.println(">>> TURNO JUGADOR " + num + ": (1) Atacar (2) Curar (3) Defender");
        int opcion = sc.nextInt();

        if (opcion == 1) realizarAtaque(num);
        else if (opcion == 2) realizarCura(num);
        else realizarDefensa(num);
    }

    public static void realizarAtaque(int atacante) {
        int dano;
        if (atacante == 1) {
            dano = calcularImpacto(att1, def2);
            hps2 -= dano;
        } else {
            dano = calcularImpacto(att2, def1);
            hps1 -= dano;
        }
        System.out.println("¡Impacto de " + dano + " puntos!");
    }

    public static int calcularImpacto(int ataque, int defensa) {
        int base = (ataque - (defensa / 5)) + rand.nextInt(10);
        if (base < 0) base = 0;

        // Crítico aleatorio
        if (rand.nextInt(100) < 15) {
            int extra = rand.nextInt(21);
            base += extra;
            System.out.print("¡CRÍTICO! ");
        }
        return base;
    }

    public static void realizarCura(int num) {
        int cura = 15 + rand.nextInt(11);
        if (num == 1) hps1 += cura;
        else hps2 += cura;
        System.out.println("Jugador " + num + " recupera " + cura + " de vida.");
    }

    public static void realizarDefensa(int num) {
        if (num == 1) def1 += 20;
        else def2 += 20;
        System.out.println("Jugador " + num + " se pone en guardia.");
    }

    // --- FUNCIONES DE PANTALLA ---

    public static void mostrarInterfaz(int r) {
        System.out.println("\nRONDA " + r);
        dibujarBarra("J1", hps1);
        dibujarBarra("J2", hps2);
    }

    public static void dibujarBarra(String nombre, int vida) {
        System.out.print(nombre + " [" + vida + "]: ");
        for (int i = 0; i < vida / 5; i++) System.out.print("-");
        System.out.println();
    }

    public static void actualizarVida() {
        if (hps1 < 0) hps1 = 0;
        if (hps2 < 0) hps2 = 0;
    }

    public static void anunciarVencedor() {
        System.out.println("\n**************************");
        if (hps1> 0) System.out.println("VICTORIA PARA EL JUGADOR 1");
        else System.out.println("VICTORIA PARA EL JUGADOR 2");
        System.out.println("**************************");
    }
}