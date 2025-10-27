package tema2;

public class T2EJ21 {
    public static void main(String[] args) {
        int par = 2;
        int suma = 0;
        while (par <= 1000) {
            suma = suma + par;
            par = par + 2;
        }
        System.out.println("La suma de los números pares entre 1 y 1000 es: " + suma);
    }
}