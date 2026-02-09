package tema5;

import java.util.HashSet;
import java.util.Set;

public class ListaCompra {
    private Set<String> productos;
    private Set<String> carrito;

    public ListaCompra() {
        productos = new HashSet<>();
        carrito = new HashSet<>();
    }

    //1. añadir productos
    public boolean addProducto(String producto) {
        if (productos.contains(producto)) {
            System.out.println("El producto " + producto + " ya existe");
            return false;
        }
        return productos.add(producto);
    }

    //1. mostrar lista de productos
    public void showLista() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            System.out.println("\n---LISTA DE LA COMPRA---");
            for (String producto : productos) {
                System.out.println("- " + producto);
            }
        }
    }

    //2. añadir al carrito
    public void addCarrito(String producto) {
        if(productos.contains(producto)) {
        carrito.add(producto);
        System.out.println(producto + " añadido al carrito correctamente.");
        } else {
        System.out.println("El producto '" + producto + "' no está en tu lista de la compra.");
        carrito.add(producto);
        }
    }

    //2. ver carrito
    public void showCarrito() {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("\n---CARRITO---");
            for (String producto : carrito) {
            System.out.println("- " + producto);}
        }
    }

    //ver productos en la lista que faltan en el carrito
    public void showPendientes() {
        Set<String> pendientes = new HashSet(productos);
        pendientes.removeAll(carrito);

        if (pendientes.isEmpty()) {
            System.out.println("Has añadido toda tu lista al carrito.");
        } else {
            System.out.println("\n---PRODUCTOS PENDENTES---");
            for (String producto : pendientes) {
                System.out.println("- " + producto);
            }
        }
    }
}
