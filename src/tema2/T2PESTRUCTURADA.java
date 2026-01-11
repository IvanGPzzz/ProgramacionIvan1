package tema2;

import java.util.Random;
import java.util.Scanner;

public class T2PESTRUCTURADA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

// 1. Recopilación de stats
        int vel1, att1, def1, hps1;
        int vel2, att2, def2, hps2;

        // Jugador 1
        do {
            System.out.println("Introduce las stats del JUGADOR 1 (max 200/stat, total max 500).");
            System.out.print("Velocidad: "); vel1 = sc.nextInt();
            System.out.print("Ataque: ");    att1 = sc.nextInt();
            System.out.print("Defensa: ");   def1 = sc.nextInt();
            System.out.print("Vida: ");      hps1 = sc.nextInt();
        } while (vel1 + att1 + def1 + hps1 > 500 || vel1 < 1 || att1 < 1 || def1 < 1 || hps1 < 1);

        // Jugador 2
        do {
            System.out.println("\nIntroduce las stats del JUGADOR 2 (max 200/stat, total max 500).");
            System.out.print("Velocidad: "); vel2 = sc.nextInt();
            System.out.print("Ataque: ");    att2 = sc.nextInt();
            System.out.print("Defensa: ");   def2 = sc.nextInt();
            System.out.print("Vida: ");      hps2 = sc.nextInt();
        } while (vel2 + att2 + def2 + hps2 > 500 || vel2 < 1 || att2 < 1 || def2 < 1 || hps2 < 1);

// 2. Decisión del primer turno
        boolean turnoP1;
        if (vel1 > vel2) {
            turnoP1 = true;
        } else if (vel2 > vel1) {
            turnoP1 = false;
        } else {
            turnoP1 = rand.nextBoolean(); // Empate: azar
        }

        System.out.println("\n¡COMIENZA EL COMBATE!");

// 3. Bucle de combate interactivo
        int turno = 1;
        while (hps1 > 0 && hps2 > 0) {
            System.out.println("\n========================================");
            System.out.println("RONDA " + turno);

            // Mostrar Barras de Vida (un guion por cada 5 puntos de vida)
            System.out.print("J1: ");
            for (int i = 0; i < hps1 / 5; i++) {
                System.out.print("-");
            }
            System.out.println(" (" + hps1 + " HP)");

            System.out.print("J2: ");
            for (int i = 0; i < hps2 / 5; i++) {
                System.out.print("-");
            }
            System.out.println(" (" + hps2 + " HP)");
            System.out.println("========================================");

            int accion;
            if (turnoP1) {
                System.out.println("TURNO JUGADOR 1. (1) Atacar (2) Curar (3) Defender");
                accion = sc.nextInt();

                if (accion == 1) { // ATACAR
                    int daño = att1 - (def2 / 5) + rand.nextInt(10);
                    if (daño < 0) daño = 0;

                    // Crítico aleatorio (15% de probabilidad)
                    if (rand.nextInt(100) < 15) {
                        int extra = rand.nextInt(21); // Hasta 20 de daño extra
                        daño = daño + extra;
                        System.out.print("¡GOLPE CRÍTICO! ");
                    }
                    hps2 = hps2 - daño;
                    System.out.println("J1 causa " + daño + " de daño.");
                } else if (accion == 2) { // CURAR
                    int cura = 10 + rand.nextInt(11);
                    hps1 = hps1 + cura;
                    System.out.println("J1 se cura " + cura + " HP.");
                } else { // DEFENDER
                    System.out.println("J1 se prepara para resistir el próximo golpe.");
                    def1 = def1 + 15;
                }
            } else {
                System.out.println("TURNO JUGADOR 2. (1) Atacar (2) Curar (3) Defender");
                accion = sc.nextInt();

                if (accion == 1) { // ATACAR
                    int daño = att2 - (def1 / 5) + rand.nextInt(10);
                    if (daño < 0) daño = 0;

                    if (rand.nextInt(100) < 15) {
                        int extra = rand.nextInt(21);
                        daño = daño + extra;
                        System.out.print("¡GOLPE CRÍTICO! ");
                    }
                    hps1 = hps1 - daño;
                    System.out.println("J2 causa " + daño + " de daño.");
                } else if (accion == 2) { // CURAR
                    int cura = 10 + rand.nextInt(11);
                    hps2 = hps2 + cura;
                    System.out.println("J2 se cura " + cura + " HP.");
                } else { // DEFENDER
                    System.out.println("J2 se prepara para resistir.");
                    def2 = def2 + 15;
                }
            }

            if (hps1 < 0) hps1 = 0;
            if (hps2 < 0) hps2 = 0;

            turnoP1 = !turnoP1; // Alternar turno
            turno++;
        }

// 4. Resultado final
        System.out.println("\n**************************");
        if (hps1 > 0) {
            System.out.println("EL GANADOR ES EL JUGADOR 1");
        } else {
            System.out.println("EL GANADOR ES EL JUGADOR 2");
        }
        System.out.println("**************************");
    }
}