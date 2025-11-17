package tema3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class T3EJ10 {
    public static void main(String[] args) {
        System.out.print("Elige una opción:\n " +
                "a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos. \n");
        Scanner opcion = new Scanner(System.in);
        String eleccion = opcion.nextLine();
        switch (eleccion){
            case "a":

                Scanner signos = new Scanner(System.in);
                System.out.println("Introduce un nümero entero y diré si es positivo(1), negativo(-1) o cero(0)");
                int num = signos.nextInt();

                int valor = T3EJ1.numberSing(num);
                if (valor == -1) {
                    System.out.println("El número es negativo");
                }
                if (valor == 0) {
                    System.out.println("El número es cero");
                }
                if (valor == 1) {
                    System.out.println("El número es positivo");
                }
                break;

            case "b":
                Scanner anios = new Scanner(System.in);
                int edad;
                System.out.print("Ingrese el edad: ");
                edad = anios.nextInt();

                if (T3EJ2.esAdulto(edad)) {
                    System.out.println("La persona es mayor de edad");
                }
                break;

            case "c":
                Scanner radios = new Scanner(System.in);
                double rad;

                System.out.print("Ingrese el valor del radio: ");
                rad = radios.nextDouble();

                double perimeter = T3EJ3.CirclePerimeter(rad);
                double area = T3EJ3.CircleArea(rad);

                if (T3EJ3.validRadius(rad)){
                    System.out.println("El valor del perímetro es: " + perimeter + " y el valor del area es: " + area);
                } else {
                    System.out.println("El valor del radio no es valido");
                }
                break;

            case "d":
                T3EJ4.showMenu();
                Scanner value = new Scanner(System.in);
                DecimalFormat df = new DecimalFormat("0.00");

                int moneda = value.nextInt();
                double money;
                switch (moneda) {
                    case 1:
                        System.out.println("Introduce un precio en EUR:");
                        money = value.nextDouble();
                        System.out.println("USD: " + T3EJ4.euro2dollar(money));
                        break;
                    case 2:
                        System.out.println("Introduce un precio en USD:");
                        double eur = T3EJ4.dollar2eur(value.nextDouble());
                        System.out.println("EUR: " + eur);
                        break;
                    default:
                        System.out.println("Saliendo...");
                        break;
                }
                break;

            case "e":
                Scanner tablas = new Scanner(System.in);
                System.out.println("Introduce un número del 1 al 10: ");
                int num1  = tablas.nextInt();
                if (num1 > 0 && num1 < 11) {
                    System.out.println("La tabla de multiplicar de " + num1 + " es: \n");
                    for(int prod=0; prod < 11; prod++){
                        System.out.println(num1 + " * " + prod + " = " + T3EJ5.tablaMult(num1, prod));
                    }
                } else {
                    System.out.println("Valor inválido.");
                }
                break;

            case "f":
                for(int i =1; i < 11; i++){
                    System.out.println("\nLa tabla de multiplicar del " + i + " es: \n");
                    for (int prod = 0; prod < 11; prod++)
                    {System.out.println(i + " * " + prod + " = " + T3EJ5.tablaMult(i, prod));
                    }
                }
                break;

            case "g":
                Scanner primos = new Scanner(System.in);
                System.out.println("Digite un numero o introduzca un 0 para terminar: ");
                int numero = primos.nextInt();

                while (numero != 0) {
                    if (T3EJ7.esprimo(numero)) {
                        System.out.println("El número es primo");
                    }  else {
                        System.out.println("El número no es primo");
                    }
                    System.out.println("Digite otro numero: ");
                    numero = primos.nextInt();
                }
                System.out.println("Saliendo. . . ");
                break;

            case "h":
                Scanner fechas = new Scanner(System.in);
                System.out.print("Introduce el día (1-31): ");
                int dia = fechas.nextInt();

                System.out.print("Introduce el mes (1-12): ");
                int mes = fechas.nextInt();

                System.out.print("Introduce el año: ");
                int anio = fechas.nextInt();

                if (T3EJ8.esFechaValida(dia, mes, anio)) {
                    System.out.println("La fecha es correcta.");
                } else {
                    System.out.println("La fecha NO es correcta.");
                }
                break;

            case "i":
                Scanner triang = new Scanner(System.in);
                System.out.println("Introduce el numero: ");
                int numLineas = triang.nextInt();
                System.out.println("Introduce una letra: ");
                char letra = triang.next().charAt(0);

                for (int poslinea = 1; poslinea <= numLineas; poslinea++) {
                    System.out.println(T3EJ9.triangulo(numLineas, letra, poslinea));
                }
                break;
        }
    }
}
