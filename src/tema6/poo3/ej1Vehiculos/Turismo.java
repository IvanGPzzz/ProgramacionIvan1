package tema6.poo3.ej1Vehiculos;

public class Turismo extends Vehiculo {
    int plazas;
    String uso;

    public Turismo() {
        this("", "", "", "", 0, "");
    }

    public Turismo(String marca, String modelo, String color, String matricula, int plazas, String uso) {
        super(marca, modelo, color, matricula);
        this.plazas = plazas;
        this.uso = uso;
    }

    public String toString(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nColor: " + color +  "\nMatricula: " + matricula + "\nPlazas: " + plazas + "\nUso: " + uso;
    }

}
