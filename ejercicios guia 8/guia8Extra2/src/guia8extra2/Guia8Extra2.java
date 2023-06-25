
package guia8extra2;

import entidades.NIF;
import java.util.Scanner;


public class Guia8Extra2 {

  
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto NIF con el constructor que recibe el número de DNI
        NIF nif1 = new NIF(12345678L);
        nif1.mostrar(); // debería imprimir "12345678-Z"

        // Crear un objeto NIF con el constructor por defecto y el método crearNif
        NIF nif2 = new NIF();
        nif2.crearNif(); // pedir el número de DNI al usuario
        nif2.mostrar(); // imprimir el NIF calculado

        // Cambiar el número de DNI y calcular la letra correspondiente
        System.out.print("Introduce un nuevo número de DNI: ");
        long nuevoDni = scanner.nextLong();
        nif1.setDni(nuevoDni);
        nif1.setLetra(NIF.calcularLetra(nuevoDni));
        nif1.mostrar(); // mostrar el nuevo NIF

        scanner.close();
    }
}