package tema7.rankingVideojuegos;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {
    private String titulo;
    private String plataforma;
    private int nota;

    public Videojuego() {
        titulo = "";
        plataforma = "";
        nota = 1;
    }
    public Videojuego(String titulo, String plataforma, int nota) throws NotaInvalida {
        this.titulo = titulo;
        this.plataforma = plataforma;
        setNota(nota);
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getPlataforma() {return plataforma;}
    public void setPlataforma(String plataforma) {this.plataforma = plataforma;}
    public int getNota() {return nota;}
    public void setNota(int nota) throws NotaInvalida {
        if (nota < 1 || nota > 10) {
            throw new NotaInvalida();
        }
        this.nota = nota;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return  "Título: " + titulo + "\nPlataforma: " + plataforma + "\nCalificación: " + nota;
    }
}
