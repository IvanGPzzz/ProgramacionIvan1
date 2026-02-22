package tema5.colecciones2.ej1Parque;

public class ManadaLobos extends Avistamiento {
    protected int cantidad;
    protected String observaciones;

    public ManadaLobos(int hora, int cantidad, String observaciones){
        super(hora);
        this.cantidad = cantidad;
        this.observaciones = observaciones;
    }
    @Override
    public String toString(){
        return "Avistamiento a las " + hora + ":\n- Cantidad de lobos: " + cantidad + "\n- Observaciones: " + observaciones;
    }
}
