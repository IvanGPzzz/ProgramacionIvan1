package tema2;

import java.util.Scanner;

public class t2ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int A = scanner.nextInt();
        System.out.println("Introduce otro número");
        int B = scanner.nextInt();
        System.out.println("Introduce el tercer número");
        int C = scanner.nextInt();
        if (A<B && B<C) {
            System.out.println("Los números están ordenados de menor a mayor");
        }else{
            System.out.println("Los números no están ordenados de menor a mayor");
        }
    }
}
