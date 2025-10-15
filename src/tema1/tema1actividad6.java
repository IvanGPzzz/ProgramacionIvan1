package tema1;

import java.util.Scanner;

public class tema1actividad6 {
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner R = new Scanner(System.in);
        int s = R.nextInt();
        double ValorA = 3.14*s*s;
        System.out.println("El resultado es" + ValorA);
    }
}
