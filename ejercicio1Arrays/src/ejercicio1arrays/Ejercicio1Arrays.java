/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.

Declaración y creación de un Vector
tipo[] arregloV = new tipo[Tamaño];
Declaración y creación de una Matriz
tipo[][] arregloM = new tipo[Filas][Columnas];

 */

package ejercicio1arrays;


public class Ejercicio1Arrays {

   
    public static void main(String[] args) {
     //crear vector 
        int[] cienPrimeros= new int[100];
      //llenar vector con los primeros 100
        for (int i = 0; i < 100; i++) {
            cienPrimeros[i]=100 -i;
            
        }
      
        //mostrar vector 
        for (int i = 0; i < 100; i++) {
            System.out.println(cienPrimeros[i]);
            
        }
    }
    
}
