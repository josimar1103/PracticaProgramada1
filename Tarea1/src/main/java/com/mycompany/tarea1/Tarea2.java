package com.mycompany.tarea1;

/**
 *
 * @author Josimar
 */
import javax.swing.JOptionPane;

public class Tarea2 {

    public static void main(String[] args) {

        //Variables Ejercicio 1
        int cantidadVueltas = 10;
        int cantidadPits = 10;
        int tiempoVuelta = 0;
        int tiempoPits = 0;
        int promedioVueltas = 0;
        int promedioPits = 0;
        int porcentajePits = 0;

        //Ejercicio 1
        //Se condiciona a la cantidad de vueltas
        for (int i = 1; i <= cantidadVueltas; i++) {
            String tiempoVueltaLec = JOptionPane.showInputDialog("Ingrese el tiempo de la vuelta: ");
            tiempoVuelta = Integer.parseInt(tiempoVueltaLec);
            String tiempoPitsLec = JOptionPane.showInputDialog("Ingrese el tiempo en pits: ");
            tiempoPits = Integer.parseInt(tiempoPitsLec);

            //Operaciones para llegar a los resultados solicitados
            promedioVueltas = promedioVueltas + tiempoVuelta + tiempoPits;
            promedioPits = promedioPits + tiempoPits;
            porcentajePits = promedioPits * 100;                  

        }
        
        //Se imprimen los datos que se solicitan
        System.out.println("El promedio de las vueltas fue: " + promedioVueltas / cantidadVueltas);
        System.out.println("El promedio de los pits fue: " + promedioPits / cantidadPits);
        System.out.println("El porcentaje en pits por vuelta es: " + porcentajePits / promedioVueltas);

        //Ejercicio 2
        //Variables Ejercicio 2
        int cantidadEstudiantes;
        int promedioEstaturas = 0;
        int pesos1 = 0;
        int pesos2 = 0;
        int pesos3 = 0;
        int pesos4 = 0;
        int pesos5 = 0;

        String cantidadEstudiantesLec = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes");
        cantidadEstudiantes = Integer.parseInt(cantidadEstudiantesLec);
        for (int i = 1; i <= cantidadEstudiantes; i++) {
            String pesoLectura = JOptionPane.showInputDialog("Ingrese el peso: ");
            int peso = Integer.parseInt(pesoLectura);

            promedioEstaturas = promedioEstaturas + peso;

            if (peso < 100) {
                pesos1 = pesos1 + 1;
            }

            if (peso >= 100 && peso <= 120) {
                pesos2 = pesos2 + 1;
            }
            if (peso >= 121 && peso <= 130) {
                pesos3 = pesos3 + 1;
            }
            if (peso >= 131 && peso <= 140) {
                pesos4 = pesos4 + 1;
            }
            if (peso > 140) {
                pesos5 = pesos5 + 1;
            }

        }
        System.out.println("Estudiantes que pesan menos de 100: " + pesos1);
        System.out.println("Estudiantes que pesan entre 100 y 120: " + pesos2);
        System.out.println("Estudiantes que pesan entre 121 y 130: " + pesos3);
        System.out.println("Estudiantes que pesan entre 131 y 140: " + pesos4);
        System.out.println("Estudiantes que pesan mas de 140: " + pesos5);
        System.out.println("El promedio de las pesos es: " + promedioEstaturas / cantidadEstudiantes);

    }
}
