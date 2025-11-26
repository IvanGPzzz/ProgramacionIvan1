package tema3;

import java.util.Scanner;

public class MenuMyMath {
    public static void menuMyMath(String[] args) {
        System.out.print("Elige una opción:\n " +
                "a) Calcula áreas y perímetros.\n" +
                "b) Comprueba si un número es primo o no.\n" +
                "c) Comprueba el número de dígitos de un entero.\n" +
                "d) Comprueba e número de dígitos pares de un entero.\n" +
                "e) Comprueba e número de dígitos impares de un entero.\n" +
                "f) Calcula el factorial de un número.\n" +
                "g) Calcula el factorial de un número de manera recuraiva.\n" +
                "h) comprueba cuantas soluciones tiene la ecuación.\n" +
                "i) Suma los dígitos de un número entero. \n");
        Scanner sc = new Scanner(System.in);
        String eleccion = sc.nextLine();

        switch (eleccion) {
            case "a":
        }
    }
}
