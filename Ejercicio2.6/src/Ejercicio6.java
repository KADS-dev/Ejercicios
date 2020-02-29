/*
Pedir números hasta que se teclee un cero, mostrar la suma de todos los números introducidos.
 */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){

        int numeros, numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        numero = sc.nextInt();
        numeros = numero;
        while(numero != 0){

            System.out.println("Ingresa otro numero");
            numero = sc.nextInt();
            numeros+= numero;
        }
        System.out.println("Ingresaste un 0. La suma de todos los numeros introducidos es: " + numeros);

    }

}
