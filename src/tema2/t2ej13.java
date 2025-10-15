package tema2;

import java.util.Scanner;

public class t2ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce las horas");
        int horas = scanner.nextInt();
        while (horas < 0 || horas > 23) {
            System.out.println("Introduce las horas");
            horas = scanner.nextInt();
        }

        System.out.println("Introduce los minutos");
        int minutos = scanner.nextInt();
        while (minutos < 0 || horas > 60) {
            System.out.println("Introduce los minutos");
            minutos = scanner.nextInt();
        }
        System.out.println("Introduce los segundos");
        int segundos = scanner.nextInt();
        while (segundos < 0 || horas > 60) {
            System.out.println("Introduce los segundos");
            segundos = scanner.nextInt();
        }
        segundos++;
        if (segundos == 60) {
            minutos++;
            segundos = 0;
        }
        if (minutos == 60) {
            horas++;
            minutos = 0;
        }
        if (horas == 24) {
            horas = 00;
        }
        System.out.println("La hora ha cambiado: "+horas+":"+minutos+":"+segundos);
    }
}