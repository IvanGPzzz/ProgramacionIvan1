package tema3;

import java.util.Scanner;

public class T3EJ3 {

    public static boolean validRadius(double rad){
        if (rad > 0){
            return true;
        }
        else return false;
    }

    public static double CirclePerimeter(double rad){
        return rad * 2 * Math.PI;
    }

    public static double CircleArea(double rad){
        return Math.PI * rad * rad;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rad;

        /*do {
            System.out.print("Ingrese el valor del radio: ");
            rad = input.nextDouble();

            double perimeter = CirclePerimeter(rad);
            double area = CircleArea(rad);

            if (!validRadius(rad)) {
                System.out.println("El valor del radio no es valido");
            } else {
                System.out.println("El valor del radio es: " + perimeter + " y el valor del area es: " + area);
                break;
            }

        } while (validRadius(rad));*/

        System.out.print("Ingrese el valor del radio: ");
        rad = input.nextDouble();

        double perimeter = CirclePerimeter(rad);
        double area = CircleArea(rad);

        if (validRadius(rad)){
            System.out.println("El valor del perímetro es: " + perimeter + " y el valor del area es: " + area);
        } else {
            System.out.println("El valor del radio no es valido");
        }
    }
}
