/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el 
programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario 
ingrese la palabra “No”
 */
package ejercicio2subprocesos;

import java.util.Scanner;


public class Ejercicio2Subprocesos {


    public static void main(String[] args) {
      String nombre;
      String edad;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("--------------");
        System.out.println("cantidad de personas a ingresar");
        System.out.println("--------------");
        int respuestanPersona=leer.nextInt();
        System.out.println("--------------");
        System.out.println(respuestanPersona);
        System.out.println("--------------");
    Persona( nombre, edad);
//    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas 
//ingresadas por teclado// e   indique si son mayores o menores de edad
    public static String Persona(String nombre, String edad){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("ingrese nombre de la persona ");
         nombre=leer.next();
        System.out.println("ingrese edad de la persona ");
        edad=leer.next();
        String persona= nombre.concat(edad);
        return persona;
        }
    	
    public static void mostrarPersona(String nombre, String edad){
        System.out.println("el nombre y la edad es:" + Persona( nombre, edad));
	}


 
}

