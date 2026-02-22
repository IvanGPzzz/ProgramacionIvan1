package tema6.poo3.ej4Ficha;

public abstract class Ficha {
    protected double numero;
    protected String titulo;

    public Ficha(double numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    @Override
    public abstract String toString();
}
