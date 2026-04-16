package tema7.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxyMin {
    public static void main(String[] args) {
        String file = "/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos/numeros.txt";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean empty = true;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] numeros = line.split(" ");
                for (String numero : numeros) {
                    if (!numero.trim().isEmpty()) {
                        int num = Integer.parseInt(numero.trim());
                        if (num > max) {max=num;}
                        if (num < min) {min=num;}
                        empty = false;
                    }
                }
            }
            if (!empty) {
                System.out.println("El mayor número es: " + max + ".");
                System.out.println("El menor numero es: " + min + ".");
            } else {
                System.err.println("El archivo está vacío.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}