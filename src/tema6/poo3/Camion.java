package tema6.poo3;

public class Camion extends Vehiculo {
    int pMax;
    boolean mercPeligrosa;

    public Camion() {
        this("", "", "", "");
        pMax =  0;
        mercPeligrosa = false;
    }

    public Camion (String marca, String modelo, String color, String matricula) {
        super(marca, modelo, color, matricula);
        this.pMax =  pMax;
        this.mercPeligrosa = mercPeligrosa;
    }

}
