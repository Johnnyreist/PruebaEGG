
package ejercicio4;

import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar
su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Ejercicio4 {

    
    public static void main(String[] args) {
        System.out.println("ingrse la cant de grados celcius");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num=leer.nextInt();
        int numF=32+(9*num/5);
        System.out.println("los grados en fahrenheit son: " + numF);
    }
    
}
