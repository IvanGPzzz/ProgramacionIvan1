package tema3;

import java.util.Scanner;

public class T3EJ4WIFI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hotel = new int[20];
        int habitacion;
        int potencia;

        //rellenamos el array con ceros
        for (int i = 0; i < hotel.length; i++){
            hotel[i] = 0;
        }

        //pedimos la habitacion 1-20
        do {
            System.out.println("¿En qué habitación vamos a instalar el router (1-20)?");
            habitacion = sc.nextInt();
            if (habitacion < 0 || habitacion > 20) {
                System.out.println("El nº de habitación no es valido");
            }
        } while (habitacion < 0 || habitacion > 20);

        int posicion = habitacion - 1;

        //pedimos la potencia del router
        do{
            System.out.println("¿Cual es la potencia del router (1-6)? ");
            potencia = sc.nextInt();
            if (potencia < 0 || potencia > 6){
                System.out.println("Potencia no valida, debe estar entre 0 y 6");

            }
        } while (potencia < 0 || potencia > 6);

        hotel[posicion] = potencia;

        //rellenamos las posiciones de la derecha según la potencia dada
        for (int i = posicion + 1; i < hotel.length; i++){
            int potenciad = hotel[i - 1];
            if (potenciad == 0) {
                break;
            }
            hotel[i] = potenciad - 1;
        }

        //rellenamos las posiciones de la izquierda según la potencia dada
        for (int i = posicion - 1; i >= 0; i--){
            int potenciai = hotel[i + 1];
            if (potenciai == 0) {
                break;
            }
            hotel[i] = potenciai - 1;
        }

        System.out.print("El router instalado en la habitación " + habitacion + " con potencia " + potencia + " envia esta señal:\n");
        MyArray.arrayPrinter(hotel);

    }
}
