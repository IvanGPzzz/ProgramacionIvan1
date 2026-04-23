package tema7.rankingVideojuegos;

import java.io.Serializable;

public class Videojuego implements Serializable {
    private String titulo;
    private String plataforma;
    private int nota;

    public Videojuego() {
        titulo = "";
        plataforma = "";
        nota = 0;
    }
    public Videojuego(String titulo, String plataforma, int nota) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.nota = nota;
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getPlataforma() {return plataforma;}
    public void setPlataforma(String plataforma) {this.plataforma = plataforma;}
    public int getNota() {return nota;}
    public void setNota(int nota) {this.nota = nota;}

    @Override
    public String toString() {
        return  "Título: " + titulo + "\nPlataforma: " + plataforma + "\nCalificación: " + nota;
    }
}
