package tema6.poo3;

public class Ciclomotor extends Vehiculo {
    int cilindrada;

    public Ciclomotor() {
        this("","","","");
        cilindrada = 0;
    }

    public Ciclomotor(String marca, String modelo, String color, String matricula) {
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
}
