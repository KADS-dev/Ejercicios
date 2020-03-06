/*
Pedir un número n, introducir n sueldos y mostrar el sueldo máximo
 */

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero;
        int sueldo;
        int sueldoMaximo = 0;

        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();

        for (int i = 0; i< numero; i++){

            System.out.println("Introduce un sueldo: ");
            sueldo = sc.nextInt();

            if(sueldo > sueldoMaximo){
                sueldoMaximo = sueldo;
            }
        }
        System.out.println("El sueldo maximo es de " + sueldoMaximo + ".");

    }

}
