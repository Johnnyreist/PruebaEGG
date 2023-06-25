/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase");

        String frase = leer.next();
        
        System.out.println("la frase en mayusculas es: " + frase.toUpperCase());
        System.out.println("la frase en miniscla es: " + frase.toLowerCase());
                
               
    }
}
