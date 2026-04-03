package tema7.ficheros2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ej4 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Iván", 24);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(p1);
            System.out.println("Objeto serializada correctamente.");
        } catch (IOException e) {
            System.err.println("Error serializando persona.");
        }
    }
}
