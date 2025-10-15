package tema2;

import java.util.Scanner;
public class t2ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor en dólares");
        int usd = scanner.nextInt();
        double eur= (double)usd*0.86;
        System.out.println("EL valor en euros es "+eur);
    }
}