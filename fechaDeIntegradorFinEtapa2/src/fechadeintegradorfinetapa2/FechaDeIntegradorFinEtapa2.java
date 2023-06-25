/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechadeintegradorfinetapa2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class FechaDeIntegradorFinEtapa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la fecha de inicio de curso (dd/MM/yyyy): ");
      
        String input = leer.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(input);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 85);
        Date fechaSalida = calendar.getTime();
        System.out.println("TE TOCA RENDIR EL INTEGRADOE EL: " + sdf.format(fechaSalida));
        System.out.println("SUERTE!!!");
    }
}