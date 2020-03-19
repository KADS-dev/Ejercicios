/*
Leer diez numeroa enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar en la posición en que
se encuentra. Si no está, indicarlo con un mensaje.
 */

import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int indice = -1;
        int auxiliar, numero;

        //Se llena el arreglo tabla1
        for (int i = 0; i < 10; i++){

            System.out.println("Ingresa el numero " + (i+1) + ": ");
            tabla1[i] = sc.nextInt();

        }

        //Se ordena el arreglo tabla1
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 9; j++){

                if (tabla1[j] > tabla1[j+1]){
                    auxiliar = tabla1[j];
                    tabla1[j] = tabla1[j+1];
                    tabla1[j+1] = auxiliar;
                }

            }
        }

        System.out.println("Ingresa un numero para buscarlo en la tabla1: ");
        numero = sc.nextInt();

        for (int i = 0; i < 10; i++){
            if (tabla1[i] == numero){
                indice = i;
            }
        }

        if (indice == -1){
            System.out.println("No se encontro el numero en el arreglo");
        }else{
            System.out.println("El numero se encontro en la posicion " + (indice+1) + " del arreglo");
        }

    }

}
