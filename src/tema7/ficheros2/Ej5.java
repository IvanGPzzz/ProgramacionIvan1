package tema7.ficheros2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ej5 {
    public static void main(String[] args) {
        Persona p;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            p = (Persona) ois.readObject();
            System.out.println(p);
        } catch (IOException e) {
            System.err.println("No existre el archivo." + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("No existre la clase." + e.getMessage());
        }
    }
}
