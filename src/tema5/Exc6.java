package tema5;

public class Exc6 {
    public static void main(String[] args) throws Exception {

        try {
            Gato g1 = new Gato("Tom", 5);
            g1.showGato();
        } catch (Exception ex) {
            System.err.println("\nHubo un error en la creación del gato.\n" + ex.getMessage());
        }

        try {
            Gato g2 = new Gato("To", 5);
            g2.showGato();
        }  catch (Exception ex) {
            System.err.println("\nHubo un error en la creación del gato.\n" + ex.getMessage());
        }

        try {
            Gato g3 = new Gato("Tom", -5);
            g3.showGato();
        }   catch (Exception ex) {
            System.err.println("\nHubo un error en la creación del gato.\n" + ex.getMessage());
        }
    }
}
