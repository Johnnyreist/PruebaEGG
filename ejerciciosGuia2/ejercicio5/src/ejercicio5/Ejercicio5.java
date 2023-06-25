/*
Escribir un programa que lea un número entero por teclado 
y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un numero entero");
        int numEntero = leer.nextInt();
        System.out.println("el doble es: " + numEntero * 2);
        System.out.println("el triple es: " + numEntero * 3);
        System.out.println("la raiz cuadrada es: " + Math.sqrt(numEntero));

    }

}
