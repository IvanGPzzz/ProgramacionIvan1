package tema8.formula;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AppF1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) throws InterruptedException {
        int opcion;
        do {
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    Piloto nuevo = datosPiloto();
                    PilotsCRUD.CreatePilot(nuevo);
                    limpiarPantalla();
                    break;
                case 2:
                    System.out.println(PilotsCRUD.ReadPilot(idPiloto()));
                    limpiarPantalla();
                    break;
                case 3:
                    System.out.println(PilotsCRUD.ReadPilots());
                    limpiarPantalla();
                    break;
                case 4:
                    Piloto editable = PilotsCRUD.ReadPilot(idPiloto());
                    if (editable != null) {
                        Piloto editado = datosPiloto();
                        editado.setIdPiloto(editable.getIdPiloto());
                        PilotsCRUD.UpdatePilot(editado);
                    }
                    limpiarPantalla();
                    break;
                case 5:
                    Piloto borrable = PilotsCRUD.ReadPilot(idPiloto());
                    if (borrable != null) {
                        PilotsCRUD.DeletePilot(borrable);
                    }
                    limpiarPantalla();
                    break;
                case 6:
                    PilotsCRUD.ShowPilotClassification();
                    limpiarPantalla();
                    break;
                case 7:
                    PilotsCRUD.ShowBuildersClassification();
                    limpiarPantalla();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    limpiarPantalla();
                    break;
                default:
                    System.err.println("Error. Opcion no válida.");
                    limpiarPantalla();
                    break;
            }
        } while (opcion != 8);

    }

    public static int idPiloto() {
        int idPiloto;
        System.out.println("Introduce el id del piloto: ");
        idPiloto = sc.nextInt();
        Piloto p = PilotsCRUD.ReadPilot(idPiloto);
        if (p == null) {
            System.err.println("Piloto no encontrado.");
        }
        return idPiloto;
    }

    public static Piloto datosPiloto() {
        System.out.println("Código: ");
        String codigo = sc.nextLine();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Fecha de nacimiento: ");
        String fechaNacimiento = sc.nextLine();
        Date fecha = Date.valueOf(fechaNacimiento);
        System.out.println("Nacionalidad: ");
        String nacionalidad = sc.nextLine();
        System.out.println("URL: ");
        String url = sc.nextLine();

        return new Piloto(0, codigo, nombre, apellido, fecha, nacionalidad, url);
    }

    public static void showMenu() {
        System.out.println("\n----CONSULTAS FORMULA 1----" +
                "\n1. Crear piloto." +
                "\n2. Leer piloto." +
                "\n3. Lista de pilotos." +
                "\n4. Editar piloto." +
                "\n5. Eliminar piloto." +
                "\n6. Mostrar clasificación de pilotos." +
                "\n7. Mostrar clasificación por equipos." +
                "\n8. Salir.");
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
