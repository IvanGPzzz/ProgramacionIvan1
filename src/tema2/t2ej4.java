package tema2;

import java.util.Scanner;
public class t2ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int A = scanner.nextInt();
        System.out.println("Introduce otro número");
        int B = scanner.nextInt();
        System.out.println("Introduce el tercer número");
        int C = scanner.nextInt();
        if (A>B && A>C) {
            System.out.println("El número mayor es " + A);
        }
        if (B>A && B>C){
            System.out.println("El número mayor es "+B);
        }
        if (C>A && C>B){
            System.out.println("El número mayor es "+C);
        }
    }
}
