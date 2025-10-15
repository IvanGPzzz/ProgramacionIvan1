package tema1;

import java.util.Scanner;

public class tema1ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número real: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Introduce un número real: ");
        double numero2 = scanner.nextDouble();
        double suma = numero1 + numero2;
        double producto = numero1 * numero2;
        double resta = numero1 - numero2;
        if (numero2 != 0) {
            double division = numero1 / numero2;
            double resto = numero1 % numero2;
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