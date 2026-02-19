package tema6.poo3;

public class Turismo extends Vehiculo {
    int plazas;
    String uso;

    public Turismo() {
        this("", "", "", "");
        plazas = 0;
        uso = "";
    }

    public Turismo(String marca, String modelo, String color, String matricula) {
        super(marca, modelo, color, matricula);
        this.plazas = plazas;
        this.uso = uso;
    }

}
