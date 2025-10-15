package tema1;

import java.util.Scanner;

public class tema1ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int año = scanner.nextInt();
        boolean bisiesto = false;
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            bisiesto = true;
        }
        if (bisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
        scanner.close();
    }
}
