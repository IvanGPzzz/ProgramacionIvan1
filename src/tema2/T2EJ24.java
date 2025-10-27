package tema2;

import java.util.Scanner;

public class T2EJ24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        int aprobados = 0;
        int suspendidos = 0;
        System.out.println("Introduce las notas de los alumnos (o uno negativo para terminar):");

        while (nota > -1) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspendidos++;
            }
            nota = sc.nextInt();
        }

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspendidos: " + suspendidos);

    }
}