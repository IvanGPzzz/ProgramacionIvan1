package tema3;

import java.util.Scanner;

public class T3EJ6 {
    public static int tablaMult(int num, int prod){
        return num * prod;
    }

    public static void main (String [] args){
        for(int num =1; num < 11; num++){
            System.out.println("\nLa tabla de multiplicar del " + num + " es: \n");
            for (int prod = 0; prod < 11; prod++)
            {System.out.println(num + " * " + prod + " = " + tablaMult(num, prod));
            }
        }
    }
}
