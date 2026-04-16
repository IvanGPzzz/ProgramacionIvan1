package tema7.funkos;

public class Funko {
    private String id;
    private String nombre;
    public String modelo;
    public double precio;
    public String fecha;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public Funko(String id, String nombre, String modelo, double precio, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }
    public Funko() {
        this.id = "";
        nombre = "";
        modelo = "";
        precio = 0;
        fecha = "";
    }

    @Override
    public String toString() {
        return  id + ", " + nombre + ", " + modelo + ", " + precio + ", " + fecha;
    }
}
