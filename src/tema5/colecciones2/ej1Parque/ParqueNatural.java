package tema5.colecciones2.ej1Parque;

import java.util.ArrayList;
import java.util.List;

public class ParqueNatural {
    private List<Avistamiento> avistamientos;
    public ParqueNatural() {
        this.avistamientos = new ArrayList<>();
    }
    public void addAvistamiento(Avistamiento a) {
        avistamientos.add(a);
    }

    public void diurnos() {
        System.out.println("Avistamientos diurnos (08:00-20:00)");
        for (Avistamiento a : avistamientos) {
            if (a.getHora() >= 8 || a.getHora() <= 20) {
                System.out.println(a);
            }
        }
    }

    public void nocturnos() {
        System.out.println("Avistamientos nocturnos");
        for (Avistamiento a : avistamientos) {
            if (a.getHora() >= 20 || a.getHora() <= 8) {
                System.out.println(a);
            }
        }
    }

    public void showSerpientes() {
        System.out.println("Listado de serpientes:");
        for (Avistamiento a : avistamientos) {
            if (a instanceof Serpiente) {
                System.out.println(a);
            }
        }
    }

    public void showPajaros() {
        System.out.println("Listado de pajaros:");
        for (Avistamiento a : avistamientos) {
            if (a instanceof Pajaro) {
                System.out.println(a);
            }
        }
    }

    public void showManadas() {
        System.out.println("Listado de manadas:");
        for (Avistamiento a : avistamientos) {
            if (a instanceof ManadaLobos) {
                System.out.println(a);
            }
        }
    }
}
