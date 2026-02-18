package tema5.colecciones1;

public class BankUser {
    private String nombre;
    private int edad;
    private String dni;

    public BankUser() {
        nombre = "";
        edad = 0;
        dni = "";
    }

    public BankUser(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getDni() {return dni;}
    public String getNombre() {return nombre;}
    public int getEdad() {return edad;}
    public void setDni(String dni) {this.dni = dni;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(int edad) {this.edad = edad;}

    public String toString() {
        return "Nombre: " + nombre +  "\nEdad: " + edad + "\nDni: " + dni;
    }

}
