
package integrador;

import servicio.EstudianteServicio;


public class Integrador {

  
    public static void main(String[] args) {
        EstudianteServicio escuelaService = new EstudianteServicio();
        double promedio = escuelaService.calcularPromedio();
        System.out.println("Promedio de notas del curso: " + promedio);

        String[] alumnosEncimaPromedio = escuelaService.obtenerAlumnosEncimaPromedio();
        System.out.println("Alumnos con nota mayor al promedio:");
        for (String nombre : alumnosEncimaPromedio) {
            System.out.println(nombre);
        }

        escuelaService.mostrarEstudiantesEncimaPromedio();
    }
}