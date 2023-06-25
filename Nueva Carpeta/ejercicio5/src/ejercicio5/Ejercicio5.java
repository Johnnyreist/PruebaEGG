/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números 
al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo: ");
        int limite = sc.nextInt();
        int suma = 0;
        int contador = 0;
        
        while (suma < limite) {
            contador++;
            System.out.println("Ingrese el número #" + contador + ": ");
            int numero = sc.nextInt();
            suma += numero;
        }
        
        System.out.println("La suma de los números ingresados es: " + suma);
    }

}

