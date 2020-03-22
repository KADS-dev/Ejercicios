/*
Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna.
 */

import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int[][] matriz = new int[10][10];
        int suma = 0;

        //Se llena la matriz
        for (int i = 0; i < 10; i++){
            System.out.println("Ingresa los nueros para la fila " + (i+1) + ": ");
            for (int j  = 0; j < 10; j++){
                System.out.println("Ingresa el numero " + (j+1) + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        //Sumar cada fila y mostrar el resulado
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                suma += matriz[i][j];
            }
            System.out.println("La suma de los elementos de la fila " + (i+1) + " es " + suma + ".");
            suma = 0;
        }

        //Sumar cada columna y mostrar el resultado
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                suma += matriz[j][i];
            }
            System.out.println("La suma de los elementos de la columna " + (i+1) + " es " + suma + ".");
            suma = 0;
        }
    }

}
/*
i/j 1   2   3   4   5

1   0   0   0   0   0

2   0   0   0   0   0

3   0   0   0   0   0

4   0   0   0   0   0

5   0   0   0   0   0
*/