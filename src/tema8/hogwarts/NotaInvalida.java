package tema8.hogwarts;

public class NotaInvalida extends Exception {
    private static final String mensaje = "¡Error! La nota debe estar entre 1 y 10.";

    public NotaInvalida() {
        super(mensaje);
    }
}
