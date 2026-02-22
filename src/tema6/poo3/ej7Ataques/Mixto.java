package tema6.poo3.ej7Ataques;

public class Mixto implements Ataque {
    @Override
    public void lanzar() {
        System.out.println("Lanzando ataque mixto");
    }
    @Override
    public int coste() {
        return 75;
    }
    @Override
    public int danio() {
        return 140;
    }
}
