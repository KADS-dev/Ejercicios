/*
Utilizando dos tablas de tamaño 5x9 y 9x5, cargar la primera y transponerla en la segunda.
 */

import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[5][9];
        int[][] matriz2 = new int[9][5];

        //Se llena la primera matriz
        for (int i = 0; i < 5; i++){
            System.out.println("Ingresa los numeros de la fila " + (i+1) + ": " );
            for (int j = 0; j < 9; j++){

                System.out.println( (j+1) + "- ");
                matriz1[i][j] = sc.nextInt();

            }
        }

        //Se transpone la primera matriz en la segunda
        for (int i = 0; i < 5; i++){

            for (int j = 0; j < 9; j++){

                matriz2[j][i] = matriz1[i][j];

            }
        }

        //Se muestra la matriz2
        for (int i = 0; i < 9; i++){
            System.out.println("Fila " + (i+1) + (": "));
            for (int j = 0; j < 5; j++){

                System.out.println((j+1) + "- " + matriz2[i][j]);

            }
        }



    }

}
