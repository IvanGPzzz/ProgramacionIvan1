package tema2;

import java.util.Scanner;

public class T2EJ20 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce un número");
      int A = sc.nextInt();
      System.out.println("Introduce otro numero");
      int B = sc.nextInt();
      if (B>A) {
          System.out.println("Los números impares entre " + A + " y " + B + " son:");
          int impar = A + 1;
          while (impar < B) {
              if (impar % 2 != 0) {
                  System.out.println(impar);
              }
              impar++;
          }
      }else{
          System.out.println("B no es maor que A");
      }
    }
}