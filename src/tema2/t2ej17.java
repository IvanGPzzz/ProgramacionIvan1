package tema2;

import java.util.Scanner;

public class t2ej17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = scanner.nextInt();
        System.out.println("Introduce la altura");
        int altura = scanner.nextInt();
        System.out.println("Indica: 0: cuadrado, 1: rectángulo o 2: triángulo.");
        int forma = scanner.nextInt();
        switch (forma) {
            case 0:
                double superficie = base * base;
                double perimetro = base * 4;
                System.out.println("Superficie cuadrado = " + superficie + "Perímetro cuadrado = " + perimetro);
                return;
            case 1:
                superficie = base * altura;
                perimetro = (base + altura) * 2;
                System.out.println("Superficie rectángulo = " + superficie + "Perímetro rectángulo = " + perimetro);
                return;
            case 2:
                superficie = (double)(base * altura) / 2;
                System.out.println("Superficie triángulo = " + superficie);
                return;
            default:
                System.out.println("Caso erróneo");
        }
    }
}
