package tema2;

import java.util.Scanner;

public class t2ej14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número de personas");
        int personas = scanner.nextInt();
        System.out.println("Número de días");
        int dias = scanner.nextInt();
        double precio = 15*personas*dias;
        if (personas>5){
            double precio_numeroso = precio * 0.75;
            System.out.println("El precio es " + precio_numeroso);
        }else{
            System.out.println("El precio es " + precio + "€");
             }
        }
}
