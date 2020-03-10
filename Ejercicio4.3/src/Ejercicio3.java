/*
Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y
contar el número de ceros.
 */

import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        int valorPositivos = 0;
        int cantidadPositivos = 0;
        int mediaPositivos;

        int valorNegativos = 0;
        int cantidadNegativos = 0;
        int mediaNegativos;

        int cantidadCeros = 0;

        for(int i = 0; i < 5; i++){

            System.out.println("Ingresa el numero " + (i+1) + ": ");
            numero = sc.nextInt();

            if(numero>0){
                valorPositivos += numero;
                cantidadPositivos++;
            }else if(numero<0){
                valorNegativos += numero;
                cantidadNegativos++;
            }else{
                cantidadCeros++;
            }

        }

        mediaPositivos = (valorPositivos/cantidadPositivos);

        mediaNegativos = (valorNegativos/cantidadNegativos);

        System.out.println("La media de positivos es " + mediaPositivos + ", la media de negativos es: " + mediaNegativos
        + " y la cantidad de ceros es "+ cantidadCeros + ".");

    }

}
