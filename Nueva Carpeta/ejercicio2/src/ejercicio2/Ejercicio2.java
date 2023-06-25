/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un
mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
*/
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase");
        String frase=leer.next();
      
       
        if (frase.equals("eureka")) {
            System.out.println("la frase coinside");
        }else{
            System.out.println("la frase no coinside ");
        }
        
        
                
                
                
                
                
                
    }
    
}
