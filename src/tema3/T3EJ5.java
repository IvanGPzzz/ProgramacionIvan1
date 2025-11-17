package tema3;

import java.util.Scanner;

public class T3EJ5 {

    public static int tablaMult(int num1, int prod){
        return num1 * prod;
    }

    public static void main (String [] args){
        Scanner tablas = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10: ");
        int num1  = tablas.nextInt();
        if (num1 > 0 && num1 < 11) {
            System.out.println("La tabla de multiplicar de " + num1 + " es: \n");
            for(int prod=0; prod < 11; prod++){
                System.out.println(num1 + " * " + prod + " = " + tablaMult(num1, prod));
            }
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
