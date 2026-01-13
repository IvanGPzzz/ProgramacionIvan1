package tema4;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private static final int adultAge = 18;
    private static final int retiredAge = 65;

    public Persona() {
        nombre = "";
        apellido = "";
        edad = 0;
        dni = "";
    }

    public Persona(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public boolean validarDni() {
        if(this.dni.length() != 9 || !Character.isLetter(this.dni.charAt(8))) {
        } return false;
    }

    public boolean isAdult() {
        if(this.edad >= adultAge) {
            return true;
        }
        return false;
    }

    public boolean isRetired() {
        if(this.edad > retiredAge) {
            return true;
        }
        return false;
    }

}
