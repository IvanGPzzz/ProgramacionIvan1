package tema6.poo4.ej1ITV;

public class Registro {
    private int entrada;
    private Vehiculo vehiculo;
    public Registro(int entrada,Vehiculo vehiculo) {
        this.entrada = entrada;
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Entrada del " + vehiculo + " a las " + entrada + ".";
    }
}
