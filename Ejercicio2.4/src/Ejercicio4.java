/*
Pedir numeros hasta que se teclee uno negtivo, y mostrar cuántos numeros se han introducido.
 */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){

        int numero = 0;
        int cantidadDeNumeros = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        numero = sc.nextInt();


        while(numero >= 0){
            System.out.println("Ingresa otro numero:");
            numero = sc.nextInt();
            cantidadDeNumeros++;
        }
        System.out.println("La cantidad de veces que introdujiste un nuero no negativo son: " + cantidadDeNumeros);
    }

}
