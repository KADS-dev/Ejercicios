/*
Pedir 15 números y escribir la suma total.
 */

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){

        int sumaTotal = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<15; i++){

            System.out.println("Ingresa el numero " + (i+1));

            sumaTotal += sc.nextInt();


        }
        System.out.println("La suma total es " + sumaTotal +".");
    }

}
