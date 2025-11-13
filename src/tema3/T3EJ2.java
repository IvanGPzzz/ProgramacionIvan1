package tema3;

import java.util.Scanner;

public class T3EJ2 {
    public static boolean esAdulto(int edad){
        if (edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese el edad: ");
        edad = sc.nextInt();

        if (esAdulto(edad)){
            System.out.println("La persona es mayor de edad");
        }
    }
}
