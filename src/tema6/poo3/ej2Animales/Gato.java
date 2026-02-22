package tema6.poo3.ej2Animales;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void escupir() {
        System.out.println(nombre + " escupe una bola de pelo.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Mewww");
    }
}
