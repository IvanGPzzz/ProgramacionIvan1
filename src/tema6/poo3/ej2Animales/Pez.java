package tema6.poo3.ej2Animales;

public class Pez extends Animal {
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Glup Glup");
    }
}
