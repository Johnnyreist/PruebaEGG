/*
Crear un programa que dado un número determine si es par o impar.
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese un numero entero");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("Escribir el numero es par ");
        } else {
            System.out.println("el umero no es par");
        }

    }

}
