package tema6.poo3.ej7Ataques;

public class Magico implements Ataque {
    @Override
    public void lanzar() {
        System.out.println("Lanzando ataque mágico");
    }
    @Override
    public int coste() {
        return 50;
    }
    @Override
    public int danio() {
        return 80;
    }
}
