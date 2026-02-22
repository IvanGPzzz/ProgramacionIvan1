package tema6.poo3.ej4Ficha;

public class Libro extends Ficha {
    protected String autor;
    protected String editorial;

    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString(){
        return "Libro (número: " + numero + ", título: " + titulo + ", autor: " + autor + ", editorial: " + editorial + ")";
    }

    public void leerPagina(int pagina) {
        System.out.println("Leyendoo la página " + pagina + ".");
    }
}
