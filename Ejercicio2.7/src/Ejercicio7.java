/*
Pedir números hasta que se introduzca uno negativo, y calcular la media
 */

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero, numerosSumados, cantidadNumeros, media;
        System.out.println("Ingresa un numero: ");

        numero = sc.nextInt();
        cantidadNumeros = 1;
        numerosSumados = numero;

        while(numero>=0){
            System.out.println("Ingresa otro  numero: ");
            numero = sc.nextInt();
            numerosSumados += numero;
            cantidadNumeros++;
        }
        System.out.println("Ingresaste un numero negativo, la media es: " + (numerosSumados / cantidadNumeros));

    }

}
