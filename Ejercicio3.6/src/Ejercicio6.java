/*
Realizar un programa que nos pida un número n y nos diga cúantos números hay entre 1 y n que son primos
 */

import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Ingresa un numero:");
        numero = sc.nextInt();

        for(int i =1; i < (numero+1); i++){
            /*
            Todo numero primo tiene que cumplir con una de las siguientes condiciones:
            1°- (4*k +1)
            2°- (4*k -1)
            3°- (2)

            */

            if (((4*i) -1) < numero){
                contador++;
                System.out.println(((4*i) +1));
            }
            if (((4*i) +1) < numero){
                contador++;
                System.out.println(((4*i) -1));
            }
            if (i == 2){
                contador++;
                System.out.println(2);
            }
        }

        System.out.println("Numeros primos: " + contador + ".");
    }

}
