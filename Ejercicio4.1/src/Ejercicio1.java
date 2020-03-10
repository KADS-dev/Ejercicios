/*
Leer 5 números y mostrarlos en el mismo orden introducido.
 */

import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int[] numeros = new int[5];
         int numero;

         for(int i = 0; i < 5; i++){

             System.out.println("Ingresa el numero " + (i+1) + ":");
             numero = sc.nextInt();
             numeros[i] = numero;

         }

         for(int j = 0; j< 5; j++){
             System.out.println("El numero " + (j+1) + " introducido fue: " + numeros[j]);
         }

    }

}
