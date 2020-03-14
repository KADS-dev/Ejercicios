/*
Leer por teclad una serie de diez números enteros, la aplicación debe indicarnos si los números están
ordenados de forma creiente, decreciente o están desordenados.
 */

import java.util.Scanner;
public class Ejerrcicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int cantidadCreciente = 0;
        int cantidadDecreciente = 0;
        String orden = "";

        //se llena el arreglo
        for(int i = 0; i < 10; i++){
            System.out.println("Ingresa el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i < 9; i++){

            if(numeros[i] > numeros[i+1]){
                cantidadDecreciente++;
            }
            if(numeros[i] < numeros[i+1]){
                cantidadCreciente++;
            }

            if(cantidadCreciente==9){
                orden = "creciente";
            }else if(cantidadDecreciente==9){
                orden = "decreciente";
            }else{
                orden = "desordenado";
            }

        }

        System.out.println("El orden es " + orden + ".");

    }

}
