package tema6.poo3.ej2Animales;

public abstract class Animal {
    String nombre;
    int edad;

    public Animal() {
        nombre = "";
        edad = 0;
    }
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + ": 'ZZZzzzzZZzzz'");
    }

    public abstract void hacerRuido();

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad;
    }
}
