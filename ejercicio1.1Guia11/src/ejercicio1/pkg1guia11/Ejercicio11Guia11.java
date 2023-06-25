/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio1.pkg1guia11;

import entities.Perro;
import entities.Persona;
import java.util.Scanner;

public class Ejercicio11Guia11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("ingrese el nombre, apellido,edad,dni de la persona 1");

        Perro perro1 = new Perro("chiquito", "beagle", 9, 20);
        Perro perro2 = new Perro("fernando", "doberman", 5, 40);
        Persona persona1 = new Persona();
        persona1.setNombre(leer.next());
        persona1.setApellido(leer.next());
        persona1.setDni(leer.nextInt());
        persona1.setEdad(leer.nextInt());
        persona1.setPerro(perro2);
        Persona persona2 = new Persona("elisa","taborda",40,1092929,perro1);
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }

}
