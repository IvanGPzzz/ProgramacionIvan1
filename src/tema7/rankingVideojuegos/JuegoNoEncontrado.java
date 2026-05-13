package tema7.rankingVideojuegos;

public class JuegoNoEncontrado  extends Exception {
    private static final String mensaje = "¡Error! Juego no encontrado";
    public JuegoNoEncontrado() {
        super(mensaje);
    }
}
