package tema6.poo4.ej1ITV;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Registro> colaITV = new ArrayList<>();
        Random rand = new Random();
        int tiempo=8;

        while(tiempo<18){
            Thread.sleep(1000);
            tiempo++;

            Vehiculo nuevo = generarVehiculo(rand);

            Registro registro = new Registro(tiempo, nuevo);
            colaITV.add(registro);

            System.out.println(registro);
        }
    }

    public static Vehiculo generarVehiculo(Random rand){
        int tipo = rand.nextInt(3);
        String matricula = "MAT-" + rand.nextInt(9999);
        switch (tipo){
            case 0: return new Turismo(matricula);
            case 1: return new Camion(matricula);
            default: return new Ciclomotor(matricula);
        }
    }
}
