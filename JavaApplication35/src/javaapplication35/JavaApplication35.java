/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import entities.Dni;
import entities.Persona;

/**
 *
 * @author jonat
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
        Dni dni1 = new Dni('B', 28444214);
       
        Persona persona1 = new Persona("Pablo", "Cuello", dni1);
      
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("DNI - Serie: " + persona1.getDni().getSerie());
        System.out.println("DNI - Número: " + persona1.getDni().getNumero());
    }
}
    

