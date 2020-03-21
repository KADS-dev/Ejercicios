/*
Crear y cargar una tabla de tamaño 3x3, trasponerla y mostrarla.
 */

import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int auxiliar;

        //Se llena la matriz
        for (int i = 0; i < 3; i++){
            System.out.println("Ingresa los numeros de la fila " + (i+1) + ": ");
            for (int j = 0; j < 3; j++){
                System.out.println((j+1) + ": ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        //Se transpone la matriz
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < i; j++){
                auxiliar = matriz1[i][j];
                matriz1[i][j] = matriz1[j][i];
                matriz1[j][i] = auxiliar;
            }
        }
        //Se muestra la matriz
        for (int i = 0; i < 3; i++){
            System.out.println("Numeros de la fila " + (i+1) + ": ");
            for (int j = 0; j < 3; j++){
                System.out.println((j+1) + "- " + matriz1[i][j]);

            }
        }

    }

}
