package tema5.colecciones1;

public class GymUser {
    public String dni = "";
    private String nombre;
    private int edad;

    public GymUser() {
        dni = "";
        nombre = "";
        edad = 0;
    }

    public GymUser(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public String toString(){
        return "Nombre: " + nombre + "\nEdad: " + edad +  "\nDni: " + dni;
    }
}
