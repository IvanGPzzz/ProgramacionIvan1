package tema6.poo4.ej1ITV;

public abstract class
Vehiculo {
    protected String matricula;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "vehículo con matrícula: " + matricula;
    }
}
