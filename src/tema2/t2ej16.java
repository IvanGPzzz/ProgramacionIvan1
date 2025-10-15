package tema2;

import java.util.Scanner;

public class t2ej16 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cantidad");
        int valor = scanner.nextInt();
        System.out.println("Indica la moneda con 'E' o 'D'");
        char moneda = scanner.next().charAt(0);
        if (moneda == 'E'){
            double conversion = valor*1.16;
            System.out.println("El resultado de la conversión es "+conversion);
        }else if (moneda =='D'){
            double conversion = valor*0.86;
            System.out.println("El resultado de la conversión es "+conversion);
        }
    }
}
