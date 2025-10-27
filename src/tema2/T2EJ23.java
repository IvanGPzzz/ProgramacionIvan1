package tema2;

import java.util.Scanner;

public class T2EJ23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        double media;
        System.out.println("Introduce números enteros positivos (o uno negativo para terminar):");

        numero = sc.nextInt();

        while (numero < 0){
            suma = suma + numero;
            contador++;
            numero = sc.nextInt();
        }

        if (contador == 0) {
            System.out.println("No se introdujeron números positivos.");
        } else {
            media = (double) suma / contador;
            System.out.println("La media de los números positivos es: " + media);
        }
    }
}
