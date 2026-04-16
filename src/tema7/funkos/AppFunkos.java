package tema7.funkos;

import java.io.*;
import java.util.*;

public class AppFunkos {
    private static final String file = "funkos.csv";
    private static List<Funko> funkos = new ArrayList<>();
    private static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        int opcion;
        loadFunkos();
        showMenu();
        opcion = sc.nextInt();
        sc.nextLine();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    addFunko();
                    limpiarPantalla();
                    break;
                case 2:
                    deleteFunko();
                    limpiarPantalla();
                    break;
                case 3:
                    printFunkos();
                    limpiarPantalla();
                    break;
                case 4:
                    masCaro();
                    limpiarPantalla();
                    break;
                case 5:
                    mediaPrecio();
                    limpiarPantalla();
                    break;
                case 6:
                    clasificar();
                    limpiarPantalla();
                    break;
                case 7:
                    funkos2023();
                    limpiarPantalla();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    limpiarPantalla();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    limpiarPantalla();
            }
        }

    }

    public static void loadFunkos() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] dato = line.split(",");
                String id  = dato[0];
                String nombre = dato[1];
                String modelo = dato[2];
                double precio = Double.parseDouble(dato[3]);
                String fecha = dato[4];
                funkos.add(new Funko(id, nombre, modelo, precio, fecha));
            }
        } catch (IOException e) {
            System.err.println("No existe el archivo.");
        }
    }

    public static void addFunko() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los datos del funko:");
        System.out.println("ID: ");
        String id = sc.nextLine();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Modelo: ");
        String modelo = sc.nextLine();
        System.out.println("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("Fecha (AAAA-MM-DD): ");
        String fecha = sc.nextLine();
        funkos.add(new Funko(id, nombre, modelo, precio, fecha));
        saveFunkos();
        System.out.println("Funko añadido correctamente.");
    }

    public static void deleteFunko() {
        Funko funkoABorrar = null;
        System.out.println("Introduce el ID del funko a eliminar:");
        String funkoId = sc.nextLine();
        for  (Funko funko : funkos) {
            if(funkoId.equals(funko.getId())) {
                funkoABorrar = funko;
            }
        }
        if(funkoABorrar != null) {
            funkos.remove(funkos.indexOf(funkoABorrar));
            System.out.println("El funko " + funkoABorrar.getNombre() + " ha sido eliminado.");
            saveFunkos();
        } else {
            System.out.println("No se ha encontrado el funko.");
        }
    }

    public static void saveFunkos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for  (Funko funko : funkos) {
                bw.write(funko.toString());
            }
        } catch (IOException e) {
            System.err.println("No existe el archivo.");
        }
    }

    public static void printFunkos() {
        System.out.println("Lista de funkos:");
        for (Funko funko : funkos) {
            System.out.println(funko.getNombre());
        }
    }

    public static void masCaro() {
        double maxPrice = 0;
        String funkoCaro = "";
        for  (Funko funko : funkos) {
            if (funko.getPrecio() > maxPrice) {
                funkoCaro = funko.getNombre();
            }
        }
        System.out.println("El funko más caro es " + funkoCaro);
    }

    public static void mediaPrecio() {
        double total = 0;
        int cont = 0;
        double media = 0;
        for  (Funko funko : funkos) {
            total += funko.getPrecio();
            cont ++;
        }
        media = total / cont;
        System.out.println("La media de precio es " + media);
    }

    public static void clasificar() {
        Map<String, List<Funko>> modelos = new HashMap<>();
        for  (Funko funko : funkos) {
            String modelo = funko.getModelo();
            if(!modelos.containsKey(modelo)) {
                modelos.put(modelo, new ArrayList<>());
            }
            modelos.get(modelo).add(funko);
        }

        Set<String> keys = modelos.keySet();
        System.out.println("----CLASIFICACIÓN POR MODELO----");
        for  (String key : keys) {
            System.out.println("MODELO: " + key);
            List<Funko> funkosPorModelo = modelos.get(key);
            for(Funko funko : funkosPorModelo) {
                System.out.println(funko.getNombre());
            }
        }
    }

    public static void funkos2023() {
        System.out.println("Funkos lanzados a la venta en 2023:");
        for  (Funko funko : funkos) {
            if (funko.getFecha().startsWith("2023")) {
                System.out.println(funko.getNombre());
            }
        }
    }

    public static void showMenu() {
        System.out.println("¿Qué acción quieres realizar? Elige una opción: " +
                "1. Añadir funko." +
                "2. Borrar funko." +
                "3. Ver lista de funkos." +
                "4. ¿Cuál es el funko más caro?" +
                "5. ¿Cuál es la media de precio?" +
                "6. Ver lista de funkos clasificados por modelo." +
                "7. Ver funkos de 2023." +
                "0. Salir del programa.");
    }

    public static void limpiarPantalla() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.err.println("Error de carga." + e.getMessage());
        }
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
