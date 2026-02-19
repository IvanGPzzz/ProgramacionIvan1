package tema5.excepciones1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        rellenarVector();
    }

    public static void rellenarVector() {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[5];
        int i = 0;
        while (i < vector.length) {
            try {
                System.out.print("Introduce el valor de la posición " + (i+1) + " del vector: ");
                double valor = sc.nextInt();
                vector[i] = valor;
                i++;
            } catch (InputMismatchException e) {
                System.err.println("Credenciales incorrectas.");
                sc.nextLine();
            }
        }
        System.out.println("¡Vector rellenado con éxito! " + Arrays.toString(vector));
    }
}
