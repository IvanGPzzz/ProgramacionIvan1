package tema2;

import java.util.Scanner;
public class t2ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n = scanner.nextInt();
        if (n>0) {
            System.out.println("El número es positivo");
        }
        if (n<0) {
            System.out.println("El número es negativo");
        }
        if (n==0) {
            System.out.println("El número es cero");
        }
    }
}
