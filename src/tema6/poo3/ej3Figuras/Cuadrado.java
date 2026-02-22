package tema6.poo3.ej3Figuras;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String toString() {return "Cuadrado (lado: " + base +")";}
}
