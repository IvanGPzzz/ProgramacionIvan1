package tema3;

import java.util.Scanner;

public class MenuMyMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcionPrincipal;

        System.out.println("\n--- Menú de Funciones MyMath (Ejercicio 10) ---");
        System.out.print("Elige una opción:\n" +
                " a) Calcula áreas y perímetros.\n" +
                " b) Comprueba si un número es primo o no.\n" +
                " c) Comprueba el número de dígitos de un entero.\n" +
                " d) Comprueba el número de dígitos pares de un entero.\n" +
                " e) Comprueba el número de dígitos impares de un entero.\n" +
                " f) Calcula el factorial de un número (Iterativo).\n" +
                " g) Calcula el factorial de un número (Recursivo).\n" +
                " h) Comprueba cuántas soluciones tiene una ecuación de 2º grado.\n" +
                " i) Suma los dígitos de un número entero.\n" +
                " x) Salir del programa.\n" +
                "Opción: ");

        opcionPrincipal = sc.nextLine();

        switch (opcionPrincipal) {
            case "a":
                //He decidido hacer un submenu en los ejs que tenian varias funciones
                System.out.println("\n--- Submenú de Áreas y Perímetros ---");
                System.out.println("Elige una opción: \n" +
                        " a) Perímetro de un cuadrado.\n" +
                        " b) Área de un cuadrado.\n" +
                        " c) Perímetro de un rectángulo.\n" +
                        " d) Área de un rectángulo.\n" +
                        " e) Perímetro de un círculo\n" +
                        " f) Área de un círculo.\n" +
                        " g) Volver al menú principal.\n" +
                        "Opción: ");
                String opcion1 = sc.nextLine();

                switch (opcion1) {
                    case "a":
                        System.out.println("Introduce el lado del cuadrado:");
                        int lado = sc.nextInt();
                        sc.nextLine();
                        System.out.println("El perímetro es: " + MyMath.squarePerimeter(lado) + ".");
                        break;
                    case "b":
                        System.out.println("Introduce el lado del cuadrado:");
                        int ladoArea = sc.nextInt();
                        sc.nextLine();
                        System.out.println("El área es: " + MyMath.squareArea(ladoArea) + ".");
                        break;
                    case "c":
                        System.out.println("Introduce la base del rectángulo:");
                        int basePerim = sc.nextInt();
                        System.out.println("Introduce la altura del rectángulo:");
                        int alturaPerim = sc.nextInt();
                        sc.nextLine();
                        System.out.println("El perímetro es: " + MyMath.rectanglePerimeter(basePerim, alturaPerim) + ".");
                        break;
                    case "d":
                        System.out.println("Introduce la base del rectángulo:");
                        int baseArea = sc.nextInt();
                        System.out.println("Introduce la altura del rectángulo:");
                        int alturaArea = sc.nextInt();
                        sc.nextLine();
                        System.out.println("El área es: " + MyMath.rectangleArea(baseArea, alturaArea) + ".");
                        break;
                    case "e":
                        System.out.println("Introduce el radio del círculo:");
                        int radioPerim = sc.nextInt();
                        sc.nextLine();
                        System.out.println("El perímetro es: " + MyMath.circlePerimeter(radioPerim) + ".");
                        break;
                    case "f":
                        System.out.println("Introduce el radio del círculo:");
                        int radioArea = sc.nextInt();
                        sc.nextLine();
                        System.out.println("El área es: " + MyMath.circleArea(radioArea) + ".");
                        break;
                    case "g":
                        break;
                    default:
                        System.out.println("Opción no válida en el submenú de Áreas.");
                }
                break;

            case "b":
                //Aquí he hecho lo mismo,  no sabía si usar las dos funciones en un mismo case o por separado
                System.out.println("\n--- Submenú de Comprobación de Primos ---");
                System.out.println("Elige una opción: \n" +
                        " a) Comprobar si es primo (Usando 'esPrimo').\n" +
                        " b) Comprobar si NO es primo (Usando 'noEsPrimo').\n" +
                        " c) Volver al menú principal.\n" +
                        "Opción: ");
                String opcion2 = sc.nextLine();

                int numPrimo;

                switch (opcion2) {
                    case "a":
                        System.out.println("Introduce un número entero:");
                        numPrimo = sc.nextInt();
                        sc.nextLine();
                        if (MyMath.esPrimo(numPrimo)) {
                            System.out.println("El número " + numPrimo + " ES primo.");
                        } else {
                            System.out.println("El número " + numPrimo + " NO es primo.");
                        }
                        break;
                    case "b":
                        System.out.println("Introduce un número entero:");
                        numPrimo = sc.nextInt();
                        sc.nextLine();
                        if (MyMath.noEsPrimo(numPrimo)) {
                            System.out.println("El número " + numPrimo + " NO es primo (es compuesto).");
                        } else {
                            System.out.println("El número " + numPrimo + " ES primo.");
                        }
                        break;
                    case "c":
                        break;
                    default:
                        System.out.println("Opción no válida en el submenú de Primos.");
                }
                break;
            case "c":
                System.out.println("Introduce un número entero:");
                int numDigitos = sc.nextInt();
                sc.nextLine();
                System.out.println("El número de dígitos es: " + MyMath.contDigit(numDigitos));
                break;
            case "d":
                System.out.println("Introduce un número entero:");
                int numDigitosPar = sc.nextInt();
                sc.nextLine();
                System.out.println("El número de dígitos pares es: " + MyMath.contDigitPar(numDigitosPar));
                break;
            case "e":
                System.out.println("Introduce un número entero:");
                int numDigitosImpar = sc.nextInt();
                sc.nextLine();
                System.out.println("El número de dígitos impares es: " + MyMath.contDigitImpar(numDigitosImpar));
                break;
            case "f":
                System.out.println("Introduce un número entero para calcular su factorial (Iterativo):");
                int numFact = sc.nextInt();
                sc.nextLine();
                if (numFact < 0) {
                    System.out.println("El factorial solo está definido para números enteros no negativos.");
                } else {
                    System.out.println("El factorial de " + numFact + " es: " + MyMath.factorial(numFact));
                }
                break;
            case "g":
                System.out.println("Introduce un número entero para calcular su factorial (Recursivo):");
                int numFactRec = sc.nextInt();
                sc.nextLine();
                if (numFactRec < 0) {
                    System.out.println("El factorial solo está definido para números enteros no negativos.");
                } else {
                    System.out.println("El factorial (recursivo) de " + numFactRec + " es: " + MyMath.factorialRecurs(numFactRec));
                }
                break;
            case "h":
                System.out.println("Introduce el coeficiente 'a' de la ecuación de segundo grado (ax^2 + bx + c = 0):");
                int a = sc.nextInt();
                System.out.println("Introduce el coeficiente 'b':");
                int b = sc.nextInt();
                System.out.println("Introduce el coeficiente 'c':");
                int c = sc.nextInt();
                sc.nextLine();
                double soluciones = MyMath.ecuacion(a, b, c);
                System.out.println("La ecuación ("+a+"x^2 + "+b+"x + "+c+" = 0) tiene " + (int)soluciones + " solución(es) real(es).");
                break;
            case "i":
                System.out.println("Introduce un número entero para sumar sus dígitos:");
                int numSuma = sc.nextInt();
                sc.nextLine();
                System.out.println("La suma de los dígitos de " + numSuma + " es: " + MyMath.sumDigit(numSuma));
                break;
            case "x":
                System.out.println("Saliendo del programa. ¡Adiós!");
                break;
            default:
                System.out.println("Opción no válida. El programa finalizará.");
        }

        sc.close();
    }
}