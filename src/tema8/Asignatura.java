package tema8;

public class Asignatura {
    private int id;
    private String nombre;
    private String aula;
    boolean obligatoria;

    public Asignatura(){}
    public Asignatura(int id, String nombre, String profesor, String aula) {
        this.id = id;
        this.nombre = nombre;
        this.aula = aula;
        this.obligatoria = false;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getAula() {return aula;}
    public void setAula(String aula) {this.aula = aula;}
    public boolean isObligatoria() {return obligatoria;}
    public void setObligatoria(boolean obligatoria) {this.obligatoria = obligatoria;}

    @Override
    public String toString() {
        if (obligatoria) {
            return "- " + nombre + ":" +
                    "\nID: " + id +
                    "\nAula: " + aula +
                    "\nObligatoria";
        }  else {
            return "- " + nombre + ":" +
                    "\nID: " + id +
                    "\nAula: " + aula +
                    "\nOpcional";
        }

    }
}