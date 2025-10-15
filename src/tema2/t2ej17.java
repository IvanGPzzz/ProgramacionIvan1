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
        if (forma != 0 && forma != 1 && forma != 2) {
            System.out.println("Ha habido un error.");
        } else if (forma == 0) {
            double superficie = base * base;
            double perimetro = base * 4;
            System.out.println("Superficie cuadrado = " + superficie + "Perímetro cuadrado = " + perimetro);
        } else if (forma == 1) {
            double superficie = base * altura;
            double perimetro = (base + altura) * 2;
            System.out.println("Superficie rectángulo = " + superficie + "Perímetro rectángulo = " + perimetro);
        } else if (forma == 2) {
            double superficie = (double)(base * altura) / 2;
            System.out.println("Superficie triángulo = " + superficie);
        }
    }
}
