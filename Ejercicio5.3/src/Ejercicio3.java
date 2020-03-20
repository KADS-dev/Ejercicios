/*
Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */

import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int suma = 0;

        //Se llena la primera matriz
        System.out.println("\"Primera matriz\"");
        for (int i = 0; i < 3; i++){
            System.out.println("Ingresa los numeros de la fila " + (i+1) +": ");
            for (int j = 0; j < 3; j++){
                matriz1[i][j] = sc.nextInt();
            }
        }

        //Se llena la segunda matriz
        System.out.println("\"Segunda matriz\"");
        for (int i = 0; i < 3; i++){
            System.out.println("Ingresa los numeros de la fila " + (i+1) +": ");
            for (int j = 0; j < 3; j++){
                matriz2[i][j] = sc.nextInt();
            }
        }

        //Se suman los elementos de las matrices
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                suma += matriz1[i][j];
                suma += matriz2[i][j];
            }
        }

        //Se muestra la suma de los elementos de las matrices
        System.out.println("La suma de los elementos de las matrices es: " + suma);

    }

}
