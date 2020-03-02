/*
Pedir un número y calcular su factorial
 */

import java.util.Scanner;
public class Ejercicio12 {

    public static void main(String[] args){

        int numero = 0;
        int factorial;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        numero = sc.nextInt();
        factorial = numero;
        for(int i = (numero-1); i > 0; i--){

            factorial = (factorial*i);

        }
        System.out.println("Factorial: " + factorial);

    }

}
