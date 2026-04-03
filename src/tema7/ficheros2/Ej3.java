package tema7.ficheros2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {
        File texto = new File("texto.txt");
        int numPalabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(texto))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[]palabras = linea.toLowerCase().split("\\W+");
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        numPalabras++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("El archivo no existe.");
        }

        System.out.println("Hay un total de " + numPalabras + " palabras en el ficehero.");
    }
}
