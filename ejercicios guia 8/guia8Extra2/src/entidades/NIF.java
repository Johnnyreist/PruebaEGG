
package entidades;

import java.util.Scanner;


public class NIF{
    private long dni;
    private char letra;
 
    private static final char[] LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 
        
        'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public NIF() {}

    public NIF(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void crearNif() {
        // Pedir al usuario el DNI
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        long dni = scanner.nextLong();
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }

    public void mostrar() {
        System.out.printf("%08d-%c", dni, letra);
    }

    public static char calcularLetra(long dni) {
        int resto = (int) (dni % 23);
        return LETRAS[resto];
    }
}