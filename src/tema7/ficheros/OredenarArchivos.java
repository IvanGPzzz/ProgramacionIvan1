package tema7.ficheros;

import tema7.ficheros.Persona;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OredenarArchivos {
    public static void main(String args[]) throws IOException {
        String fileA = "/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos/usa_personas.txt";
        String fileB = "/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos/usa_personas_sorted.txt";
        List<Persona> personas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileA))){
            String line;
            while ((line = br.readLine()) != null) {
                String[] nom = line.split(" ");
                String nombre = nom[0];
                String apellido = nom[1];
                personas.add(new Persona(nombre + " " + apellido));
            }

            Collections.sort(personas, new Comparator<Persona>() {
                @Override
                public int compare(Persona p1, Persona p2) {
                    return p1.nombreCompleto.compareTo(p2.nombreCompleto);
                }
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File fichero = new File(fileB);
        try {
            if (fichero.createNewFile()) {
                System.out.println("El fichero se ha creado correctamente");
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
                    for (Persona pers : personas) {
                        bw.write(pers.nombreCompleto);
                        bw.newLine();
                    }
                    System.out.println("Nombres añadidos al nuevo archivo ordenados alfabéticamente.");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else System.out.println("El fichero no ha podido ser creado.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}