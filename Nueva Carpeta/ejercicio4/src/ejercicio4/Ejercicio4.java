/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Substring y equals() de Java.
 */
package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("infrese una frase o palabra");
        String frase= leer.next();
       
                if (frase.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("CORRECTO " + "la primera letra es una A ");
            
            
        }else{
            System.out.println("INCORRECTO " + "la primer letra NO es una A " );
        }
    }
    
}
