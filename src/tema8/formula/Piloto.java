package tema8.formula;

import java.sql.Date;

public class Piloto {
    private int idPiloto;
    private String codigo;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String url;

    public Piloto() {
        idPiloto = 0;
        codigo = "";
        nombre = "";
        apellido = "";
        fechaNacimiento =  new java.sql.Date(System.currentTimeMillis());
        nacionalidad = "";
        url = "";
    }

    public Piloto(int idPiloto,  String codigo, String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String url ) {
        this.idPiloto = idPiloto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.url = url;
    }

    public int getIdPiloto() {return idPiloto;}
    public void setIdPiloto(int idPiloto) {this.idPiloto = idPiloto;}
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public Date getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(Date fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    public String getNacionalidad() {return nacionalidad;}
    public void setNacionalidad(String nacionalidad) {this.nacionalidad = nacionalidad;}
    public String getUrl() {return url;}
    public void setUrl(String url) {this.url = url;}

    @Override
    public String toString() {
        return "\n- Piloto: " + nombre + " " + apellido +
                "\nID: " + idPiloto +
                "\nCódigo de piloto: " + codigo +
                "\nFecha de nacimiento: " +  fechaNacimiento +
                "\nNacionalidad: " + nacionalidad +
                "\nURL: " + url;
    }
}
