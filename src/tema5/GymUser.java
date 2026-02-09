package tema5;

public class GymUser {
    private String nombre;
    private int edad;

    public GymUser() {
        nombre = "";
        edad = 0;
    }

    public GymUser(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }
}
