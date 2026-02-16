package tema5;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduce un núemro positivo.");
            int p = sc.nextInt();
            printPos(p);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Introduce un núemro negativo.");
            int n = sc.nextInt();
            printNeg(n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printPos(int p) throws Exception {
        if (p < 0) {
            throw new Exception("El número '" + p + "' no es positivo.");
        } else {
            System.out.println("El valor introducido es positivo: " + p);
        }
    }

    public static void printNeg(int n) throws Exception {
        if (n > 0) {
            throw new Exception("El valor número '" + n + "' no es negativo.");
        }else {
            System.out.println("El valor introducido es negativo:" + n);
        }
    }
}
