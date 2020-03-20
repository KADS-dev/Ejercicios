/*
Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo (o clase)
está compuesto por cinco alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo.
Debemos mostrar al final la nota
 */

import java.util.Scanner;
public class Ejercicio16 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //El primer argumento indica el trimestre y el segundo el alumno
        int[][] grupo = new int [3][5];

        //Se llenan los datos
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("Ingresa la calificacionn del alumno " + (j+1) + "en el semestre " + (i+1));
                grupo[i][j] = sc.nextInt();
            }
        }

        //Se muestran los datos
        for (int i = 0; i < 3; i++){
            System.out.println("Semestre \"" + (i+1) + "\": ");
            for (int j = 0; j< 5; j++){
                System.out.println("Alumno \"" + (j+1) + "\": " + grupo[i][j]);
            }
        }
    }
}
