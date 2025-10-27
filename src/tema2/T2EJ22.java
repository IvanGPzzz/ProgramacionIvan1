package tema2;

import java.util.Scanner;

public class T2EJ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = sc.nextInt();
        int cifras = 0;
        if (numero == 0) {
            cifras = 1;
        } else {
            while (numero > 0 || numero < 0) {
                numero = numero / 10;
                cifras++;
            }
        }
        System.out.println("El número tiene " + cifras + " cifras.");
    }
}
