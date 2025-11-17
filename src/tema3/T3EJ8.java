package tema3;

import java.util.Scanner;

public class T3EJ8 {
    public static boolean esFechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        int diasEnMes;
        switch (mes) {
            case 4: case 6: case 9: case 11:
                diasEnMes = 30;
                break;
            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    diasEnMes = 29;
                } else {
                    diasEnMes = 28;
                }
                break;
            default:
                diasEnMes = 31;
        }
        if (dia >= 1 && dia <= diasEnMes) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner fechas = new Scanner(System.in);
        System.out.print("Introduce el día (1-31): ");
        int dia = fechas.nextInt();

        System.out.print("Introduce el mes (1-12): ");
        int mes = fechas.nextInt();

        System.out.print("Introduce el año: ");
        int anio = fechas.nextInt();

        if (esFechaValida(dia, mes, anio)) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha NO es correcta.");
        }
    }
}
