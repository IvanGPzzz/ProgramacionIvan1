package tema3;

import java.util.Scanner;

public class T3EJ2 {
    public static boolean esAdulto(int edad){
        //return edad>=18;
        if (edad >= 18){
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {
        Scanner anios = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese el edad: ");
        edad = anios.nextInt();

        if (esAdulto(edad)){
            System.out.println("La persona es mayor de edad");
        }
    }
}
