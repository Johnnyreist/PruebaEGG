/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2;

import Servicio.ParDeNumerosServicio;
import java.util.Scanner;

/**
 *
 * @author cr
 */
public class Guia9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        int codigo;
        int password;

        do {

            System.out.println("Ingrese su codigo");
            codigo = scan.nextInt();
            System.out.println("Ingrese su contraseña");
            password = scan.nextInt();

            if (codigo != 1024 || password != 4567) {
                System.out.println("Su código o contraseña no es correcta");
            }

        } while (codigo != 1024 || password != 4567);

        System.out.println("Codigo y contraseña correcta!!");

    }

}
    
    

