package tema4;

public class EjemploMain {
    public static void main(String[] args) {
        Ejemplo.showInfo();

        Ejemplo persona1 = new Ejemplo();
        Ejemplo persona2 = new Ejemplo("María");
        Ejemplo persona3 = new Ejemplo("Carlos", 25);

        Ejemplo.presentarme(persona1);
        Ejemplo.presentarme(persona2);
        Ejemplo.presentarme(persona3);

        persona1.saludar();
        persona2.saludarA("Ana");

        System.out.println("Edad: " + persona3.getEdad());
        persona3.setEdad(30);
        persona3.setEdad(-5);
        System.out.println("Edad final: " + persona3.getEdad());
    }
}