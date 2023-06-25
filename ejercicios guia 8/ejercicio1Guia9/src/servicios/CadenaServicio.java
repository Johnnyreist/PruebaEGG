
package servicios;

import entidades.Cadena;


public class CadenaServicio {
    public void mostrarVocales(Cadena cadena) {
        String frase = cadena.getFrase().toLowerCase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public void invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida.append(frase.charAt(i));
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }

    public void vecesRepetido(Cadena cadena, String letra) {
        String frase = cadena.getFrase().toLowerCase();
        char caracter = letra.toLowerCase().charAt(0);
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }
        System.out.println("El caracter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(Cadena cadena, String frase) {
        int longitud1 = cadena.getLongitud();
        int longitud2 = frase.length();
        if (longitud1 > longitud2) {
            System.out.println("La primera frase es más larga.");
        } else if (longitud1 < longitud2) {
            System.out.println("La segunda frase es más larga.");
        } else {
            System.out.println("Las frases tienen la misma longitud.");
        }
    }

    public void unirFrases(Cadena cadena, String frase) {
        String nuevaFrase = cadena.getFrase() + " " + frase;
        System.out.println("La frase resultante es: " + nuevaFrase);
    }

    public void reemplazar(Cadena cadena, String letra, String reemplazo) {
        String frase = cadena.getFrase().replace(letra, reemplazo);
        System.out.println("La frase resultante es: " + frase);
    }

    public boolean contiene(Cadena cadena, String letra) {
        return cadena.getFrase().toLowerCase().contains(letra.toLowerCase());
    }
}
