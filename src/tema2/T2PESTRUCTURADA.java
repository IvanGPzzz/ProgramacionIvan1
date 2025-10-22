package tema2;

import java.util.Random;
import java.util.Scanner;

public class T2PESTRUCTURADA {
    public static void main(String[] args) {

        //1. Recopilación de stats de los jugadores
        Scanner sc = new Scanner(System.in);
        int vel1 = 0;
        int att1 = 0;
        int def1 = 0;
        int hps1 = 0;
        int vel2 = 0;
        int att2 = 0;
        int def2 = 0;
        int hps2 = 0;

        do {
            System.out.println("Introduce las stats del JUGADOR 1 (no pueden superar los 200 puntos ni sumar más de 500).");
            System.out.println("Velocidad: ");
            vel1 = sc.nextInt();
            while (1 > vel1 || vel1 > 200) {
                System.out.println("Veocidad errónea. Velocidad: ");
                vel1 = sc.nextInt();
            }
            System.out.println("Ataque: ");
            att1 = sc.nextInt();
            while (1 > att1 || att1 > 200) {
                System.out.println("Ataque erróneo. Ataque: ");
                att1 = sc.nextInt();
            }
            System.out.println("Defensa: ");
            def1 = sc.nextInt();
            while (1 > def1 || def1 > 200) {
                System.out.println("Defensa erróneo. Defensa: ");
                def1 = sc.nextInt();
            }
            System.out.println("Puntos de vida: ");
            hps1 = sc.nextInt();
            while (1 > hps1 || hps1 > 200) {
                System.out.println("Puntos de vida erróneos. Puntos de vida: ");
                hps1 = sc.nextInt();
            }
        } while (vel1 + att1 + def1 + hps1 > 500);

        do {
            System.out.println("Introduce las stats del JUGADOR 2 (no pueden superar los 200 puntos ni sumar más de 500).");
            System.out.println("Velocidad: ");
            vel2 = sc.nextInt();
            while (1 > vel2 || vel2 > 200) {
                System.out.println("Veocidad errónea. Velocidad: ");
                vel2 = sc.nextInt();
            }
            System.out.println("Ataque: ");
            att2 = sc.nextInt();
            while (1 > att2 || att2 > 200) {
                System.out.println("Ataque erróneo. Ataque: ");
                att2 = sc.nextInt();
            }
            System.out.println("Defensa: ");
            def2 = sc.nextInt();
            while (1 > def2 || def2 > 200) {
                System.out.println("Defensa erróneo. Defensa: ");
                def2 = sc.nextInt();
            }
            System.out.println("Puntos de vida: ");
            hps2 = sc.nextInt();
            while (1 > hps2 || hps2 > 200) {
                System.out.println("Puntos de vida erróneos. Puntos de vida: ");
                hps2 = sc.nextInt();
            }
        } while (vel2 + att2 + def2 + hps2 > 500);

        //2. Combate por turnos
        System.out.println("En el turno 1 comienza:");
         if (vel1 == vel2) {
             Random tiebreaker = new Random();
             int tiebreak = tiebreaker.nextInt(2);
             if (tiebreak == 0) {
                 vel1 = vel1 + 1;
                 System.out.println("El JUGADOR 1");
             } else {
                 vel2 = vel2 + 1;
                 System.out.println("El JUGADOR 2");
             }
         }
         System.out.println("Comienza el combate!");
         System.out.println("TURNO 1");
         if (vel1>vel2) {
            hps2 = hps2 + def2 - att1;
        } else {
            hps1 = hps1 + def1 - att2;
        }
         System.out.println("Jugador 1: " + hps1);
         System.out.println("Jugador 2: " + hps2);

    }
}
