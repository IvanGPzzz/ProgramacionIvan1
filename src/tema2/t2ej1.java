package tema2;

import java.util.Scanner;

public class t2ej1 {
    public static void main(String[] args){
        System.out.println("Escribe el lado");
        Scanner scanner = new Scanner(System.in);
        int lado = scanner.nextInt();
        double superficie = lado*lado;
        double perimetro = lado*4;
        System.out.println("La superficie equivale a " +superficie);
        System.out.println("El perimetro equivale a " +perimetro);
    }
}
