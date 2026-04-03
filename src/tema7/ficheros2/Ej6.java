package tema7.ficheros2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ej6 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("Maria", 35));
        personas.add(new Persona("Pedro", 25));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(personas);
            System.out.println("ArrayList serializada correctamente.");
        } catch (IOException e) {
            System.err.println("Error serializando el ArrayList.");
        }
    }
}
