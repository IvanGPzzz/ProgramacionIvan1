package tema6.poo3;

import tema6.poo3.ej1Vehiculos.Turismo;
import tema6.poo3.ej1Vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class poo3Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        addCoche(vehiculos);
        System.out.println(vehiculos);
    }

    public static void addCoche(List<Vehiculo> vehiculos){
        String marca = "Honda";
        String modelo = "Civic";
        String color = "Negro";
        String matricula = "6767ZZZ";
        int plazas = 5;
        String uso = "Personal";

        vehiculos.add(new Turismo(marca, modelo, color, matricula, plazas, uso));
    }

    /*public static void addCamion(List<Vehiculo> vehiculos){
        String marca = "Honda";
        String modelo = "Civic";
        String color = "Rojo";
        String matricula = "1234YYY";
        int pMax = 1200;
        boolean mercPeligrosa = true;
    }*/
}
