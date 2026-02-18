package tema5.excepciones1;

import java.util.ArrayList;
import java.util.Scanner;


public class Exc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();

        System.out.println("\n----LISTADO DE GATOS----");
        while (gatos.size() < 5) {
            try {
                System.out.print("\nIntroduce los datos del " + (gatos.size() + 1) + "o: ");
                System.out.print("\nNombre: ");
                String nombre = sc.nextLine();
                System.out.print("\nEdad: ");
                int edad = Integer.parseInt(sc.nextLine());

                Gato newGato = new Gato(nombre, edad);
                gatos.add(newGato);
            } catch (Exception ex) {
                System.err.println("\nHubo un error en la creación del gato.\n" + ex.getMessage());
            }
        }

        for (Gato gato : gatos) {
            try {
                System.out.println("\nGato " + gatos.size() + ": ");
                gato.showGato();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
