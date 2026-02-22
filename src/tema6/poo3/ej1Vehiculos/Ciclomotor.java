package tema6.poo3.ej1Vehiculos;

public class Ciclomotor extends Vehiculo {
    int cilindrada;

    public Ciclomotor() {
        this("","","","", 0);
    }

    public Ciclomotor(String marca, String modelo, String color, String matricula, int cilindrada) {
        super(marca, modelo, color, matricula);
        this.cilindrada = cilindrada;
    }

    public boolean carneReq(int cilindrada) {
        boolean carne = true;
        if (cilindrada>125) {
            carne = false;
        }
        return carne;
    }

    public String toString(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color + "\nMatricula: " + matricula + "\nCilindrada: " +  cilindrada;
    }
}
