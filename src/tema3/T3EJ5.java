package tema3;

import java.util.Scanner;

public class T3EJ5 {

    public static int tablaMult(int num, int prod){
        return num * prod;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10: ");
        int num  = sc.nextInt();
        System.out.println("La tabla de multiplicar de " + num + " es: ");
        if (num > 0 && num < 11) {
            for(int prod=0; prod < 11; prod++){
                System.out.println(num + " * " + prod + " = " + tablaMult(num, prod));
            }
        }
    }
}
