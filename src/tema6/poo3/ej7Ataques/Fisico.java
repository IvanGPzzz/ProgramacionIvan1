package tema6.poo3.ej7Ataques;

public class Fisico implements Ataque {
    @Override
    public void lanzar() {
        System.out.println("Lanzando ataque físico");
    }
    @Override
    public int coste() {
        return 25;
    }
    @Override
    public int danio() {
        return 60;
    }
}
