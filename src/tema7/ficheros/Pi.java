package tema7.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el valor que buscar en Pi: ");
            input = sc.nextLine();
        } while (input.isEmpty());

        boolean encontrado = buscar("/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos/pi-million.txt", input);

        if(encontrado){
            System.out.println("El número " + input + " existe en Pi.");
        } else {
            System.out.println("El número " + input + " NO existe en Pi.");
        }
    }

//Strings.contains("123")

    public static boolean buscar(String archivo, String input) {
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            char[] numero = input.toCharArray();
            int c;
            char[] seccion = new char[numero.length];
            int leidos = 0;

            while ((c = br.read()) != -1 && !encontrado) {
                char letraActual = (char) c;
                for (int i = 0; i < seccion.length - 1; i++) {
                    seccion[i] = seccion[i + 1];
                }
                seccion[seccion.length - 1] = letraActual;
                leidos++;

                if (leidos >= numero.length) {
                    if (sonIguales(seccion, numero)) {
                        encontrado = true;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
        }
        return encontrado;
    }

    public static boolean sonIguales(char[] a, char[] b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
