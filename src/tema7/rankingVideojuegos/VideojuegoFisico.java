package tema7.rankingVideojuegos;

import tema8.hogwarts.NotaInvalida;

public class VideojuegoFisico extends Videojuego {
    private String tiendaFisica;
    private String estado;

    public VideojuegoFisico(String titulo, String plataforma, int nota, String tienda, String estado) throws NotaInvalida {
        super(titulo, plataforma, nota);
        this.tiendaFisica = tienda;
        this.estado = estado;
    }

    public String getTienda() {return tiendaFisica;}
    public void setTienda(String tienda) {this.tiendaFisica = tienda;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}

    @Override
    public String getTipo() {
        return "FÍsico";
    }

    @Override
    public String toString() {
        return super.toString() + "\nTienda: " + tiendaFisica + "\nEstado: " + estado;
    }
}
