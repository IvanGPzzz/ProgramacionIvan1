package tema6.poo3.ej8AtquesAvanzado;

public class BolaFuego implements AtaqueAvanzado {
    @Override
    public void lanzar() {
        System.out.println("Lanzando ataque mixto");
    }
    @Override
    public String coste() {
        return "Coste: 50 poder / 0 energía";
    }
    @Override
    public String danioTotal() {
        return "Daño: 80 mágico / 0 físico";
    }
}
