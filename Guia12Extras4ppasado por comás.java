/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12extras4;

import guia12extras4.entidades.Estudiante;
import guia12extras4.entidades.PersonalServicio;
import guia12extras4.entidades.Profesor;

/**
 *
 * @author Usuario
 */
public class Guia12Extras4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante e1 = new Estudiante("Programacion","Lardo","Baigorri",33333333,"Soltero y FELIZ");
        Profesor p1 = new Profesor("Matematicas",2020,"ABC123","Jose Luis","Elisseche",22222222,"Casado y TRISTE");
        PersonalServicio ps1 = new PersonalServicio("Biblioteca",2021,"XYZ987","Daniel","Parra",11111111,"Viudo Y MAS FELIIIZ QUE LARDO");
        System.out.println(e1.toString());
        System.out.println("******************");
        System.out.println(p1.toString());
        System.out.println("******************");
        System.out.println(ps1.toString());
        System.out.println("******************");
        System.out.println("----------------------------------");
        e1.nuevoCurso("Abogacia");
        p1.cambioDepartamento("Ingenieria");
        p1.cambioEstado("SOOOOOOOLTEEEROOOOOO");
        ps1.cambioAsignacion("Mantenimiento");
        System.out.println(e1.toString());
        System.out.println("******************");
        System.out.println(p1.toString());
        System.out.println("******************");
        System.out.println(ps1.toString());
        System.out.println("******************");
        
        
    }
    
}




//• Cambio del estado civil de una persona.


//• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
//que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.