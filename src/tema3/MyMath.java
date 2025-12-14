package tema3;

import java.util.Scanner;

public class MyMath {
//EJ1
//squarePerimeter
    public static double squarePerimeter (int lado){
        double perimetro = lado*4;
        return perimetro;
    }
//squareArea
    public static double squareArea (int lado){
        double area = lado*lado;
        return area;
    }
//rectanglePerimeter
    public static double rectanglePerimeter (int base, int altura){
        double perimetro = base*2 + altura*2;
        return perimetro;
    }
//rectangleArea
    public static double rectangleArea (int base, int altura){
        double area = base*altura;
        return area;
    }
//circlePerimeter
    public static double circlePerimeter (int radio){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
//circleArea
    public static double circleArea (int radio){
        double area = Math.PI * radio * radio;
        return area;
    }

//EJ2
//esPrimo
    public static boolean esPrimo (int numero) {
        if (numero == 1){
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if ((numero % i) == 0) {
                return false;
            }
        }
        return true;
    }
//noEsPrimo
    public static boolean noEsPrimo (int numero) {
        return !esPrimo(numero);
    }

//EJ3 contDigit
    public static int contDigit(int numero){
        int cifras = 0;
        if (numero == 0) {
            cifras = 1;
        } else {
            while (numero > 0 || numero < 0) {
                numero = numero / 10;
                cifras++;
            }
        }
        return cifras;
    }

//EJ4 contDigitPar
    public static int contDigitPar(int numero){
        int cifras_pares = 0;
        if (numero == 0) {
            cifras_pares = 1;
        } else {
            while (numero > 0 || numero < 0) {
                if (numero%2==0){cifras_pares++;}
                numero = numero / 10;
            }
        }
        return cifras_pares;
    }

//EJ5 contDigitImpar
    public static int contDigitImpar(int numero){
        int cifras_impares = 0;
        if (numero == 0) {
            cifras_impares = 0;
        } else {
            while (numero > 0 || numero < 0) {
                if (numero%2!=0){cifras_impares++;}
                numero = numero / 10;
            }
        }
        return cifras_impares;
    }

//EJ6 factorial
    public static double factorial(int numero){
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }

//EJ7 factorialRecurs
    public static double factorialRecurs(int numero){
        if (numero <= 1) {
            return 1;
        } else {
            return numero * factorialRecurs(numero - 1);
        }
    }

//EJ8 ecuacion
    public static double ecuacion(int a, int b, int c){
        int discriminante = b*b - 4*a*c;
        if (discriminante > 0) {
            return 2;
        } else if (discriminante == 0) {
            return 1;
        } else {
            return 0;
        }
    }

//EJ9 sumDigit
    public static int sumDigit(int numero){
        int suma = 0;
        while (numero > 0) {
            suma = suma + (numero % 10);
            numero = numero / 10;
        }
        return suma;
    }
}