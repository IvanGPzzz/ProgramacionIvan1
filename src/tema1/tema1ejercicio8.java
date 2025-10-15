package tema1;

import java.util.Scanner;

public class tema1ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce otro número entero: ");
        int numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}
