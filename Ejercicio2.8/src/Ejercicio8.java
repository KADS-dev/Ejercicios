/*
Prdir un número N, y mostrar todos los números del 1 al N.
 */

import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args){

        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero:");

        numero = sc.nextInt();


        for(int i = 0; i < numero; i++){

            System.out.println(i+ 1);
        }

    }

}
