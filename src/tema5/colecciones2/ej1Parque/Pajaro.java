package tema5.colecciones2.ej1Parque;

public class Pajaro extends Avistamiento {
    protected double peso;
    protected String especie;
    public Pajaro(int hora, double peso, String especie){
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }
    @Override
    public String toString(){
        return "Avistamiento a las " + hora + "\n- Especie: " + especie + "\n- Peso: " + peso;
    }
}
