/*
Leer por teclado una tabla de 10 elementos enteros y una posición (entre 0 y 9). Eliminar el elemnto situado el la
posición dada sin dejar huecos.
 */

import java.util.Scanner;
public class Ejercicio12{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        int numero;
        boolean validacion = false;


        for(int i = 0; i < 10; i++){

            System.out.println("Ingresa el numero " + (i+1) + ": ");
            tabla1[i] = sc.nextInt();

        }

        System.out.println("Ingrese el numero entre el 1 y el 10 para eliminar: ");
        numero = sc.nextInt();


        tabla1[numero-1] = 00000;
        for (int i = 0; i < 9; i++){

            if(tabla1[i] == 00000){
                validacion = true;
            }

            if (validacion == false) {
                tabla2[i] = tabla1[i];
            }
            else if (validacion == true){
                tabla2[i] = tabla1[i+1];


            }

        }

        for (int i = 0; i <10; i++){
            System.out.println((i+1) + "- " + tabla2[i]);
        }

    }

}
