package ejercicioguia11teorica;

import entities.DNI;
import entities.Persona;

public class EjercicioGuia11Teorica {

    public static void main(String[] args)  {
        DNI dni1 = new DNI('A', 12345678);
       Persona persona1 = new Persona("Juan", "Pérez",dni1);
        System.out.println( persona1.toString());
       
    }
}