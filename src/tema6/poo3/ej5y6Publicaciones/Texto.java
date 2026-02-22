package tema6.poo3.ej5y6Publicaciones;

public class Texto implements Publicacion, Reaccion {
    private String contenido;
    public Texto(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando... " + contenido);
    }

    @Override
    public void compartir() {
        System.out.println("Publicación compartida!");
    }

    @Override
    public void comentar(String comentario) {
        System.out.println("Nuevo comentario: " + comentario);
    }
}