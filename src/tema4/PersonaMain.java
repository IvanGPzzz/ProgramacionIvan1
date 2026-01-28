package tema4;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Iván", "García", 24, "12345678A");

        System.out.println("Introduce los datos de la persona: ");
        System.out.println("Nombre: ");
        persona1.setNombre(scan.nextLine());
        System.out.println("Apellido: ");
        persona1.setApellido(scan.nextLine());
        System.out.println("Edad: ");
        persona1.setEdad(scan.nextInt());
        System.out.println("DNI: ");

        if (persona1.isAdult()) {
            System.out.println(persona1.nombre + " es mayor de edad.");
        } else {
            System.out.println(persona1.nombre + " es menor de edad.");
        }

        if (persona1.isRetired()) {
            System.out.println(persona1.nombre + " está retiradx.");
        }  else {
            System.out.println(persona1.nombre + " no está retiradx.");
        }

        if (Persona.checkDNI("20957858M")) {
            System.out.println("checkDNI: trueee");
        }
    }
}
