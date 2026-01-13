package tema4;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj();
        Reloj reloj2 = new Reloj(22,45,12);

        System.out.println("El primer reloj marca: " +  reloj1);
        System.out.println("El segundo reloj marca: " +  reloj2);
    }
}
