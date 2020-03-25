/*
Ídem una versión que calcule el máximo de tres dígitos
 */

import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int a, b, c;

        System.out.println("Ingresa el numero a: ");
        a = sc.nextInt();
        System.out.println("Ingresa el numero b: ");
        b = sc.nextInt();
        System.out.println("Ingresa el numero c: ");
        c = sc.nextInt();

        System.out.println("El numero mayor es " + calcularMayor(a, b, c) + ".");
    }

    private static int calcularMayor(int a, int b, int c){
        if (a > b && a > c){
            return a;
        }else if (b > a && b > c){
            return b;
        }else{
            return c;
        }


    }


}
