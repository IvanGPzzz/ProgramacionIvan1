package tema7.ficheros;

public class Persona {
        public String nombreCompleto;

        public String getNombreCompleto() {return nombreCompleto;}
        public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}

        public Persona(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }
        public Persona() {nombreCompleto = "";}

        @Override
        public String toString() {
            return nombreCompleto;
        }
}
