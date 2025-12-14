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

// d)

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

// g)

}
