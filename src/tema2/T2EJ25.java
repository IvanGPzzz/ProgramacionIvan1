package tema2;

import java.util.Scanner;

public class T2EJ25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero no negativo:");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("Error: el factorial no está definido para números negativos.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial + ".");
        }
    }
}