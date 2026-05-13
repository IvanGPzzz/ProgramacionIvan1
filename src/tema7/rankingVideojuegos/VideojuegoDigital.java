package tema7.rankingVideojuegos;

public class VideojuegoDigital extends Videojuego {
    private String tiendaOnline;
    private double tamanoGB;

    public VideojuegoDigital(String titulo, String plataforma, int nota, String tiendaOnline, double tamanoGB) throws NotaInvalida {
        super(titulo, plataforma, nota);
        this.tiendaOnline = tiendaOnline;
        this.tamanoGB = tamanoGB;
    }

    public String getTiendaOnline() {return tiendaOnline;}
    public double getTamanoGB() {return tamanoGB;}

    @Override
    public String getTipo() {
        return "Digital";
    }

    @Override
    public String toString() {
        return super.toString() + "\nTienda: " + tiendaOnline + "\nTamano GB: " + tamanoGB;
    }
}