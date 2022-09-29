package com.mycompany.tarea1;

/**
 *
 * @author Josimar
 */
import javax.swing.JOptionPane;

public class Tarea1 {

    public static void main(String[] args) {

        //Se declaran las variables del ejercicio 1
        int mes;
        String mesLectura;

        //Se declaran las variables del ejercicio 2
        int edad;
        String edadLectura;

        //Ejercicio numero 1
        //Se realiza el cambio a String y se hace el llamado de la solicitud
        mesLectura = JOptionPane.showInputDialog("Ingrese su numero: ");
        mes = Integer.parseInt(mesLectura);

        //Se realizan las condicionales        
        if (mes == 1) {
            System.out.println("Su mes es Enero");
            System.out.println("Pertenece al primer cuatrimestre");
        }
        if (mes == 2) {
            System.out.println("Su mes es Febrero");
            System.out.println("Pertenece al primer cuatrimestre");
        }
        if (mes == 3) {
            System.out.println("Su mes es Marzo");
            System.out.println("Pertenece al primer cuatrimestre");
        }
        if (mes == 4) {
            System.out.println("Su mes es Abril");
            System.out.println("Pertenece al primer cuatrimestre");
        }
        if (mes == 5) {
            System.out.println("Su mes es Mayo");
            System.out.println("Pertenece al segundo cuatrimestre");
        }
        if (mes == 6) {
            System.out.println("Su mes es Junio");
            System.out.println("Pertenece al segundo cuatrimestre");
        }
        if (mes == 7) {
            System.out.println("Su mes es Julio");
            System.out.println("Pertenece al segundo cuatrimestre");
        }
        if (mes == 8) {
            System.out.println("Su mes es Agosto");
            System.out.println("Pertenece al segundo cuatrimestre");
        }
        if (mes == 9) {
            System.out.println("Su mes es Setiembre");
            System.out.println("Pertenece al tercer cuatrimestre");
        }
        if (mes == 10) {
            System.out.println("Su mes es Octubre");
            System.out.println("Pertenece al tercer cuatrimestre");
        }
        if (mes == 11) {
            System.out.println("Su mes es Noviembre");
            System.out.println("Pertenece al tercer cuatrimestre");
        }
        if (mes == 12) {
            System.out.println("Su mes es Diciembre");
            System.out.println("Pertenece al tercer cuatrimestre");
        }

        //Ejercicio numero 2
        //Se realiza el cambio a String y se hace el llamado de la solicitud
        edadLectura = JOptionPane.showInputDialog("Ingrese su edad: ");
        edad = Integer.parseInt(edadLectura);

        //Se realizan las condicionales
        if (edad >= 0 && edad <= 5) {
            System.out.println("Primera Infancia");
        }

        if (edad >= 6 && edad <= 12) {
            System.out.println("Infancia");
        }

        if (edad >= 12 && edad <= 18) {
            System.out.println("Adolescencia");
        }

        if (edad >= 19 && edad <= 30) {
            System.out.println("Juventud");
        }

        if (edad >= 31 && edad <= 59) {
            System.out.println("Adultez");
        }
        if (edad > 60) {
            System.out.println("Persona Mayor");
        }

    }
}
