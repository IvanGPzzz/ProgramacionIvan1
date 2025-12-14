package tema3;

import java.util.Random;
import java.util.Scanner;

public class T3EJ3MOSCA {
    public static void main(String[] args) {
        Random rndm = new Random();
        int[] tablero = new int[15];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = i + 1;
        }
        int mosca = tablero[rndm.nextInt(15)];

        while (true) {
            System.out.println("¿Dónde se encuentra la mosca?");
            int guess = sc.nextInt();
            int posicion = guess-1;
            int postab = tablero[posicion];

            if (postab == mosca) {
                System.out.println("¡Le diste!\n");
                System.out.println("Fin del juego.");
                break;
            }
            if (postab == mosca + 1 || postab == mosca - 1) {
                System.out.println("¡Casi! La mosca cambió de posición, vuelve a intentarlo.");
                mosca = rndm.nextInt(15);
            } else {
                System.out.println("No le diste. Vuelve a intentarlo.");
            }
        }
    }
}
