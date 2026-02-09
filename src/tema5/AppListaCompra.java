package tema5;

import java.util.Scanner;

public class AppListaCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCompra mylist = new ListaCompra();
        String entrada;

        System.out.println("Introduce los productos que desea añadir a la lista ('salir' para acabar)");

        while (true) {
            entrada = sc.nextLine();
            if ("salir".equals(entrada)) {
                break;
            }
            mylist.addProducto(entrada);
        }

        mylist.showLista();
    }
}
