package tema2;

import java.util.Scanner;
import java.util.Random;

public class T2EJ29 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int secreto = rand.nextInt(100) + 1;
        int intento = 0;
        System.out.println("Adivina el número entre 1 y 100.");
        System.out.print("Introduce un número: ");

        intento = sc.nextInt();

        while (secreto!=intento) {
            if (intento < secreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }
            System.out.print("Introduce otro número: ");

            intento = sc.nextInt();

        }
        System.out.println("ok");
    }
}
