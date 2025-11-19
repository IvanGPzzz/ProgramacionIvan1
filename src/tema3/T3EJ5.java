package tema3;

import java.util.Scanner;

public class T3EJ5 {

    //public static int tablaMult(int num1, int prod) {
    //    return num1 * prod;
    //}

    public static void tablaMult(int num){
        for (int prod=0; prod < 11; prod++){
            System.out.println(num + " * " + prod + " = " + num * prod);
        }
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10: ");
        int num1  = sc.nextInt();
        if (num1 > 0 && num1 < 11) {
            System.out.println("La tabla de multiplicar de " + num1 + " es: \n");
            tablaMult(num1);
        } else {
            System.out.println("Valor inválido.");
        }
    }

}
