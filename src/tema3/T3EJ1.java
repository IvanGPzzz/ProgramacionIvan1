package tema3;

import java.util.Scanner;

public class T3EJ1 {
    public static int numberSing(int num){
        if (num < 0) {
            return -1;
        }else if (num == 0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nümero entero y diré si es positivo(1), negativo(-1) o cero(0)");
        int num = sc.nextInt();

        int valor = numberSing(num);
        if (valor == -1) {
            System.out.println("El número es negativo");
        }
        if (valor == 0) {
            System.out.println("El número es cero");
        }
        if (valor == 1) {
            System.out.println("El número es positivo");
        }
    }
}

