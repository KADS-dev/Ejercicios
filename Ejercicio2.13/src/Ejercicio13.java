/*
Pedir 10 números. Mostrar la media de los números positivos, la medeia de los números negativos y la cantidad de ceros.
*/

import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args){
        int cantidadPositivos = 0;
        int valorPositivos = 0;
        int mediaPositivos = 0;

        int cantidadNegativos = 0;
        int valorNegativos = 0;
        int mediaNegativos = 0;

        int cantidadCeros = 0;

        int numero;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Ingresa el numero " + (i+1) + ": ");
            numero = sc.nextInt();

            if(numero > 0){
                cantidadPositivos++;
                System.out.println("-Es un positivo, " + "(" + cantidadPositivos + ")");
                valorPositivos += numero;
            }else if(numero < 0){
                cantidadNegativos--;
                System.out.println("-Es un negativo, " + "(" + cantidadNegativos + ")");
                valorNegativos += numero;
            }else{
                cantidadCeros++;
                System.out.println("-Es un cero, " + "(" + cantidadCeros + ")");
            }
        }

        if(cantidadPositivos > 0){
            mediaPositivos = (valorPositivos/cantidadPositivos);
        }
        if (cantidadNegativos > 0){
            mediaNegativos = (valorNegativos/cantidadNegativos);
        }

        System.out.println("La media de los numeros positivos es: " + mediaPositivos +
                ", la media de los numeros negativos es: " + mediaNegativos + ", y la " +
                "cantidad de ceros es: " + cantidadCeros + ".");

    }
}
