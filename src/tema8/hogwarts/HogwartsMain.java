package tema8.hogwarts;

public class HogwartsMain {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        operaciones.listaAsignaturas();
        operaciones.estudiantesCasa("Gryffindor");
        operaciones.mascotaEstudiante("Hermione", "Granger");
        operaciones.numEstudiantesCasa();
        operaciones.insertarAsignatura("Asignatura Nueva!", "Aula Ejemplo!", true);
        operaciones.listaAsignaturas();
        operaciones.modificarAula(1, "Aula Nueva!");
        operaciones.listaAsignaturas();
        operaciones.eliminarAsignatura("Asignatura Nueva!");
    }
}
