package tema6.poo3.ej4Ficha;

public class Revista extends Ficha {
    protected int entrega;
    protected  int anio;

    public Revista(int numero, String titulo, int entrega, int anio){
        super(entrega,titulo);
        this.entrega = entrega;
        this.anio = anio;
    }

    @Override
    public String toString(){return "Revista (número: " + numero + ", título: " + titulo + ", entrega: " + entrega + ", anio: " + anio + ")";}

    public boolean primeraEntrega(){
        return entrega == 1;
    }
}
