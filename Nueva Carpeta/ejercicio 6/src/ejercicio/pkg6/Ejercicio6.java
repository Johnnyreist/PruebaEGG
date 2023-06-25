/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el 
programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá 
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 
5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.


 */
package ejercicio.pkg6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args)  {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num1, num2;
        char opcion = ' ';
      char confirmacion = leer.next().charAt(0);
        
        System.out.println("Ingrese el primer número entero positivo: ");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número entero positivo: ");
        num2 = leer.nextInt();
        
        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Sumar ");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. Dividir");
            System.out.println("5. Salir del programa");
            
            System.out.println("Elija una opción: ");
            opcion = leer.next().charAt(0);
            
            switch (opcion) {
                case '1':
                    System.out.println("La suma de los dos números es: " + (num1 + num2));
                    break;
                case '2':
                    System.out.println("La resta  es: " + (num1 - num2));
                    break;
                case '3':
                    System.out.println("La multiplicación  es: " + (num1 * num2));
                    break;
                case '4':
                    
                    if (num2 != 0) {
                        System.out.println("La división  es: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case '5':
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                   break;
                  
                default:
                    System.out.println("opción no valida");
                    break;
            }
        
        }
        //agregar linea de codigo enves de != distinto = a 5 &confirmacion s 
        
        while (opcion >= 5 );
          if (confirmacion == 'S' || confirmacion == 's') {
                        System.out.println("Saliendo del programa...");
                        
                        System.exit(0);
                        
                    }
                  
        
    }
    

}