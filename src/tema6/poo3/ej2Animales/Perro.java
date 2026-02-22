package tema6.poo3.ej2Animales;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void girar() {
        System.out.println(nombre + " gira persiguiendo su propia cola.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Woof! Woof!");
    }
}
