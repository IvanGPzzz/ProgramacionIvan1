package tema5.excepciones1;

public class Exc6 {
    public static void main(String[] args) throws Exception {

        try {
            Gato g1 = new Gato("Tom", 5);
            System.out.println(g1);



            Gato g2 = new Gato("To", 5);
            System.out.println(g2);



            Gato g3 = new Gato("Tom", -5);
            System.out.println(g3);
        }   catch (Exception ex) {
            System.err.println("\nHubo un error en la creación del gato.\n" + ex.getMessage());
        }
    }
}