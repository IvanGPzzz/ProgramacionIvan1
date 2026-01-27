package tema4;

import java.util.Scanner;

public class RelojMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reloj reloj1 = new Reloj();
        Reloj reloj2 = new Reloj(22,45,12);

        System.out.println("--- Configuración Reloj 1 ---");
        System.out.print("Introduce hora (0-23): ");
        reloj1.setHr(sc.nextInt());
        System.out.print("Introduce minutos (0-59): ");
        reloj1.setMin(sc.nextInt());
        System.out.print("Introduce segundos (0-59): ");
        reloj1.setSg(sc.nextInt());

        System.out.print("\nHora Reloj 1 (con showTime): ");
        reloj1.showTime();
        System.out.print("Hora Reloj 2 (con showTime): ");
        reloj2.showTime();

        System.out.println("Hora Reloj 1: " +  reloj1);
        System.out.println("Hora Reloj 2: " +  reloj2);

        System.out.println("Hora Reloj 1 (con toString): " + reloj1.toString());
        System.out.println("Hora Reloj 2 (con toString): " + reloj2.toString());
    }
}
