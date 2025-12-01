package tema3;

import java.util.Scanner;

public class MyArray {
    //1a arrayPrinter
    public static void arrayPrinter (int[]array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1){
                System.out.print(", ");
            };
        }
        System.out.println("]");
    }

    //1b maxArray
    public static int maxArray (int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //1c minArray
    public static int minArray (int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (i==0 && min==0){
                min = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //1d avgArray
    public static double avgArray (int[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        return avg / array.length;
    }

    //1e intoArray
    public static boolean intoArray (int[] array, int valor) {
        boolean found = false;
        for (int i = 0; i < array.length && !found; i++) {
            if (array[i] == valor) {
                found= true;
            }
        }
        return found;
    }

    //1f sumArray
    public static int[] sumArray (int[] array, int[] array2) {
        int[] suma = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            suma[i] += array[i] + array2[i];
        }
        return suma;
    }

    //1g restArray
    public static int[] restArray (int[] array, int[] array2) {
        int[] rest = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rest[i] += array[i] - array2[i];
        }
        return rest;
    }

    //1h escalarArray
    public static int[] escalarArray (int[] array, int[] array2) {
        int[] escalar = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            escalar[i] += array[i] * array2[i];
        }
        return escalar;
    }

    //1i reverseArrayF (función)
    public static int[] reverseArrayF (int[] array) {
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        return array;
    }

    //1j reverseArrayP (procedimiento)
    public static void reverseArrayP (int[] array) {
        int first = 0;
        int last = array.length - 1;
        while (first < last) {
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
    }

    //1k cicArray
    public static boolean cicArray (int[] array) {
        int cap = 0;
        int cua = array.length - 1;
        while (array[cap] < array[cua]) {
            if (array[cap] != array[cua]) {
                return false;
            }
            cap++;
            cua--;
        }
        return true;
    }

    //menuArrays MENÚ PARA TODAS LAS FUNCIONES DE ARRAYS
    private static Scanner scanner = new Scanner(System.in);

    //LEER UN ARRAY
    public static int[] readOneArray() {
        System.out.print("\n Introduce la longitud del array: ");
        int longitud = scanner.nextInt();

        int[] array = new int[longitud];
        System.out.println("Introduce los " + longitud + " elementos:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //LEER DOS ARRAYS
    public static int[][] readTwoArrays() {
        System.out.print("\n Introduce la longitud de AMBOS arrays (deben ser iguales): ");
        int longitud = scanner.nextInt();

        int[] array1 = new int[longitud];
        int[] array2 = new int[longitud];

        System.out.println("\nIntroduce los elementos del PRIMER array:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Array 1 - Elemento [" + i + "]: ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("\nIntroduce los elementos del SEGUNDO array:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Array 2 - Elemento [" + i + "]: ");
            array2[i] = scanner.nextInt();
        }

        return new int[][]{array1, array2};
    }

    //METODO MENU
    public static void menuArrays() {
        System.out.println("MENÚ DE OPERACIONES CON ARRAYS");
        System.out.println("\nOPCIONES CON UN ARRAY:");
        System.out.println(" a. Imprimir array (arrayPrinter)");
        System.out.println(" b. Máximo (maxArray)");
        System.out.println(" c. Mínimo (minArray)");
        System.out.println(" d. Media (avgArray)");
        System.out.println(" e. Contiene valor (intoArray)");
        System.out.println(" i. Invertir (reverseArrayF - función)");
        System.out.println(" j. Invertir (reverseArrayP - procedimiento)");
        System.out.println(" k. Es capicúa (cicArray)");
        System.out.println("\nOPCIONES CON DOS ARRAYS (misma longitud):");
        System.out.println(" f. Suma de componentes (sumArray)");
        System.out.println("g. Resta de componentes (restArray)");
        System.out.println("h. Producto escalar (escalarArray)");
        System.out.println(" x. Salir");

        System.out.print("\n Elige una opción: ");

        String opcion = scanner.nextLine();

        int[] array1;

        switch (opcion) {
            //OPCIONES CON UN ARRAY
            case "a":
            case "b":
            case "c":
            case "d":
            case "e":
            case "i":
            case "j":
            case "k":
                array1 = readOneArray();

                switch (opcion) {
                    case "a": MyArray.arrayPrinter(array1); break;
                    case "b": System.out.println("Máximo: " + maxArray(array1)); break;
                    case "c": System.out.println("Mínimo: " + minArray(array1)); break;
                    case "d": System.out.println("Media (AVG): " + avgArray(array1)); break;
                    case "e": {
                        System.out.print("Valor a buscar: ");
                        int valor = scanner.nextInt();
                        System.out.println("¿Contiene " + valor + "? " + intoArray(array1, valor));
                        break;
                    }
                    case "i": {
                        int[] invertido = MyArray.reverseArrayF(array1);
                        System.out.print("Array invertido (función): ");
                        arrayPrinter(invertido);
                        break;
                    }
                    case "j": {
                        MyArray.reverseArrayP(array1);
                        System.out.print("Array invertido (procedimiento): ");
                        MyArray.arrayPrinter(array1);
                        break;
                    }
                    case "k":
                        if (cicArray(array1)) {
                            System.out.println("El array SÍ es capicúa.");
                        } else {
                            System.out.println("El array NO es capicúa.");
                        }
                    break;
                }
                break;

            //OPCIONES CON DOS ARRAYS
            case "f":
            case "g":
            case "h": {
                int[][] arrays = readTwoArrays();

                array1 = arrays[0];
                int[] array2 = arrays[1];

                switch (opcion) {
                    case "f": System.out.println("Suma de componentes: ");
                    arrayPrinter(sumArray(array1, array2)); break;
                    case "g": System.out.println("Resta de componentes: ");
                    arrayPrinter(restArray(array1, array2)); break;
                    case "h": System.out.println("Producto escalar: ");
                        arrayPrinter(escalarArray(array1, array2)); break;
                }
                break;
            }

            default:
                System.out.println("Saliendo ...");
                break;
        }
    }

    //METODO MAINN
    public static void main(String[] args) {
        menuArrays();
        scanner.close();
    }

}
