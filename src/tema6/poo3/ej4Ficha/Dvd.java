package tema6.poo3.ej4Ficha;

public class Dvd extends Ficha {
    protected String director;
    protected int anio;
    protected String genero;

    public Dvd(int numero, String titulo, String director, int anio, String genero){
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "DVD (número: " + numero + ", título: " + titulo + ", director: " + director + ", anio: " + anio + ", genero: " + genero + ")";
    }

    public void reproducir(){
        System.out.println("Reproduciendo" + titulo + ".");
    }
}
