package tema5.excepciones1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        vectorRandom();
    }
    public static void vectorRandom() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n = rand.nextInt(100) + 1;
        int[]  vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10) + 1;
        }

        System.out.println("\nVector de tamaño " + n + " generado correctamente.");
        int posicion=0;

        while (posicion >= 0) {
            try {
                System.out.println("\n¿Qué posicion quieres ver?");
                posicion = sc.nextInt();
                 if (posicion >= 0) {
                     System.out.println("El valor en la posición " + posicion + " es: " + vector[posicion]);
                 }
            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un valor entero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: la posición elegida no existe.");
                System.exit(0);
            }
        }
        System.out.println("Saliendo del programa...");
    }
}
