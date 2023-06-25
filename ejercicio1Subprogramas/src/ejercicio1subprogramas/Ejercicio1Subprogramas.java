/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar,
multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben
devolver sus resultados para imprimirlos en el main. 
 */
package ejercicio1subprogramas;

import java.util.Scanner;

public class Ejercicio1Subprogramas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String respuestaconf = "";

        int opcion;
        do {
            System.out.println("---------MENU---------");
            System.out.println("INGRESE UNA OPCION");
            System.out.println("1.sumar");
            System.out.println("2.restar");
            System.out.println("3.multiplicar");
            System.out.println("4.dividir");
            System.out.println("5.SALIR");
            System.out.println("ingresa una opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("la suma es : " + funcionSumar(num1, num2));

                    break;
                case 2:
                    System.out.println("la resta de los numros es: " + funcionRestar(num1, num2));
                    break;
                case 3:
                    System.out.println("la multiplicacio de los numros es: " + funcionMultiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("la divicion de los numros es: " + funcionDividir(num1, num2));
                    break;
                    //confirmacion si desea salir
                case 5:
                    System.out.println("esta seguro de desea salir S/N");
                    //la variable es global sin valor y aca se le asigna valor
                    respuestaconf = leer.next();
                    if (respuestaconf.equalsIgnoreCase("s")) {
                        System.out.println("ADIOS!!!LO ESPERAMOS PRONTO");
                        System.exit(0);
                    } else {
                        System.out.println("ingrese otra opcion");
                    }

            }
            //el wihle es sin default y en la condicion para terminar el bucle aparte de ser menor que 5 
            // O la respuesta con el equalsignorecase negativa (de la confirmacion para salir).
        } while (opcion < 5 || respuestaconf.equalsIgnoreCase("n"));

    }
//funcion sumar.
    public static int funcionSumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
//funcion restar.
    public static int funcionRestar(int num1, int num2) {
        int resta = num1 - num2;

        return resta;
    }
//funcion mult.
    public static double funcionMultiplicar(int num1, int num2) {
        double multiplicacion = num1 * num2;

        return multiplicacion;

    }
//funcion div.
    public static double funcionDividir(int num1, int num2) {
        double division = num1 / num2;

        return division;

    }
    
}
