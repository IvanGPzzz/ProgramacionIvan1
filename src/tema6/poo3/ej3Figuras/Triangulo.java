package tema6.poo3.ej3Figuras;

public class Triangulo extends Figura2D {
    private double base, altura, lado2, lado3;

    public Triangulo(double base, double altura,  double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString() {return "Triángulo (base: " + base + ", altura: " + altura + ")";}
    @Override
    public double area() {return base*altura/2;}
    @Override
    public double perimetro() {return base+lado2+lado3;}
}
