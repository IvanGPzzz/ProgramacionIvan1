package tema3;

import java.util.Scanner;

public class T3EJ6 {

    public static void main (String [] args){
        for(int num1 =1; num1 < 11; num1++){
            System.out.println("\nLa tabla de multiplicar del " + num1 + " es: \n");
            for (int prod = 0; prod < 11; prod++)
            {System.out.println(num1 + " * " + prod + " = " + T3EJ5.tablaMult(num1, prod));
            }
        }
    }
}
