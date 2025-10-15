package tema2;

import java.util.Scanner;

public class t2ej15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el mes");
        int mes = scanner.nextInt();
        System.out.println("Introduce el año");
        int anio = scanner.nextInt();
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("El mes tiene 31 dias.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El mes tiene 30 dias.");
        } else {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El mes tiene 29 dias.");
            } else {
                System.out.println("El mes tiene 28 dias.");
            }
        } //holaaaa
    }
}
