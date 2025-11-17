package tema3;

import java.util.Scanner;

public class T3EJ9 {
    public static String triangulo (int numLineas, char letra, int poslinea) {
        String linea = "";
        int espacios = numLineas - poslinea;
        int letras = poslinea * 2 - 1;
        for (int i = 1; i <= espacios; i++) {
            linea += " ";
        }
        for (int i = 1; i <= letras; i++) {
            linea += letra;
        }
        return linea;
    }

    public static void main(String[] args) {
        Scanner triang = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int numLineas = triang.nextInt();
        System.out.println("Introduce una letra: ");
        char letra = triang.next().charAt(0);

        for (int poslinea = 1; poslinea <= numLineas; poslinea++) {
            System.out.println(triangulo(numLineas, letra, poslinea));
        }
    }
}
