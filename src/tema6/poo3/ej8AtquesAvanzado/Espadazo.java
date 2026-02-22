package tema6.poo3.ej8AtquesAvanzado;

public class Espadazo implements AtaqueAvanzado {
    @Override
    public void lanzar() {
        System.out.println("Lanzando ataque mixto");
    }
    @Override
    public String coste() {
        return "Coste: 0 poder / 25 energía";
    }
    @Override
    public String danioTotal() {
        return "Daño: 0 mágico / 60 físico";
    }
}
