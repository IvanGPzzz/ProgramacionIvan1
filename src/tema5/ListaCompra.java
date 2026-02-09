package tema5;

import java.util.HashSet;
import java.util.Set;

public class ListaCompra {
    private Set<String> productos;
    public ListaCompra() {
        productos = new HashSet<String>();
    }

    // añadir productos
    public boolean addProducto(String producto) {
        if (productos.contains(producto)) {
            System.out.println("El producto " + producto + " ya existe");
            return false;
        }
        return productos.add(producto);
    }

    // mostrar lista de productos
    public void showLista() {
        System.out.println("Lista de la compra");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }
}
