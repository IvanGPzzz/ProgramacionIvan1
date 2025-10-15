package tema1;

import java.util.Scanner;

public class tema1ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce un número entero: ");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int producto = numero1 * numero2;
        if (numero2 != 0) {
            double division = (double) numero1 / numero2;
            int resto = numero1 % numero2;
            System.out.println("Suma = " + suma);
            System.out.println("Resta = " + resta);
            System.out.println("Producto = " + producto);
            System.out.println("División = " + division);
            System.out.println("Resto = " + resto);
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            System.out.println("Suma = " + suma);
            System.out.println("Resta = " + resta);
            System.out.println("Producto = " + producto);
        }
    }
}