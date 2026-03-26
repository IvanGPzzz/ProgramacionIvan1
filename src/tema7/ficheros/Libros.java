package tema7.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Libros {
    public static void main(String[] args) {
        File archivo = new File("/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos//Libros/lazarillo.txt");
        int numLineas = 0;
        int numPalabras = 0;
        int numCaracteres = 0;
        Map<String, Integer> mapa = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null){
                numLineas++;
                numCaracteres += linea.length();

                String[] palabras = linea.toLowerCase().split("\\W+");

                for (String palabra : palabras) {
                    if (palabra.isEmpty()) continue;
                    numPalabras++;
                    mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo.");
        }

        printear(numLineas, numPalabras, numCaracteres, mapa);
    }

    public static void printear(int lineas,  int palabras, int caracteres, Map<String, Integer> mapa){
        System.out.println("Numero de lineas: " + lineas);
        System.out.println("Numero de palabras: " + palabras);
        System.out.println("Numero de caracteres: " + caracteres);
        System.out.println("Palabras más comunes: ");

        mapa.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(e -> System.out.println("- '" + e.getKey() + "' se repite " + e.getValue() + " veces."));

    }
}
