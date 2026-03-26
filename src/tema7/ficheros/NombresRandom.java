package tema7.ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NombresRandom {
    public static void main(String[] args) {
        //String fileA = "/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos/usa_nombres.txt";
        String fileA = "src/tema7/ficheros/Documentos/usa_nombres.txt";
        String fileB = "/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos/usa_apellidos.txt";
        String fileC = "/Users/ivangarciapaz/IdeaProjects/ProgramacionIvan1/src/tema7/ficheros/Documentos/usa_personas.txt";
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int cant;
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileA))){
            String line;
            while((line= br.readLine()) != null){
                if(!line.trim().isEmpty()){
                    nombres.add(line.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileB))){
            String line;
            while((line= br.readLine()) != null){
                if(!line.trim().isEmpty()){
                    apellidos.add(line.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        do{
            System.out.println("¿Cuantos nombres aleatorios desea añadir?");
            while (!sc.hasNextInt()) {
                System.out.println("Introduce un número.");
                sc.next();
            }
            cant = sc.nextInt();
            if(cant<=0) System.out.println("El número debe ser superior a 0.");
        } while (cant <= 0);


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileC, true))){
            bw.newLine();
            bw.write("---Nuevos nombres---");
            for(int i = 0; i < cant; i++){
                String randNom = nombres.get(rand.nextInt(nombres.size()));
                String randApe = apellidos.get(rand.nextInt(apellidos.size()));

                bw.newLine();
                bw.write(randNom + " " + randApe);
            }
            System.out.println(cant + " nombres añadidos correctamente.");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
