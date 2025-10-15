package tema1;

import java.util.Scanner;

public class tema1actividad7 {
    public static void main(String[] args) {
        System.out.println("Introduce un número del 1 al 6");
        Scanner R = new Scanner(System.in);
        int n = R.nextInt();
        if (n < 1 && n> 6) {
            System.out.println("Valor no válido");
        } else {
            int x = 7-n;
            System.out.println("El reverso del dado es " + x);
        }
    }
}
