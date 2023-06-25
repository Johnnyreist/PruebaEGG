/*
Realizar un algoritmo que llene un vector de tamaño N con valores 
aleatorios y le pida al usuario un número a buscar en el vector. El programa mostrará 
dónde se encuentra el numero y si se encuentra repetido
 */
package ejercicio2array;

import java.util.Scanner;

public class Ejercicio2array {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("ingrese el tamaño del vector:");
        int tv = leer.nextInt();
        int[] vector = new int[tv];
         //llenamos el vector 
        for (int i = 0; i < tv; i++) {
            vector[i] = (int) (Math.random() * tv);

        }
        //mostrar vector 
        for (int i = 0; i < tv; i++) {

            System.out.println("[" + vector[i] + "]");

        }
        //pida al usuario un número a buscar en el vector
        
        System.out.print("ingrese un numero a buscar en el vector");
        int buscarVector = leer.nextInt();
        
        
//        boolean auxEncontrada = false;
//        int aux = 0;
//        for (int i = 0; i < vector.length; i++) {
//
//            if (vector[i] != buscarVector) {
//                System.out.println("ingrese otro numero a buscar no esta en el vector");
//                auxEncontrada = true;
//
//            } else {
//                auxEncontrada = true;
//                System.out.println("el numero se encontro en la posicion");

            }
        }
//        //mostrar vector 
//         for (int i = 0; i < tv; i++) {
//             
//             
//             System.out.print( "[" + vector[i] + "]" );
//             
//           
//        }

    }

}
