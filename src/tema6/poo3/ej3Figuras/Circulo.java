package tema6.poo3.ej3Figuras;

public class Circulo extends Figura2D {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {return "Circulo (radio: " + radio + ")";}
    @Override
    public double area() {return Math.PI * radio * radio;}
    @Override
    public double perimetro() {return 2 * Math.PI * radio;}
}
