package tema2;

import java.util.Scanner;

public class t2ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int A = scanner.nextInt();
        System.out.println("Introduce otro número");
        int B = scanner.nextInt();
        System.out.println("Introduce el tercer número");
        int C = scanner.nextInt();
        if (A>B && B>C) {
            System.out.println("El orden de mayor a menor es "+A+", "+B+" y "+C);
        }
        if (B>A && A>C) {
            System.out.println("El orden de mayor a menor es "+B+", "+A+" y "+C);
        }
        if (C>B && B>A) {
            System.out.println("El orden de mayor a menor es "+C+", "+B+" y "+A);
        }
        if (A>C && C>B) {
            System.out.println("El orden de mayor a menor es "+A+", "+C+" y "+B);
        }
        if (B>C && C>A) {
            System.out.println("El orden de mayor a menor es "+B+", "+C+" y "+A);
        }
        if (C>A && A>B) {
            System.out.println("El orden de mayor a menor es "+C+", "+A+" y "+B);
        }
    }
}
