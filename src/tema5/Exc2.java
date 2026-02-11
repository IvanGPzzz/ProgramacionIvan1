package tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        double division;

        try {
            System.out.print("Ingrese el primer numero: ");
            num1 = sc.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = sc.nextInt();
            division = num1 / num2;
            System.out.println("El resultado es: " + division);
        } catch (InputMismatchException e) {
            System.out.println("Valores no válidos");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }
}
