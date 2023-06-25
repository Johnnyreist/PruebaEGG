/*
En el servicio deberemos tener 
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla./(&)?==¡
*/
package servicio;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PeliculaServicio {
   /* tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
    
    */
 Scanner sc = new Scanner(System.in).useDelimiter("\n");
  List<Pelicula> Peliculas;
    
            public PeliculaServicio() {
        Peliculas = new ArrayList();
        }
    // Metodo Crear Alumno   
        public void crearAlumnos() {
        String cont;
       

        do {
            System.out.print("\nIngrese el nombre de pelicula: ");
            String nombre = sc.next();
            
            List<Integer> notas = new ArrayList();
            for (int i = 0; i < cant; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + " : ");
                notas.add(sc.nextInt());
            }
            
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            System.out.println(alumno);
            
            System.out.print("\nDesea crear otro alumno => (S/N) ");
            cont = sc.next();
            } while (cont.equalsIgnoreCase("S"));
        }
}

