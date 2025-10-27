import java.util.Scanner;
import java.util.Random;

public class T2EJ28 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroLoteria = rand.nextInt(100000);
        System.out.println("Número de la lotería generado (0 a 99999).");
        for (int intentos = 1; intentos <= 5; intentos++) {
            System.out.print("Introduce un número (0 a 99999) para el intento " + intentos + ": ");
            int numeroUsuario = sc.nextInt();
            if (numeroUsuario == numeroLoteria) {
                System.out.println("¡Felicidades! Has ganado!");

            } else {
                System.out.println("No has ganado.");
            }
            if (intentos == 5) {
                System.out.println("Se acabaron los intentos. El número de la lotería era: " + numeroLoteria);
            }
        }

        sc.close();
    }
}
