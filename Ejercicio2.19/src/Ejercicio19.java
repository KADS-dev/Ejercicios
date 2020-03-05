/*
19- Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.
*/

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota;

        int cantidadAprobados = 0;
        int cantidadCondicionados = 0;
        int cantidadSuspendidos = 0;

        for(int i = 0; i < 7; i++){

            System.out.println("Ingresa la nota del alumno " + (i+1));
            nota = sc.nextInt();

            if(nota > 4){
                cantidadAprobados++;
            }else if(nota == 4){
                cantidadCondicionados++;
            }else{
                cantidadSuspendidos++;
            }
        }
        System.out.println("Los alumnos aprobados son " + cantidadAprobados
        + ", los alumnos condicionados son " + cantidadCondicionados
        + ", los alumnos susspendidos son " + cantidadSuspendidos);

    }
}
