package servicio;

import Entidades.Estudiante;

public class EstudianteServicio {

    private Estudiante[] estudiantes;

    public EstudianteServicio() {
        estudiantes = new Estudiante[8];

        // Crear los estudiantes y asignarles las notas
        estudiantes[0] = new Estudiante("Estudiante1", 8.5);
        estudiantes[1] = new Estudiante("Estudiante2", 7.2);
        estudiantes[2] = new Estudiante("Estudiante3", 6.8);
        estudiantes[3] = new Estudiante("Estudiante4", 9.0);
        estudiantes[4] = new Estudiante("Estudiante5", 7.9);
        estudiantes[5] = new Estudiante("Estudiante6", 8.7);
        estudiantes[6] = new Estudiante("Estudiante7", 6.5);
        estudiantes[7] = new Estudiante("Estudiante8", 8.9);
    }

    public double calcularPromedio() {
        double sumaNotas = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.length;
    }

    public String[] obtenerAlumnosEncimaPromedio() {
        double promedio = calcularPromedio();
        int contador = 0;

        // Contar cuántos estudiantes tienen una nota mayor al promedio
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                contador++;
            }
            // Crear un arreglo para almacenar los nombres de los estudiantes
            String[] alumnosEncimaPromedio = new String[contador];

            // Guardar los nombres de los estudiantes con nota mayor al promedio
            int index = 0;
            for (Estudiante[] estudiante : estudiantes  ) {
                if (estudiante.getNota() > promedio) {{
                if (estudiante.getNota() > promedio) {
                    alumnosEncimaPromedio[index] = estudiante.getNombre();
                    index++;
                }
            }

            return alumnosEncimaPromedio;
        }
    

    public void mostrarEstudiantesEncimaPromedio() {
        double promedio = calcularPromedio();
        System.out.println("Estudiantes con nota mayor al promedio:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                System.out.println(estudiante.getNombre() + " - Nota: " + estudiante.getNota());
            }
        }
    }
}


