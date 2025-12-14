package tema3;

import  java.util.Scanner;

public class T3EJ2CESAR {
    public static String encrypt(String mensaje) {

        String mensajeMayusculas = mensaje.toUpperCase();
        StringBuilder cifrado = new StringBuilder();

        for (char caracter : mensajeMayusculas.toCharArray()) {

            if (caracter >= 'A' && caracter <= 'Z') {
                if (caracter == 'Z') {
                    cifrado.append('A');
                } else {
                    cifrado.append((char) (caracter + 1));
                }
            } else if (caracter >= '0' && caracter <= '9') {
                if (caracter == '9') {
                    cifrado.append('0');
                } else {
                    cifrado.append((char) (caracter + 1));
                }
            } else {
                cifrado.append(caracter);
            }
        }
        return cifrado.toString();
    }

    public static String decrypt(String mensajeCifrado) {
        if (mensajeCifrado == null || mensajeCifrado.isEmpty()) {
            return mensajeCifrado;
        }

        StringBuilder descifrado = new StringBuilder();

        for (char caracter : mensajeCifrado.toCharArray()) {

            if (caracter >= 'A' && caracter <= 'Z') {
                if (caracter == 'A') {
                    descifrado.append('Z');
                } else {
                    descifrado.append((char) (caracter - 1));
                }
            } else if (caracter >= '0' && caracter <= '9') {

                if (caracter == '0') {
                    descifrado.append('9');
                } else {
                    descifrado.append((char) (caracter - 1));
                }
            } else {
                descifrado.append(caracter);
            }
        }
        return descifrado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Cifrado de Julio César (+1) ---");
        System.out.print("Introduce el mensaje a cifrar: ");

        String mensajeOriginal = scanner.nextLine();

        // El cifrado se realiza sobre el texto ingresado
        String mensajeCifrado = encrypt(mensajeOriginal);
        String mensajeDescifrado = decrypt(mensajeCifrado);

        System.out.println("\n-------------------------------------");
        System.out.println("Mensaje original:    " + mensajeOriginal.toUpperCase());
        System.out.println("Mensaje cifrado:     " + mensajeCifrado);
        System.out.println("Mensaje descifrado:  " + mensajeDescifrado);
        System.out.println("-------------------------------------");
    }
}
