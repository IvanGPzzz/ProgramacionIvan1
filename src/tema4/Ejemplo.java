package tema4;

public class Ejemplo {
    private static String nombre;
    private static int edad;
    public static final int edadDf = 0;

//Contstructores
//sin parámetros
    public Ejemplo() {
        nombre = "Peter";
        edad = edadDf;
    }
//parámetro nombre
    public Ejemplo(String nombre) {
        this.nombre = nombre;
        edad = edadDf;
    }
//parámetros nombre y edad
    public Ejemplo(String nombre, int edad) {
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
    public static void presentarme(Ejemplo persona) {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años.");
    }
    public void saludarA(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }
}
