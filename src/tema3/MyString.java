package tema3;

import java.util.Scanner;

public class MyString {

// a) revMayus
    public String revCadena(String cadena) {
        StringBuilder s = new StringBuilder(cadena);
        return s.reverse().toString();
    }
    public String convMayus(String cadena) {
        return cadena.toUpperCase();
    }

    public String revMayus(String cadena) {
        if (cadena != null) {
            return null;
        }
        String invertida = revCadena(cadena);
        String resultado = convMayus(invertida);
        return resultado;
    }

// b) contVocal
    public static int contVocal(String cadena) {
        int contador = 0;
        String cadenaMinus = cadena.toLowerCase();
        for (int i = 0; i < cadenaMinus.length(); i++) {
            char letra = cadenaMinus.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }

// c) longerPalabra
    public String longerPalabra(String cadena) {
        String[] palabras = cadena.split("");
        String resultado = "";
        int maxLength = 0;
        for (String palabra : palabras) {
            if (palabra.length() > maxLength) {
                maxLength = palabra.length();
                resultado = palabra;
            }
        }
        return resultado;
    }

// d) contarInclusiones
    public static int contarInclusiones(String cadenaPrincipal, String subcadena) {

        int contador = 0;
        int indiceInicio = 0;
        int longitudSubcadena = subcadena.length();

        while ((indiceInicio = cadenaPrincipal.indexOf(subcadena, indiceInicio)) != -1) {
            contador++;
            indiceInicio += longitudSubcadena;
        }

        return contador;
    }

// e) contPalabras
    public static int contPalabras(String cadena) {
        String[] palabras = cadena.trim().split("");
        return palabras.length;
    }

// f) formatoTlf
    public String formatoTlf(String tlf) {
        StringBuilder sb = new StringBuilder();

        String pais = tlf.substring(0, 2);
        sb.append("+(").append(pais).append(")");

        String bloque1 = tlf.substring(2, 5);
        sb.append("-").append(bloque1);

        String bloque2 = tlf.substring(5, 8);
        sb.append("-").append(bloque2);

        String bloque3 = tlf.substring(8, 11);
        sb.append(bloque3);

        return sb.toString();
    }

// g) contarVocales
public static int[] contarVocales(String cadena) {
    int[] contadoresVocales = new int[5];
    String cadenaMayusculas = cadena.toUpperCase();

    for (int i = 0; i < cadenaMayusculas.length(); i++) {
        char caracter = cadenaMayusculas.charAt(i);

        switch (caracter) {
            case 'A':
                contadoresVocales[0]++;
                break;
            case 'E':
                contadoresVocales[1]++;
                break;
            case 'I':
                contadoresVocales[2]++;
                break;
            case 'O':
                contadoresVocales[3]++;
                break;
            case 'U':
                contadoresVocales[4]++;
                break;
        }
    }

    return contadoresVocales;
}

}
