package tema5.colecciones2.ej1Parque;

public abstract class Avistamiento {
    protected int hora;
    public Avistamiento(int hora) {
        this.hora = hora;
    }
    public int getHora() {
        return hora;
    }

    @Override
    public abstract String toString();
}
