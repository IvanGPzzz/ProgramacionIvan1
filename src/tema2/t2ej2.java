package tema2;

import java.util.Scanner;

public class t2ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = scanner.nextInt();
        System.out.println("Introduce la altura");
        int altura = scanner.nextInt();
        double superficie = base*altura;
        double perimetro = base*2+altura*2;
        System.out.println("La superficie es "+superficie);
        System.out.println("La perimetro es "+perimetro);
    }
}
