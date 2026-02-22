package tema6.poo3.ej2Animales;

public class Pajaro extends Animal {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void volar() {
        System.out.println(nombre + " alzó el vuelo.");
    }

    @Override
    public void hacerRuido() {
        System.out.println("Pío Pío");
    }
}
