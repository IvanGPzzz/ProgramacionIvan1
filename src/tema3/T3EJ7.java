package tema3;

import java.util.Scanner;

public class T3EJ7 {
    public static boolean esprimo (int numero) {
        if (numero == 1){
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numeroo introduzca un 0 para terminar: ");
        int numero = sc.nextInt();

        while (numero != 0) {
            if (esprimo(numero)) {
                System.out.println("El número es primo");
            }  else {
                System.out.println("El número no es primo");
            }
            System.out.println("Digite otro numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Saliendo. . . ");
    }
}
