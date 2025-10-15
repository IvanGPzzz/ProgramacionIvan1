package tema2;

import java.util.Scanner;
public class t2ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int A = scanner.nextInt();
        System.out.println("Introduce otro número");
        int B = scanner.nextInt();
        if (A>B) {
            double resta1 = A-B;
            System.out.println("El resultado es "+resta1);
        }
        if (A<B) {
            double resta2 = B-A;
            System.out.println("El resultado es "+resta2);
        }
    }
}