import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int numero = sc.nextInt();
        int cifras_impares = 0;
        if (numero == 0) {
            cifras_impares = 0;
        } else {
            while (numero > 0 || numero < 0) {
                if (numero%2!=0){cifras_impares++;}
                numero = numero / 10;
            }
        }
        System.out.println("El número tiene " + cifras_impares + " cifras impares.");
    }
}
