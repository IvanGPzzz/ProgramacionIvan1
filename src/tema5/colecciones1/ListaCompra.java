package tema5.colecciones1;

import java.util.HashSet;
import java.util.Set;

public class ListaCompra {
    private Set<String> lista;
    private Set<String> carrito;

    public ListaCompra() {
        lista = new HashSet<>();
        carrito = new HashSet<>();
    }

    /*public String toString() {
        System.out.println("\n---LISTA DE LA COMPRA---");
        for (String producto : lista) {
            System.out.println("- " + producto);
        }
    }*/

    //1. añadir productos
    public boolean addProducto(String producto) {
        if (lista.contains(producto)) {
            System.out.println("\nEl producto " + producto + " ya existe");
            return false;
        }
        return lista.add(producto);
    }

    //1. mostrar lista de productos
    public void showLista() {
        if (lista.isEmpty()) {
            System.out.println("\nNo hay productos en la lista.");
        } else {
            System.out.println("\n---LISTA DE LA COMPRA---");
            for (String producto : lista) {
                System.out.println("- " + producto);
            }
        }
    }

    //4. añadir al carrito
    public void addCarrito(String producto) {
        if(lista.contains(producto)) {
        carrito.add(producto);
        System.out.println("\n" + producto + " añadido al carrito correctamente.");
        } else {
        System.out.println("\nEl producto '" + producto + "' no está en tu lista de la compra.");
        carrito.add(producto);
        }
    }

    //4. ver carrito
    public void showCarrito() {
        if (carrito.isEmpty()) {
            System.out.println("\nEl carrito está vacío.");
        } else {
            System.out.println("\n---CARRITO---");
            for (String producto : carrito) {
            System.out.println("- " + producto);}
        }
    }

    //4. ver productos en la lista que faltan en el carrito
    public void showPendientes() {
        Set<String> pendientes = new HashSet(lista);
        pendientes.removeAll(carrito);

        if (pendientes.isEmpty()) {
            System.out.println("\nHas añadido toda tu lista al carrito.");
        } else {
            System.out.println("\n---PRODUCTOS PENDENTES---");
            for (String producto : pendientes) {
                System.out.println("- " + producto);
            }
        }
    }
}
