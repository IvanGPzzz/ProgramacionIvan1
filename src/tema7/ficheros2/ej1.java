package tema7.ficheros2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce el nombre: ");
            nombre = sc.nextLine();
            System.out.println("Introduce el edad: ");
            edad = sc.nextInt();
        } while (nombre.isEmpty());

        if (escribir("usuarios.txt", nombre, edad)) {
            System.out.println("Usuario creado correctamente.");
        } else {
            System.out.println("El usuario no ha podido ser creado.");
        }
    }

    public static boolean escribir(String archivo, String nombre, int edad) {
        boolean escrito = false;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            bw.write("Nombre: " + nombre);
            bw.newLine();
            bw.write("Edad: " + edad);
        } catch (IOException e) {
            System.err.println("El archivo no existe.");
        }
        return escrito;
    }
}
