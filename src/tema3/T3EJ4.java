package tema3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T3EJ4 {
    public static double euro2dollar(double value){
        return value * 1.16;
    }
    public static double dollar2eur(double value){
        return value * 0.86;
    }
    public static void showMenu() {
        System.out.println("Elige una conversión:");
        System.out.println("1. Euro->dólar");
        System.out.println("2. Dólar->euro");
        System.out.println("Otro->Salir");
    }
    public static void main(String[] args) {
        showMenu();
        Scanner value = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int moneda = value.nextInt();
        double money;
        switch (moneda) {
            case 1:
                System.out.println("Introduce un precio en EUR:");
                money = value.nextDouble();
                System.out.println("USD: " + euro2dollar(money));
                break;
            case 2:
                System.out.println("Introduce un precio en USD:");
                double eur = dollar2eur(value.nextDouble());
                System.out.println("EUR: " + eur);
                break;
            default:
                System.out.println("Saliendo...");
                break;
        }
    }
}
