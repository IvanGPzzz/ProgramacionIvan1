package tema6.poo3.ej1Vehiculos;

public class Camion extends Vehiculo {
    int pMax;
    boolean mercPeligrosa;

    public Camion() {
        this("", "", "", "", 0, false);
    }

    public Camion (String marca, String modelo, String color, String matricula, int pMax, boolean mercPeligrosa) {
        super(marca, modelo, color, matricula);
        this.pMax =  pMax;
        this.mercPeligrosa = mercPeligrosa;
    }

    public String toString(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color + "\nMatricula: " + matricula + "\nPeso máximo: " + pMax + "\nMercancía peligrosa: " +  mercPeligrosa;
    }

}
