package tema2;

public class T2EJ27 {
    public static void main(String[] args) {
        int cantidad = 20;
        int primos = 0;
        int numero = 2;

        while (primos < cantidad) {
            boolean esPrimo = true;
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(numero);
                primos++;
            }
            numero++;
        }
    }
}
