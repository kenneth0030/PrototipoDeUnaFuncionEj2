/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prototipodeunafuncionej2;

import java.util.Calendar;

/**
 *
 * @author kenne
 */
public class PrototipoDeUnaFuncionEj2 {

    public static int calcularEdad(int añoNacimiento) {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        int edad = añoActual - añoNacimiento;

        return edad;
        
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        System.out.println("la edad es"+ calcularEdad(2006));
    }
}
