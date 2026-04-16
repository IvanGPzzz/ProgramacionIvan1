package tema7.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NotasAlu {
    public static void main(String[] args) {
        String file = "/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos/alumnos_notas.txt";
        List<Alumno> alumnos = new ArrayList<>();
        int nota = 0;
        int total = 0;
        int cont = 0;
        int media = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line= br.readLine()) != null){
                total=0;
                cont=0;
                String[] alumno = line.split(" ");
                String nombre = alumno[0];
                String apellido = alumno[1];
                for(int i = 2; i < alumno.length; i++){
                    nota = Integer.parseInt(alumno[i]);
                    total += nota;
                    cont++;
                }
                media = total / cont;
                if (cont > 0){
                    alumnos.add(new Alumno(nombre+" "+apellido, media));
                }
            }

            Collections.sort(alumnos, new Comparator<Alumno>() {
                @Override
                public int compare(Alumno a1, Alumno a2) {
                    return a1.nombreCompleto.compareTo(a2.nombreCompleto);
                }
            });

            System.out.println("- Listado de alumnos:");
            for (Alumno alu : alumnos) {
                System.out.println(alu);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Alumno {
        String nombreCompleto;
        double media;
        public Alumno(String nombreCompleto, double media) {
            this.nombreCompleto = nombreCompleto;
            this.media = media;
        }
        @Override
        public String toString() {
            return nombreCompleto + ": " + media;
        }
    }
}
