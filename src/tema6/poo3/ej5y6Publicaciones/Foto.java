package tema6.poo3.ej5y6Publicaciones;

public class Foto implements Publicacion,  AbrirPublicacion, Reaccion {
    private String proporciones;
     public Foto(String proporcinones) {
         this.proporciones = proporciones;
     }

     @Override
    public void publicar() {
         System.out.println("Publicando foto con las proporciones... " + proporciones);
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
