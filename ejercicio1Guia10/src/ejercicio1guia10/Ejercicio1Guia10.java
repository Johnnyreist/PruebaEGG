/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ejercicio1guia10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1Guia10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
       //CREEAR EL ArrayList 
        ArrayList<String> razas = new ArrayList();
        boolean confirmacion = true;
        do {
            System.out.println("ingrese la raza del perro");
            razas.add(leer.next().toUpperCase());
            System.out.println("desea agregar otro perro S/N");
            if (leer.next().equalsIgnoreCase("N")) {
                confirmacion = false;

            }
        } while (confirmacion);
        //MOSTAR NO MANIPULAR LA LISTA CON FOREACH
        for (String raza : razas) {
            System.out.println(raza);
        }

        System.out.println(razas);
        //ELIMINAR 
        System.out.println("ingrese un perro a eliminar");
        String perroAEliminar = leer.next();
        boolean noEncontrado= true;
        
        Iterator it=razas.iterator();// SOLO PARA AGREGAR O QUITAR
        while (it.hasNext()) {
            if (it.next().equals(perroAEliminar )) {
                it.remove();
                noEncontrado=false;
            }
        }
        if (noEncontrado) {
            System.out.println("NO se encontro el perro");
        }
        System.out.println("...............");
        Collections.sort(razas);
          for (String raza : razas) {
            System.out.println(raza);
        }
    }

}
/*
        Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista
 */
