package tema2;

import java.util.Scanner;

public class t2ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int A = scanner.nextInt();
        System.out.println("Introduce otro número");
        int B = scanner.nextInt();
        System.out.println("Introduce el tercer número");
        int C = scanner.nextInt();
        if ((B-A==1 && C-B==1) || (B-C==1 && A-B==1)) {
            System.out.println("Los números son consecutivos");
        }else{
            System.out.println("Los números no son consecutivos");
        }
    }
}
