/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años,
y la cantidad de alumnos que miden más de 1.75
 */

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int edad;
        int edades = 0;
        int cantidadAlumntosMayores = 0;

        double altura;
        double alturas = 0;
        double cantidadAlumnosAltos = 0;

        for (int i = 0; i < 5; i++){

            System.out.println("Ingresa la edad del alumno:");
            edad = sc.nextInt();

            edades += edad;

            if (edad > 18){
                cantidadAlumntosMayores++;
            }

            System.out.println("Ingresa la altura del alumno:");
            altura = sc.nextDouble();

            alturas += altura;

            if (altura > 1.75){
                cantidadAlumnosAltos++;
            }

        }

        System.out.println("La media de edad de los alumnos es " + (edades/5) + ", la media de altura de los alumnos es "
        + (alturas/5) + ".La cantidad de alumnos mayores es de " + cantidadAlumntosMayores + ", la cantidad de alumnos altos es de "
        + cantidadAlumnosAltos);

    }

}
