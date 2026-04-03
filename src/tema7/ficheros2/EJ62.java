package tema7.ficheros2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class EJ62 {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))){
            ArrayList<Persona> listaPersonas = (ArrayList<Persona>) ois.readObject();

            System.out.println("Lista de personas: ");
            for (Persona persona : listaPersonas) {
                System.out.println(persona);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer la lista.");
        }
    }
}
