/*
Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares.
    Realizar dos versiones: una trabajando con los valores y otra trabajando con los índices.
 */

import java.util.Scanner;
public class Ejercicio13Valores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tabla1 = new int[10];
        int[] tabla2;
        int auxiliar;

        //Se llena el arreglo tabla1
        for (int i = 0; i < 10; i++){
            System.out.println("Ingresa el numero " + (i+1) + ": ");
            tabla1[i] = sc.nextInt();
            }


        //Se hace un for anidado para ordenar los valores del arreglo tabla1 de par a impar
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 9; j++){
                if(tabla1[j] % 2 != 0){
                    auxiliar = tabla1[j];
                    tabla1[j] = tabla1[j+1];
                    tabla1[j+1] = auxiliar;
                }
            }

        }

        //Se copia el arreglo tabla1 en el arreglo tabla2;
        tabla2 = tabla1;

        //Se muestra el arreglo tabla2 ya ordenado
        for(int i =0; i < 10; i++){
            System.out.println((i+1 + "- " + tabla2[i]));
        }


    }

}
