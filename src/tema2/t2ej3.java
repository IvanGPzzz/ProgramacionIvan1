package tema2;

import java.util.Scanner;

public class t2ej3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base");
        int base = scanner.nextInt();
        System.out.println("Introduce la altura");
        int altura = scanner.nextInt();
        double superficie= (double) base*altura/2;
        System.out.println("La superficie equivale a "+superficie);
    }
}
