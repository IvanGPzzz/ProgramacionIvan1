package tema7.ficheros;

import java.io.*;

public class Diccionario {
    //no supe hacerlo
    public static void main(String[] args){
        String file = "diccionario.txt";
        String carpeta = "Diccionario";
/*
        for(char a='A'; a<='Z'; a++){
            a.txt
        }
        char[] array = [abcdefgt]

 */

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String palabra = linea.trim();

                if (palabra.isEmpty()) {
                    char letra = Character.toUpperCase(palabra.charAt(0));
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo");
        }
    }
}