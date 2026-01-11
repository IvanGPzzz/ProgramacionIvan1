package tema4;

public class Persona {
    private static String nombre;
    private static int edad;
    public static final int edadDf = 0;

//Contstructores
//sin parámetros
    public Persona() {
        nombre = "Peter";
        edad = edadDf;
    }
//parámetro nombre
    public Persona (String nombre) {
        this.nombre = nombre;
        edad = edadDf;
    }
//parámetros nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

// Getters y Setters
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0)
            this.edad = edad;
    }

//metodo estático showInfo
    public static void showInfo() {
        System.out.println("Las personas tienen nombre y edad.");
    }

    public void saludar() {
        System.out.println("¡Hola!");
    }
    public static void presentarme(Persona persona) {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
    public void saludarA(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }
}
