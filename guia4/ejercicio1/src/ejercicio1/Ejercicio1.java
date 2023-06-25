/*
Escribir un programa que procese una secuencia de caracteres 
ingresada por teclado y terminada en punto, y luego codifique
la palabra o frase ingresada de la siguiente manera: cada vocal 
se reemplaza por el carácter que se indica en la tabla y el resto
de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a@   
e#
i$
o%
u*


Realice un subprograma que reciba una secuencia de caracteres
y retorne la codificación correspondiente. Utilice la estructura
“según” para la transformación. 
Por ejemplo, si el usuario ingresa:Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:@y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        do {
            System.out.println("ingrese una secuencia de caracteres que termine en punto ");
            palabra = leer.next();

        } while (!palabra.endsWith("."));

    }

    public static void CODIFICADOR(String palabra) {
        String aux = "";
        for (int i = 0; i < palabra.length(); i++) {

            switch (palabra.substring(i , i+1)) {
                case "a":
                case "A":
                    aux=aux.concat(aux.substring(i,i+1));
                    break;

                default:
                    throw new AssertionError();
            }
        }

    }

    public static void saludo(String nombre) {
        System.out.println("hola " + nombre + " como estas");
    }

}
