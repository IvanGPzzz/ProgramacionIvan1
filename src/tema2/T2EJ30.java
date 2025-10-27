package tema2;

import java.util.Scanner;

public class T2EJ30 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operacion;
        Scanner sc = new Scanner(System.in);
        String salir="";

        System.out.println("Bienvenido a la calculadora. Escribe 'salir' para terminar.");

        while (!salir.equals("salir")){
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();

            System.out.print("Introduce la operación (+, -, *, /, %): ");
            operacion = sc.next();

            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();

            double resultado = 0;
            boolean operacionValida = true;

            switch (operacion) {
                case "+": resultado = num1 + num2; break;
                case "-": resultado = num1 - num2; break;
                case "*": resultado = num1 * num2; break;
                case "/":
                    if (num2 != 0) resultado = num1 / num2;
                    else {
                        System.out.println("Error: División entre cero.");
                        operacionValida = false;
                    }
                    break;
                case "%":
                    if (num2 != 0) resultado = num1 % num2;
                    else {
                        System.out.println("Error: División entre cero.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida.");
                    operacionValida = false;
            }
            if (operacionValida) {
                System.out.println("Resultado: " + resultado);
            }

            System.out.println(" ");
            System.out.println("Escribe 'salir'  para terminar.");
            salir = sc.nextLine();
            salir = sc.nextLine();
        }
        System.out.println("Sesión finalizada.");
        sc.close();
    }
}
