package tema5.colecciones2.ej1Parque;

public class Serpiente extends Avistamiento {
    private double longitud;
    private String especie;
    public Serpiente(int hora, double longitud, String especie){
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }
    @Override
    public String toString(){
        return "Avistamiento a las " + hora + "\n- Especie: " + especie + "\n- Longitud: " + longitud;
    }
}
