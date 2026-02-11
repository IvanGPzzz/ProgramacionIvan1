package tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        try {
            System.out.println("Digite um numero entero: ");
            input = sc.nextInt();
            System.out.println("Valor introducido: " + input);
        } catch (InputMismatchException e) {
            System.out.println("Valor introducido incorrecto.");
        }
    }
}
