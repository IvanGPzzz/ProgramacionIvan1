package tema7.ficheros2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej2 {
    public static void main(String[] args) {
        String usuarios = "usuarios.txt";

        System.out.println("Listado de usuarios: ");
        leer(usuarios);
    }

    public static void leer(String archivo){
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = (br.readLine())) != null) {
                System.out.println(linea);
            }
        } catch (IOException e){
            System.err.println("No existe el archivo.");
        }
    }
}
