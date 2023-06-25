/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnosService {

    public ArrayList<Alumno> crearAlumnos() {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList();
        boolean confirmacion = true;
        do {
            Alumno alumno = new Alumno();
            System.out.println("ingrese el nombre");
            alumno.setNombre(leer.next());
            System.out.println("ingrese las notas");
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("desea ingresar otro? S/N");
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacion = false;

            }
        } while (confirmacion);

        return alumnos;
    }
    public buscarAlumno(ArrayList<Alumno> alumnos){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("ingrese el alumno q desea calcular la nota");
        String alumnoABuscar = leer.next();
          Iterator<Alumno> it= alumnos.iterator();
          
          while (it.hasNext()) {
            Alumno alumno=it.next();
              if (alumnoAuxiliar.getNombre().equalsIgnoreCase(alumnoABuscar)) {
                    return promedio(al umnoAuxiliar); 
              }
        }
          
    }
    public double promedio(Alumno alumno){
       double sumaNotas=0;
        
        for (Integer nota:alumno.getNotas()) {
            sumaNotas+=nota;
        }
        return sumaNotas/alumno.getNotas().size();
    }
}