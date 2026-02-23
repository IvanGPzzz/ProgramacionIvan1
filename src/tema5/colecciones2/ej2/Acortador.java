package tema5.colecciones2.ej2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Acortador {
    private Map<String, String> urls;
    private static final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Acortador() {this.urls = new HashMap<>();}

    public String crearClave(){
        Random random = new Random();
        StringBuilder clave = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            clave.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return clave.toString();
    }

    public String addRegistro(String url){
        String clave = crearClave();
        urls.put(url, clave);
        return clave;
    }

    public String buscarUrl(String clave){
        String urlEncontrada = "La URL no existe.";
        if (urls.containsKey(clave)){
            urlEncontrada = urls.get(clave);
        }
        return urlEncontrada;
    }

    public boolean borrarUrl(String clave){
        boolean borrado = false;
        if (urls.containsKey(clave)){
            urls.remove(clave);
            borrado = true;
        }
        return borrado;
    }

    public void mostrar(){
        if  (urls.isEmpty()){
            System.out.println("No se encontraron URLs.");
        } else {
            for (Map.Entry<String, String> entry : urls.entrySet()) {
                System.out.println("Clave: " + entry.getKey() + "\nURL: " + entry.getValue());
            }
        }
    }
}
