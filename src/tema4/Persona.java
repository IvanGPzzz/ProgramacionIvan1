package tema4;

public class Persona {
    String nombre;
    String apellido;
    int edad;
    final String dni;
    static final int adultAge = 18;
    static final int retiredAge = 65;

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

    public void ageDif(Persona persona1, Persona persona2) {
        int diferencia = persona1.edad - persona2.edad;
        if (diferencia == 0) {
            System.out.println("Ambas personas tienen la misma edad:");
        } else if (diferencia > 0) {
            System.out.println(persona1.nombre + " tiene " +diferencia + " años más que " +  persona2.nombre);
        } else {
            System.out.println(persona1.nombre + " tiene " +Math.abs(diferencia) + " años menos que " +  persona2.nombre);
        }
    }



    static public boolean checkDNI(String dni) {

        if (dni == null || dni.length() != 9) {
            return false;
        }

        String letras_dni = "TRWAGMYFPDXBNJZSQVHLCKE";
        String patron_dni = "^[0-9]{8}[A-Z]$";

        dni = dni.toUpperCase();
        if (!dni.matches(patron_dni)) {
            return false;
        }

        String parteNums = dni.substring(0, 8);
        char letraProporcionada = dni.charAt(8);
        int numero = Integer.parseInt(parteNums);
        char letraCorrecta = letras_dni.charAt(numero % 23);

        return letraProporcionada == letraCorrecta;
    }

}
