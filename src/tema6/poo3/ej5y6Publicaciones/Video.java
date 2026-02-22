package tema6.poo3.ej5y6Publicaciones;

public class Video implements Publicacion, AbrirPublicacion, Reaccion {
    private int definicion;
    public Video(int definicion) {
        this.definicion = definicion;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando foto con la definición... " + definicion);
    }
    @Override
    public void compartir() {
        System.out.println("Publicación compartida!");
    }
    @Override
    public void abrir() {
        System.out.println("Pantalla completa");
    }
    @Override
    public void comentar(String comentario) {
        System.out.println("Nuevo comentario: " + comentario);
    }
}
