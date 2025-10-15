package tema2;

import java.util.Scanner;

public class t2ej18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor.");
        double valor = scanner.nextDouble();
        while (valor <0){
            System.out.println("Error: no se puede calcular la raíz cuadrada de un valor negativo. Introduce otro número.");
            valor = scanner.nextDouble();
        }
        double raiz = Math.sqrt(valor);
        System.out.println("La raiz cuadrada de" + valor + " es: " + raiz);
    }
}