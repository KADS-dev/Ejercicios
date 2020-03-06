/*
Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
Suspenso < 4.
 */

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int calificacion;
        boolean suspendido = false;
        for (int i = 0; i < 5; i++){

            System.out.println("Ingresa una calificacion: ");
            calificacion = sc.nextInt();

            if(calificacion < 4){
                suspendido = true;
            }
        }
        if(suspendido == false) {
            System.out.println("No hay alumnos suspendidos.");
        }else{
            System.out.println("Hay al menos un alumno suspendido.");
        }


    }

}
