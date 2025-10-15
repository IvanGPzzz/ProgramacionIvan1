package tema2;

import java.util.Scanner;
public class t2ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int A = scanner.nextInt();
        System.out.println("Introduce otro número");
        int B = scanner.nextInt();
        System.out.println("Introduce el tercer número");
        int C = scanner.nextInt();
        double media_entera=(A+B+C)/3;
        double media_real= (double) (A+B+C)/3;
        System.out.println("La media entera es " + media_entera);
        System.out.println("La media real es " + media_real);
    }
}
