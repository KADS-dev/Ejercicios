/*
Diseñar una función que tenga como parámetros dos números y que calcule el máximo.
 */

import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Ingresa el primer numero: ");
        a = sc.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        b = sc.nextInt();
        System.out.println("El numero mayor es " + calcularMaximo(a, b) + ".");

    }

    private static int calcularMaximo(int a, int b){

        if (a > b){
            return a;
        }else{
            return b;
        }

    }

}
