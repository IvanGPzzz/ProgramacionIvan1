package tema2;

import java.util.Scanner;
public class t2ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor en euros");
        int eur = scanner.nextInt();
        double usd= (double)eur*1.17;
        System.out.println("EL valor en dólares es "+usd);
    }
}
