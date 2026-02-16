package tema4;

public class Personaa {
    String nombre;
    String dni;
    Cuenta[] cuentas;
    int accCont = 0;

    public Personaa() {
        nombre = "Nick";
        dni = "11111111A";
        cuentas = new Cuenta[3];
    }

    public Personaa(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentas = new Cuenta[3];
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public Cuenta[] getCuenta() {return cuentas;}
    public void setCuenta(Cuenta[] cuentas) {this.cuentas = cuentas;}
    public int getAccCont() {return accCont;}
    public void setaccCont(int accCont) {this.accCont = accCont;}

    public String toString() {
        return "Nombre: " + nombre + "\nDni: " + dni;
    }

//añadir cuenta y devolver si cabe
    public boolean addAcc(Cuenta c) {
        boolean anyadida= false;
        if  (accCont < 3) {
            cuentas[accCont] = c;
            accCont++;
            anyadida= true;
        }
        return anyadida;
    }

//moroso check
    public boolean esMoroso() {
        boolean moroso = false;
        for (int i = 0; i < accCont; i++) {
            if (cuentas[i].getSaldo() < 0) {
                 moroso = true;
            }
        }
        return moroso;
    }
}
