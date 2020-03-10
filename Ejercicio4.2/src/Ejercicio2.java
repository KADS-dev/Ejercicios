/*
Leer 5 numeros y mostrarlos en orden inverso al introducido.
 */

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int numero;

        for(int i = 0; i < 5; i++){

            System.out.println("Ingresa un numero: ");
            numero = sc.nextInt();

            numeros[i] = numero;
        }

        for(int j = 4; j > -1; j--){

            System.out.println("El numero " + (j+1) + " es:" + numeros[j]);

        }

    }

}