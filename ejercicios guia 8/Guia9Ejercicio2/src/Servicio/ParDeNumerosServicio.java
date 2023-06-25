/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author cr
 */
public class ParDeNumerosServicio {

    ParDeNumeros numeros = new ParDeNumeros();

    public void mostrarValores() {
        System.out.println("Numero1= " + numeros.getNum1());
        System.out.println("Numero2= " + numeros.getNum2());

    }

    public Double devolverMayor() {
        if (numeros.getNum1() >= numeros.getNum2()) {
            return numeros.getNum1();
        } else {
            return numeros.getNum2();
        }
    }

    public void calcularPotencia() {

        numeros.setNum1((double) Math.round(numeros.getNum1()));
        numeros.setNum2((double) Math.round(numeros.getNum2()));
        Double resultado;
        if (numeros.getNum1() >= numeros.getNum2()) {
            resultado = Math.pow(numeros.getNum1(), numeros.getNum2());
        } else {
            resultado = Math.pow(numeros.getNum2(), numeros.getNum1());
        }

        System.out.println(numeros.getNum1());
        System.out.println(numeros.getNum2());
        System.out.println("El numero mayor elevado al menor es " + resultado);
    }

    public void calcularRaiz() {

        numeros.setNum1((double) Math.round(numeros.getNum1()));
        numeros.setNum2((double) Math.round(numeros.getNum2()));
        Double resultado;
        if (numeros.getNum1() <= numeros.getNum2()) {
            resultado = Math.sqrt(numeros.getNum1());
        } else {
            resultado = Math.sqrt(numeros.getNum2());
        }
        System.out.println(numeros.getNum1());
        System.out.println(numeros.getNum2());
        System.out.println("La raiz cuadrada del número menor es " + resultado);
    }
}
