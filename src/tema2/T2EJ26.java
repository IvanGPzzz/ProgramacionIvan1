package tema2;

import java.util.Scanner;

public class T2EJ26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = sc.nextInt();
        boolean primo = true;
        int i;

        if (numero <= 1) {
            System.out.println(numero + " no es un número primo.");
        } else {
            i = 2;
            while (i <= numero-1) {
                if (numero % i == 0) {
                    primo = false;
                }
                i++;
            }
            if (primo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
    }
}
