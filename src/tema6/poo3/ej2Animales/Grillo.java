package tema6.poo3.ej2Animales;

public class Grillo extends Animal {
    public Grillo(String nombre, int edad) {
        super(nombre, edad);
    }

    public void saltar() {
        System.out.println(nombre + " pega un salto.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Cri Cri");
    }
}
